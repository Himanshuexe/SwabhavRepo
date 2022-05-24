const helloButton = document.querySelector('#hello');
helloButton.addEventListener('click', e => {
    console.log("Hello");
});

const printButton = document.querySelector('#print');
printButton.addEventListener('click', () => {
    while (true) {
        var currentDate = new Date();
        console.log(currentDate.getHours() + ":" + currentDate.getMinutes() + ":" + currentDate.getSeconds());
    }
});