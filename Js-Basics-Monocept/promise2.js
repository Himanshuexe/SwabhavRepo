const todos = (resource) => {
    return new Promise((resolve, reject) => {
        const request = new XMLHttpRequest();

        request.addEventListener('readystatechange', () => {
            if (request.readyState == 4 && request.status == 200) {
                // console.log(request, request.readyState);
                const data = JSON.parse(request.responseText);// converting JSON data to JS objects
                resolve(data);
            } else if (request.readyState == 4) {
                // console.log("Could not fetch data");
                // callback("Data not recieved", undefined);
                reject("data could not be recieved")
            }
        });

        // request.open("GET", "https://jsonplaceholder.typicode.com/todos/");
        request.open("GET", resource);
        request.send();
    });
};

todos("himanshu.json").then((data) => {
    console.log("Himanshu's Data:")
    console.log(data);
    return todos("abhishek.json");
}).then((data) => {
    console.log("Abhishek's Data:")
    console.log(data);
    return todos("vineet.json");
}).then((data) => {
    console.log("Vineet's Data:")
    console.log(data);
}).catch((err) => {
    console.log(err);
});