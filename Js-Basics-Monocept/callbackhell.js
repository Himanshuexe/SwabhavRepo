const todos = (resource, callback) => {
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
    request.open("GET", resource);
    request.send();
}
todos("himanshu.json", (data) => {
    console.log(data);
    todos("abhishek.json", (data) => {
        console.log(data);
        todos("vineet.json", (data) => {
            console.log(data);
        }
        )
    })
});