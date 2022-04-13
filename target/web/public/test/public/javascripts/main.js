const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';



function generateString() {
    console.log("In the function");
    let result = ' ';
    const charactersLength = characters.length;
    for ( let i = 0; i < 8; i++ ) {
        result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    return result;
};

window.onload=function(){
    document.getElementById("hiddenId").style.visibility = "hidden";
    var mb = document.getElementById("submitbtn");
    mb.addEventListener("click", checkCookie);
    console.log("In the window after loading");
};

function setCookie(id){
    console.log("setcokkie id "+id);
    const date = new Date();
    date.setTime(date.getTime() + (365 * 24 * 60 * 60 * 1000));
    var expires = "expires="+date.toUTCString();
    document.cookie = "sessionId="+id+";"+expires+";path=/";
};

function getCookie(){
    let name = "sessionId=";
    let spli = document.cookie.split(';');
    for(var j=0;j < spli.length; j++){
        let char = spli[j];
        while(char.charAt(0) == ' ') {
            char = char.substring(1);
        }
        if(char.indexOf(name) == 0) {
            return char.substring(name.length, char.length);
        }
    }
    id = "";
    console.log("getcookie id "+id);
    return id;
};

function checkCookie() {
    var id = getCookie();
    console.log("id "+id);
    if(id != ""){
        console.log("checkcookie id if not null"+id);
        //alert(id);
        document.getElementById("hiddenId").value = id
    }
    else{
        id = generateString();
        console.log("checkcookie id "+id);
        if(id != "" && id != null){
            setCookie(id);
        }
    }
};