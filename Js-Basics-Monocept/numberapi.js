document.querySelector('#search').onclick = () => {
    if (document.querySelector('#searchNumber input').value.length == 0) {
        alert("Please Enter a Number")
    }

    else {
        var searchNumber = document.querySelector('#searchNumber input').value;
        const request = new XMLHttpRequest();
        request.onload = () => {

            // Process our returned data
            if (request.status >= 200 && request.status < 300) {
                console.log(request.responseText);
                var now = new Date();
                var timestamp = now.toLocaleTimeString();

                document.querySelector('#results').innerHTML += `
                    <div class="result">
                        <span id="resultstring">
                        ${request.responseText}, ${timestamp}
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

            } else {
                alert("Could not fetch the data")
            }

        };

        const searchurl = `http://numbersapi.com/${searchNumber}`;
        request.open("GET", searchurl);
        request.send();
    }
}

