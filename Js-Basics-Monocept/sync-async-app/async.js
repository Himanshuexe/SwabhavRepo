const helloButton = document.querySelector('#hello');
helloButton.addEventListener('click', e => {
    console.log("Hello");
    alert("hello");
});

const printButton = document.querySelector('#print');
printButton.addEventListener('click', () => {
    var worker = new Worker('print.js');
    worker.onmessage = function (event) {
        console.log(event.data);
    }
});