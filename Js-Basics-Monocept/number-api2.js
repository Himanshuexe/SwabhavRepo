window.onload = function () {
    localStorage.clear();
};

const searchButton = document.querySelector('#searchNumber');
searchButton.addEventListener("keyup", (e) => {
    var text = document.querySelector('#searchNumber input').value;

    if (e.keyCode === 13) {
        if (searchInLocalStorage(text)) {
            if (text.trim() === "") {
                alert("Please Enter a Number")
            }
            else {
                var url = "http://numbersapi.com/" + text
                fetch(url).then(data => {
                    //   console.log("hey", data);
                    return data.text();
                })
                    .then(data => {
                        console.log(typeof data);
                        const now = new Date;
                        addData = data + ", " + dateFns.format(now, 'MMMM D YYYY HH:mm:ss');
                        localStorage.setItem(text, addData);
                        addResult(addData);
                        //   alert("hey")
                    }).catch(error => {
                        console.log(error)

                    })
                // const searchurl = `http://numbersapi.com/${searchNumber}`;
                // request.open("GET", searchurl);
                // request.send();
                // const date = new Date;
                // timeNow = date.getTime();
                // const timesearch = document.querySelector("#myInput").value;
                // const timestamp = localStorage.getItem(timesearch);
                // console.log(timestamp);
                // timeBefore = timestamp.getItem;
                // console.log(timeBefore);
                // const resString = document.querySelector("#timeStamp")
                // let rs = dateFns.distanceInWords(timeNow, timeBefore, { addSuffix: true });
                // resString.innerText = `Searched: ${rs}`;

            }
        }
    }

})

function searchInLocalStorage(text) {


    var value = localStorage.getItem(text);
    if (value == null) {
        return true;
    }
    else {


        var prevtime = value.split(",");
        const now = new Date;
        const before = new Date(prevtime[prevtime.length - 1]);

        alert("you searched this " + dateFns.distanceInWords(now, before, { addSuffix: true }));
        // console.log(dateFns.distanceInWords(now, before, { addSuffix: true }) + "-------------")
        // console.log(dateFns.distanceInWords(now, before, { addSuffix: true })+"----------");
        // console.log(now.getFullYear()+ "-------------")
        return false;
    }
}


const addResult = (text) => {
    // var searchNumber = document.querySelector('#searchNumber input').value;
    // const request = new XMLHttpRequest();
    // request.onload = () => {

    //     // Process our returned data
    //     if (request.status >= 200 && request.status < 300) {
    //         console.log(request.responseText);
    //         var now = new Date();
    //         var timestamp = now.toLocaleTimeString();
    //         var result = ` ${request.responseText}, ${timestamp}`;

    document.querySelector('#results').innerHTML += `
                    <div class="result">
                        <span id="resultstring">
                       ${text}
                        </span>
                        <button class="delete">
                            <i class="fa-solid fa-trash-can"></i> 
                        </button>
                    </div>`;

    var current_tasks = document.querySelectorAll(".delete");
    for (var i = 0; i < current_tasks.length; i++) {
        current_tasks[i].onclick = function () {
            this.parentNode.remove();
        }
    }

}



