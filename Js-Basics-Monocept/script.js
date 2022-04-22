
// let email = "indiaismyiscountry@gmail.com";
// console.log(email.toUpperCase());
// index = email.indexOf('@');
// console.log(index);

// const after = email.substring(index + 1);
// console.log(after);

// index = email.indexOf('country');
// let endIndex = index + "country".length;

// let result = email.slice(index, endIndex);
// console.log(result);

// let repalcedStr = email.replace('is', 'IS');//replaces only the first occurance.
// console.log(repalcedStr);

// let repalcedAllStr = email.replaceAll('is', 'IS');//replaces all the occurances.
// console.log(repalcedAllStr);

// let title = "Indian Cooking Secrets";
// let author = "Himanshu";
// let likes = 500;

// let tempStr = `Blog on ${title} by ${author} has ${likes} likes.`;
// console.log(tempStr);

// let players = ["Sachin", "Virat", "Rohit"];
// console.log(players);

// console.log(players.length);

// // console.log(players.toString().replaceAll(',', '-'));
// console.log(players.join('-'));

// let newPlayers = ["Pant", "Dinesh"];
// players = players.concat(newPlayers);
// console.log(players);

// players.push("Ishan");
// console.log(players);

// let age;
// console.log(age);
// console.log(age + 10);

// let age = null;
// console.log(age);
// console.log(age + 10);

// function greet() {
//     console.log("Good Morning.");
// }
// greet();

// const greet = function () {
//     console.log("Good Night");
// }
// greet();

// const speed = function (distance, time) {
//     console.log("your speed was: " + distance / time);
// }
// speed(50, 2);

////Day 2

// const myFunc = function (callback) {
//     let value = 80;
//     callback(value + 10);
// }
// let callback = function (val) {
//     console.log(val);
// }

// myFunc(callback);

// const myFunc = callback => {
//     let value = 80;
//     callback(value + 20);
// }

// myFunc(val => {
//     console.log(val);
// });

// let players = ["Sachin", "Virat", "Rohit"];

// players.forEach(function (player) {
//     console.log(player);
// });

// players.forEach(player => {
//     console.log(player);
// });

// let employee = {
//     name: "Himanshu",
//     email: "himanshu@gmail.com",
//     age: 21,
//     projects: ["insurance app", "finance app"],
//     login: function () {
//         console.log("Employee logged in.");
//     },
//     logout: () => {
//         console.log("Employee logged out.");
//     },
//     logProjects: function () {
//         console.log("List of Projects:");
//         this.projects.forEach(project => {
//             console.log(project);
//         });
//     }
// };

// console.log(employee);
// console.log(employee.name);
// console.log(employee.email);
// console.log(employee.age);
// console.groupCollapsed(employee.projects);
// employee.login();
// employee.logout();
// employee.logProjects();

// let projects = [
//     {
//         title: "insurance app",
//         users: 200000
//     },
//     {
//         title: "finance app",
//         users: 400000
//     },
//     {
//         title: "movie store app",
//         users: 20000
//     }
// ];

// projects.forEach(project => {
//     console.log(project.title + " | Users: " + project.users);
// });

// let employee = {
//     name: "Himanshu",
//     email: "himanshu@gmail.com",
//     age: 21,
//     projects: [
//         {
//             title: "insurance app",
//             users: 200000
//         },
//         {
//             title: "finance app",
//             users: 400000
//         },
//         {
//             title: "movie store app",
//             users: 20000
//         }
//     ],
//     login: function () {
//         console.log("Employee logged in.");
//     },
//     logout: () => {
//         console.log("Employee logged out.");
//     },
//     logProjects: function () {
//         console.log("Name: " + employee.name + "\nE-mail: " + employee.email + "\nAge: " + employee.age);
//         console.log("List of Projects:");
//         this.projects.forEach(project => {
//             console.log(project.title + " | Users: " + project.users);
//         });
//     }
// };

// employee.logProjects();

// let value = 20.657;

// let round = Math.round(value);
// console.log(round);
// let upper = Math.ceil(value);
// console.log(upper);
// let lower = Math.floor(value);
// console.log(lower);
// let integerVal = parseInt(value);
// console.log(integerVal);
// let random = parseInt(Math.random() * 100 + 1);
// console.log(random);

// const h3ref = document.querySelectorAll("h3");

// console.log(h3ref);
// h3ref.forEach(heading => {
//     // console.log(heading.textContent + " more.");
//     console.log(heading.innerText + " more.");
// })

// const playerList = document.querySelector('ul');

// console.log(playerList);

// let players = ["Sachin", "Virat", "Rohit"];

// let html = ``;
// players.forEach(player => {
//     html += `<li>  ${player} </li>`;
// });
// playerList.innerHTML += html;

// const links = document.querySelector('div');

// let websites = [
//     ["Google", "https://www.google.co.in/"],
//     ["Facebook", "https://www.facebook.com/"],
//     ["W3schools", "https://www.w3schools.com/"],
//     ["JavaPoint", "https://www.javatpoint.com/"]
// ];

// let html = ``;
// websites.forEach(website => {
//     html += `<a href= ${website[1]}> ${website[0]}</a><br>`;
// });

// links.innerHTML += html;

// const para = document.querySelector('div.error');

// console.log(para.textContent);



//

// const link = document.querySelector('a');

// console.log(link.getAttribute('href'));

// link.setAttribute("href", "https://www.facebook.com/");
// link.innerText = "Facebook";
// link.setAttribute("class", "error");

// const pr = document.querySelector('p');

// console.log(pr.classList);
// pr.classList.remove("error");
// pr.classList.add("success");

// const pref = document.querySelectorAll('p');

// pref.forEach(p => {
//     if (p.innerText.includes("error")) {
//         p.classList.add('error');
//     }
//     if (p.innerText.includes("success")) {
//         p.classList.add('success');
//     }
// });

// const title = document.querySelector('h1');

// title.addEventListener('click', () => {
//     title.classList.toggle('success');
// });

// const inputText = document.querySelector("#input1");
// const para = document.querySelector('p');

// myButton.addEventListener("click", () => {
//     var inputText = document.querySelector("#input1");
//     para.innerText = inputText.value;
// })
// inputText.addEventListener("input", () => {
//     var letters = /^[A-Za-z]+$/;
//     if (inputText.value.match(letters))
//         para.innerText = inputText.value;
// })

// const article = document.querySelector('article');

// console.log(article.children);

// Array.from(article.children).forEach(element => {
//     console.log(element);
// });

// const para = document.querySelector('p');

// console.log(para.parentElement);
// console.log(para.parentElement.parentElement);
// console.log(para.parentElement.parentElement.parentElement);

// console.log(para.nextElementSibling);
// console.log(para.previousElementSibling);

// const now = new Date();

// str = `Today's date : ${now.getDate()}- ${now.getMonth() + 1}-${now.getFullYear()} `;
// console.log(str);

// console.log(now.getTime());
// console.log(now.toDateString());
// console.log(now.toTimeString());
// console.log(now.toLocaleDateString());

// const now = new Date("April 8 2022 11:35:50");
// const before = new Date("February 20 2022 7:30:59");
// const diffTime = Math.abs(now - before);
// const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));

// console.log("Last login " + diffDays + " days ago.");


// const startTime = () => {
//     const today = new Date();
//     let h = today.getHours();
//     let m = today.getMinutes();
//     let s = today.getSeconds();
//     m = checkTime(m);
//     s = checkTime(s);
//     document.querySelector('#hrs').innerHTML = h;
//     document.querySelector('#mins').innerHTML = m;
//     document.querySelector('#secs').innerHTML = s
// }

// function checkTime(i) {
//     if (i < 10) {
//         i = "0" + i
//     };
//     return i;
// }

// setInterval(startTime, 1000);

// var a = moment('7/11/2010', 'M/D/YYYY');
// var b = moment('12/12/2010', 'M/D/YYYY');
// var diffDays = b.diff(a, 'days');
// // alert(diffDays);
// console.log(moment().format('MMMM Do YYYY, h:mm:ss a'));
// console.log(moment("20120620", "YYYYMMDD").fromNow());
// const now = new Date();
// const before = new Date("February 20 2022 7:30:59");

// console.log(dateFns.isToday(now));
// console.log(dateFns.isToday(before));
// console.log(dateFns.format(now, 'do MMMM YYYY'));
// console.log(dateFns.distanceInWords(now, before, { addSuffix: true }));

// console.log(1);
// console.log(2);
// console.log(3);
// console.log(4);
// setInterval(() =>
//     console.log("callback function called"),
//     3000);

// console.log(5);
// console.log(6);
// console.log(7);
// console.log(8);
// console.log(9);
// console.log(10);
// console.log(11);


const button1 = document.querySelector('#btn1');
const button2 = document.querySelector('#btn2');

const wait = () => {
    const now = new Date();
    const stop = now.getTime() + 5000;
    while (true) {
        if (now.getTime() > stop) return;
    }
}

button1.addEventListener('click', wait());

button2.addEventListener('click', () => {
    console.log("Button 2 clicked.");
});

// const greet = () => {
//     console.log("Hi");
// };

// const showAlert = () => {
//     alert("Danger");
// };

// setTimeout(showAlert, 2000);
// greet();
// greet();
// greet();
// greet();
// greet();