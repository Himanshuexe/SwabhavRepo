let users = [{
    userName: 'HimanshuS31',
    userPw: 'himanshu31'
},
{
    userName: 'Abhishek12',
    userPw: 'abhishek1234'
}, {
    userName: 'Rohan',
    userPw: '1rohan'
}];

window.onload = function () {
    localStorage.clear();
    localStorage.setItem("users", JSON.stringify(users));
    const data = localStorage.getItem("users");
    const userData = JSON.parse(data);
    console.log(data);
    console.log(userData);
};

const button = document.getElementById('login_btn');

button.addEventListener('click', () => {
    var userName1 = document.getElementById('userName').value;
    var userPw1 = document.getElementById('userPw').value;

    let user_records = new Array();
    user_records = JSON.parse(localStorage.getItem("users"));
    console.log(user_records);
    if (user_records.some((v) => { return v.userName == userName1 && v.userPw == userPw1 })) {
        alert("Login Pass");
    }
    else {
        alert('Login Fail');
    }
    // var value = localStorage.getItem(userName);
    // console.log(value);
    // if (value == userPw) {
    //     alert("Logged in successully");
    //     console.log(localStorage.getItem(userName))
    // } else {
    //     alert("Wrong password entered!!");
    // }
});
