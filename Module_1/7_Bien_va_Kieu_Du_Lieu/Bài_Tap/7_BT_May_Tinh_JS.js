function display(value){
    if (value === "="){
        document.getElementById("showOld").innerText = document.getElementById("show").value;
        document.getElementById("show").value = eval(document.getElementById("show").value);
    }else if(document.getElementById("show").value === "0"){
        document.getElementById("show").value = value;
    }else {
        document.getElementById("show").value += value;
    }
}
let equalTo = document.getElementById("equalTo");
bang.addEventListener('click', equalTo2);
function equalTo2() {
    document.getElementById("display1").innerText = document.getElementById("display2").value;
    document.getElementById("display2").value = eval(document.getElementById("display2").value);
}

let clear = document.getElementById("c");
clear.addEventListener("click", clean);
function clean() {
    document.getElementById("display2").value = "";
}

function clean2() {
    let value = document.getElementById("display2").value ;
    document.getElementById("display2").value = value.substr(0, value.length -1);
}