let ws = new WebSocket("ws://localhost:9000/ws");
let jsonStorage = {};
let recentKeywords = '';
var url = new URL(window.location.href);

let queryword = url.searchParams.get("searchPhrase");

ws.onopen = () => {
    console.log('WebSocket opened');
    searchKeywords();
    let table = document.getElementById(queryword);
};

ws.onmessage = function (msg) {
    console.log("WebSocket message received");
    let data = JSON.parse(msg.data);
    let projects = data.result[0];
    document.getElementById("FLINDEX").innerHTML = data.result[2].FL_Index;
    document.getElementById("FKGL").innerHTML = data.result[4].FKGL;
    let table = document.getElementsByClassName(queryword);
    addResultToPage(table,projects,data);
}

function addResultToPage(table,projects,data){
    for(x in projects){
        let row = document.getElementsByClassName(queryword+x);
        let cell1 = document.getElementById("o_id"+queryword+x);

        let onwer_id_link = document.createElement('a');
        onwer_id_link.setAttribute('href', "/profilePage/" + projects[x].owner_id);
        onwer_id_link.setAttribute("target", "_blank");
        onwer_id_link.innerHTML = projects[x].owner_id;

        cell1 = onwer_id_link;

        let cell2 = document.getElementById("date"+queryword+x);
        cell2.innerHTML = projects[x].date;

        let cell3 = document.getElementById("title"+queryword+x);
        cell3.innerHTML = projects[x].title;

        let cell4 = document.getElementById("type"+queryword+x);
        cell4.innerHTML = projects[x].type;

        let cell5 = document.getElementById("skill"+queryword+x);
        let utag = document.createElement('u');
        for(y in projects[x].skills){
            let skillname = Object.keys(projects[x].skills[y])[0];
            let skillid = Object.values(projects[x].skills[y])[0];

            let skill_link = document.createElement('a');
            skill_link.setAttribute('href', "/skill/" + skillid);
            skill_link.setAttribute("target", "_blank");
            skill_link.innerHTML = skillname+" ";

            utag.appendChild(skill_link);
        }
        while(cell5.hasChildNodes()){
            cell5.removeChild(cell5.lastChild);
        }
        cell5.appendChild(utag);

        let cell6 = document.getElementById("indv"+queryword+x);
        let indvstat_link = document.createElement('a');
        indvstat_link.setAttribute('href', "/indvstats/" + queryword + "/"+x);
        indvstat_link.setAttribute("target", "_blank");
        indvstat_link.innerHTML = "Stats";
        cell6 = indvstat_link;

        cell7 = document.getElementById("edlevel"+queryword+x);
        cell7.innerHTML = data.result[3].Ed_Level;

        console.log(projects[x]);
    }
}

let keywordsInput = document.getElementById('query');

function searchKeywords() {
    ws.send(JSON.stringify({
        type: "searchPhrase",
        data: queryword
    }));
    recentKeywords = queryword;
}

window.addEventListener('beforeunload', function (e) {
    ws.close();
});
