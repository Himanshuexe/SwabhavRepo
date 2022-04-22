const demofunc = async () => {
    const response = await fetch("himanshu.json");
    if (response.status !== 200) {
        throw ("Could not be fetched");
    }
    const data = await response.json();
    return data;
};

demofunc().then((data) => {
    console.log(data);
}).catch((error) => {
    console.log("Rejected: ", error.message);
});