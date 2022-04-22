const myDiv = document.querySelector('div');

var button1 = document.createElement('BUTTON');
var text1 = document.createTextNode("Red");
button1.appendChild(text1);
myDiv.appendChild(button1);
button1.onclick = function () {
    document.body.style.backgroundColor = "red";
};

var button2 = document.createElement('BUTTON');
var text2 = document.createTextNode("Yellow");
button2.appendChild(text2);
myDiv.appendChild(button2);
button2.onclick = function () {
    document.body.style.backgroundColor = "yellow";
};