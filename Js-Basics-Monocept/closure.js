// function outerFunction(outerVariable) {
//     return function innerFunction(innerVariable) {
//         console.log(outerVariable);
//         console.log(innerVariable);
//     }
// }

const outerFunction = outerVariable => {
    const outMore = "Hello";
    return innerVariable => {
        console.log(outerVariable);
        console.log(innerVariable);
        console.log(outMore);
    }
}

const myFunction = outerFunction("outside");

myFunction("inside");