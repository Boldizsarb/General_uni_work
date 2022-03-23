document.getElementById("forma").addEventListener("submit", e=> {

    let inputName = document.forms["forma"]["name"].value; // first is the [id] [form name]
    let inputEmail = document.forms["forma"]["email"].value;
    let inputScared = document.forms["forma"]["scared"].value;

    // displayign the invalid boxes:
    let isValid = true;
    let output = "";

    if(inputName.trim() == ""){
        output += "Please Enter a name<br>"; // displaying the invalid boxes or massage in case it is invalid
        //alert("Invalied Name"); // alert would be too disturbing hence a colour would be sufficent:
        document.forms["forma"]["name"].style.backgroundColor = "red";
        isValid = false
       
    }

    if(inputEmail.trim() == ""){
        output += "Please Enter an E-mail<br>";
        //alert("Invalid Email");
        document.forms["forma"]["email"].style.backgroundColor = "red";
        isValid = false
       
    }
    if(inputScared.trim()== ""){
        output += "Enter a number between 0-10, how Scared you are";
        document.forms["forma"]["scared"].value;
        isValid = false
    }
    if(inputScared.trim()>10){  // numbers between 0-10 only 
        output += "Enter a number between 0-10";
        document.forms["forma"]["scared"].value;
        isValid = false
    }
    if(inputScared.trim()<0){  // numbers between 0-10 only 
        output += "Enter a number between 0-10";
        document.forms["forma"]["scared"].value;
        isValid = false
    }
// this is working but due to the value, it lets it through 
    if(isValid == false){
        e.preventDefault();
        document.getElementById("results").innerHTML = output;
    }

});

