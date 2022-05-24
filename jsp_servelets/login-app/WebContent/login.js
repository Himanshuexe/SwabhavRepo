function myValidation(event) {
    var userName = document.querySelector("#userName").value;
    var password = document.querySelector("#password").value;
    const pass = false;
    // event.preventDefault();
    if (userName.length == 0) {
        event.preventDefault();
        alert("Enter a Username");
        pass = false;
        returnToPreviousPage();
        return pass;
    }
    if (password.length == 0) {
        event.preventDefault();
        alert("Enter Password");
        pass = false;
        returnToPreviousPage();
        return pass;
    } else {
        pass = true;
        // form.submit();
        alert("hi");
        return pass;
    }



    // if (!pass) {
    // event.preventDefault();
    // }
}

function returnToPreviousPage() {
    window.history.back();
}

const nameWarning = document.querySelector('#nameWarning');
const passWarning = document.querySelector('#passwordWarning');
const userNameInputField = document.querySelector('#userName');
const passwordInputField = document.querySelector('#password');

userNameInputField.addEventListener('input', e => {
    var name = userNameInputField.value;
    if (name.length == 0) {
        nameWarning.style.visibility = "visible";
    } else {
        nameWarning.style.visibility = "hidden";
    }
});

passwordInputField.addEventListener('input', e => {
    var pass = passwordInputField.value;
    if (pass.length == 0) {
        passWarning.style.visibility = "visible";
    } else {
        passWarning.style.visibility = "hidden";
    }
});



// var form = document.querySelector('form');
// // const submitButton = document.querySelector('#submit');
// form.addEventListener('submit', (event) => {
// var userName = document.querySelector("#userName").value;
// var password = document.querySelector("#password").value;
// const pass = false;
// if (userName.trim == "") {
// alert("Enter a Username");
// pass = false;
// event.preventDefault();
// return pass;
// }
// if (password.trim == "") {
// alert("Enter Password");
// pass = false;
// event.preventDefault();
// return pass;
// } else {
// pass = true;
// form.submit();
// alert("hi");
// return pass;
// }
// });
