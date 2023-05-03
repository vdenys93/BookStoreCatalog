document.addEventListener('DOMContentLoaded', function() {
    var bookForm = document.querySelector("#bookForm");
    if (bookForm) {
        bookForm.addEventListener('submit', function(event) {
            if (!validateBookForm()) {
                event.preventDefault();
            }
        });
    }
});

function validateBookForm() {
    var title = document.querySelector("#title").value;
    var genre = document.querySelector("#genre").value;
    var authorFirstName = document.querySelector("#authorFirstName").value;
    var authorLastName = document.querySelector("#authorLastName").value;

    if (title === "" || genre === "" || authorFirstName === "" || authorLastName === "") {
        alert("All fields must be filled out.");
        return false;
    }
    return true;
}
