const dataService = function () {
    let obj = {};

    obj.doTask1 = function () {
        console.log("Doing task 1");
    }

    obj.doTask2 = function () {
        console.log("Doing task 2")
    }

    return obj;
}();

// const ds = dataService();
dataService.doTask1();
dataService.doTask2();