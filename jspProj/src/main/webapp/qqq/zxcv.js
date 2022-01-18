function gogo(){
    alert("눌렀다1")
}
window.onload = function(){
    var btn2 = document.getElementById("btn2")
    var btn3 = document.getElementById("btn3")

    btn2.onclick = function(){
        alert("눌렀다2")
    }

    function fnGo(){
        alert("눌렀다3")
    }

    btn3.addEventListener('click',fnGo)
}