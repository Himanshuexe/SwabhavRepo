let gender = ""
const table = document.querySelector("table");
fetch("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students").then((response) => {
    // console.log("request resolved", response.json());
    return response.json();
}).then((data) => {
    data.forEach((data, index) => {
        console.log(data);
        if (data.isMale == true) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        table.innerHTML += `<tr><td>${index + 1}</td><td>${data.name}</td><td>${data.age}</td><td>${data.rollNo}</td><td>${data.id}</td><td>${data.date}</td><td>${data.email}</td><td>${data.gender}</td></tr>`
    });
    // console.log(data);
}).catch((error) => {
    console.log("request rejected", error);
})
