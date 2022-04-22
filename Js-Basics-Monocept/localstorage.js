
// localStorage.setItem("name", "Himanshu");
// // localStorage.setItem("name", "Abhishek");
// localStorage.setItem("age", 21);
// localStorage.setItem("isAdult", true);
// console.log(localStorage);

// localStorage.removeItem("isAdult");
// console.log(localStorage);

// localStorage.clear();
// localStorage.name = "Vineet";
// console.log(localStorage);
// localStorage.clear();
const players = [
    { name: "Sachin", topScore: 200 },
    { name: "Virat", topScore: 170 },
    { name: "Dhoni", topScore: 190 }
]

localStorage.setItem("players", JSON.stringify(players));
const data = localStorage.getItem("players");
const playersData = JSON.parse(data);
console.log(playersData);