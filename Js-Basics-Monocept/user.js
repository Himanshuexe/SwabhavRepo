export default class User {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

export const printName = function (user) {
    console.log(`User name is ${User.name}`);
}

export const printAge = function (user) {
    console.log(`User age is ${User.age}`);
}
