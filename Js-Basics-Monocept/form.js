const form = document.querySelector('form');

const validateEmail = () => {
    const email = document.getElementById('uEmail').value;
    var emailRe = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (emailRe.test(email)) {

    } else {
        alert("Email Invalid");
    }
}

const validateFirstName = () => {
    const fName = document.getElementById('fname').value;
    var letters = /^[A-Za-z]+$/;
    if (letters.test(fName)) {
        // return true;
    }
    else {
        alert("First Name invalid")
    }
}
const validateLastName = () => {
    const lName = document.getElementById('lname').value;
    var letters = /^[A-Za-z]+$/;
    if (letters.test(lName)) {
        // return true;
    }
    else {
        alert("Last Name invalid")
    }
}


const validateUsername = () => {
    const userName = document.getElementById('userName').value;
    var usernameRe = /^[a-zA-Z0-9]+$/;
    if (usernameRe.test(userName)) {
        // return true;
    } else {
        alert("Username Invalid");
    };
}

const validatePassword = () => {
    const password = document.getElementByIdAll('password').value;
    var passwordRe = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    if (passwordRe.test(password)) {

    } else {
        alert("invalid Password.");
    };

}
form.addEventListener('submit', () => {
    validateEmail();
    validateFirstName();
    validateLastName();
    validateUsername();
    validatePassword();
})
