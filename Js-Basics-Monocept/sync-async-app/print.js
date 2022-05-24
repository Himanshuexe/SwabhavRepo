while (true) {
    var currentDate = new Date();
    postMessage(currentDate.getHours() + ":" + currentDate.getMinutes() + ":" + currentDate.getSeconds());
}