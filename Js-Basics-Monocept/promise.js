const dosomething = () => {
    return new Promise((resolve, reject) => {
        resolve("data recieved");
        reject("data could not be fetched");
    });
};

// dosomething().then((data) => {
//     console.log(data);
// }, (err => {
//     console.log(err);
// }))

dosomething().then((data) => {
    console.log(data)
}).catch((err) => {
    console.log(err);
});