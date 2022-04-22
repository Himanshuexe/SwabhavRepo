const Questions = [{
    id: 0,
    q: "What is capital of India?",
    a: [{ text: "Gandhinagar", isCorrect: false },
    { text: "Surat", isCorrect: false },
    { text: "Delhi", isCorrect: true },
    { text: "Mumbai", isCorrect: false }
    ]

},
{
    id: 1,
    q: "What is the capital of Canada?",
    a: [{ text: "Toronto", isCorrect: false, isSelected: false },
    { text: "Vancouver", isCorrect: false },
    { text: "Montreal", isCorrect: false },
    { text: "Ottawa", isCorrect: true }
    ]

},
{
    id: 2,
    q: "What is the capital of Gujarat",
    a: [{ text: "Surat", isCorrect: false },
    { text: "Vadodara", isCorrect: false },
    { text: "Gandhinagar", isCorrect: true },
    { text: "Rajkot", isCorrect: false }
    ]

},
{
    id: 3,
    q: "What is the currency of Japan",
    a: [{ text: "Dollar", isCorrect: false },
    { text: "Rupee", isCorrect: false },
    { text: "Yen", isCorrect: true },
    { text: "Pound", isCorrect: false }
    ]

}

]

var start = true;
var selected = "";
var result = document.getElementsByClassName("result");

function iterate(id) {

    const question = document.getElementById("question");


    question.innerText = Questions[id].q;

    const op1 = document.getElementById('option1');
    const op2 = document.getElementById('option2');
    const op3 = document.getElementById('option3');
    const op4 = document.getElementById('option4');


    op1.innerText = Questions[id].a[0].text;
    op2.innerText = Questions[id].a[1].text;
    op3.innerText = Questions[id].a[2].text;
    op4.innerText = Questions[id].a[3].text;

    op1.value = Questions[id].a[0].isCorrect;
    op2.value = Questions[id].a[1].isCorrect;
    op3.value = Questions[id].a[2].isCorrect;
    op4.value = Questions[id].a[3].isCorrect;


    op1.addEventListener("click", () => {
        op1.style.backgroundColor = "lightgoldenrodyellow";
        op2.style.backgroundColor = "white";
        op3.style.backgroundColor = "white";
        op4.style.backgroundColor = "white";
        selected = op1.value;
    })

    op2.addEventListener("click", () => {
        op1.style.backgroundColor = "white";
        op2.style.backgroundColor = "lightgoldenrodyellow";
        op3.style.backgroundColor = "white";
        op4.style.backgroundColor = "white";
        selected = op2.value;
    })

    op3.addEventListener("click", () => {
        op1.style.backgroundColor = "white";
        op2.style.backgroundColor = "white";
        op3.style.backgroundColor = "lightgoldenrodyellow";
        op4.style.backgroundColor = "white";
        selected = op3.value;

    })

    op4.addEventListener("click", () => {
        op1.style.backgroundColor = "white";
        op2.style.backgroundColor = "white";
        op3.style.backgroundColor = "white";
        op4.style.backgroundColor = "lightgoldenrodyellow";
        selected = op4.value;
    })

    // const evaluate = document.getElementsByClassName("evaluate");

    // evaluate[0].addEventListener("click", () => {
    //     if (selected == "true") {
    //         result[0].innerHTML = "Correct answer";
    //         result[0].style.color = "#00ea00";
    //     } else {
    //         result[0].innerHTML = "Incorrect answer";
    //         result[0].style.color = "#ff3200";
    //     }
    // })
}

if (start) {
    iterate("0");
}

const next = document.getElementsByClassName('next')[0];
var id = 0;
var score = 0;
next.addEventListener("click", () => {
    start = false;
    id++;
    if (id < 4) {
        iterate(id);
        if (selected == "true") { score += 1; }
        console.log(id);
        console.log(score);
    } else {
        alert("Your Score is " + score);
        result.innerHTML = `<h4>Your Score: ${score} </h4>
                            <button id="button" onclick="location.reload()">Play Again</button>`
    }
})
