(function(){
    var parseData;
    var ws;
    console.log("Entered in Index.js");
    console.log("Waiting for WebSocket");
    //console.log(document.getElementById("ws-url").value);
    ws = new WebSocket($("body").data("ws-url"));
    console.log("WebSocket Created");
    ws.onmessage = function (event) {
        var message;
        message = JSON.parse(event.data);
        console.log(message);
        if(message.items) {
            parseData(message);
        }
    }

    parseData = (data) => {
        console.log(data);
        var query = data.query.replace(/ /g, '');
        repoListQuery = $("#repo-"+query);
        tableNode = document.querySelector("#repo-"+query);
        if(repoListQuery.length === 0){
            var temp="";
            temp = '<div>Top 10 Results for: ' + data.query + '<table id="repo-' + query + '"><tr><th>Owner_id</th><th>Date</th><th>Title</th><th>Type</th><th>Skills</th><th></th><th></th><th></th></tr>';
            temp += getRows(data.items);
            temp += '</table>';
            $("#repos").prepend(temp);
        }else{
            var temp = "";
            temp += '<tr><th>Owner_id</th><th>Date</th><th>Title</th><th>Type</th><th>Skills</th></tr>';
            temp += getRows(data.items);
            document.querySelector("#repo-"+query).innerHTML = temp;
        }
    };

    getRows = (dataArray) => {
        var temp = "";
        dataArray.forEach((x,i) => {
            var topics = "";
            temp += '<tr id="repochild-' + query + '"><td><a href="/' + x.getOwner_id() + '" target="_blank">' + x.getDate() + '</a></td>' +
                            '<td><a href="/' + x.getTitle() + '/' + x.getType() + '" target="_blank">';
        });
        return temp;

        return $("#searchForm").submit(function(event) {
            console.log("On Submit event called");
            event.preventDefault();
            if($("#query").val() !== '') {
                console.log("Sending WS with value " + $("#query").val());
                ws.send(JSON.stringify({
                    query: $("#query").val()
                }));
                return $("#query").val("");
            }
        });
    }
}).call(this);