fetch("himanshu1.json").then((response) => {
    // console.log("request resolved", response.json());
    return response.json();
}).then((data) => {
    console.log(data);
}).catch((error) => {
    console.log("request rejected", error);
})