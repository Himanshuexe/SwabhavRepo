const todos = (callback) => {
    const request = new XMLHttpRequest();

    request.addEventListener('readystatechange', () => {
        if (request.readyState == 4 && request.status == 200) {
            // console.log(request, request.readyState);
            const data = JSON.parse(request.responseText);// converting JSON data to JS objects
            callback(undefined, data);
        } else if (request.readyState == 4) {
            // console.log("Could not fetch data");
            callback("Data not recieved", undefined);
        }
    });

    // request.open("GET", "https://jsonplaceholder.typicode.com/todos/");
    // request.open("GET", "himanshu.json");
    request.open("GET", " http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students");
    request.send();
}
todos((err, data) => {
    if (err)
        console.log(err);
    else
        console.log(data);
});