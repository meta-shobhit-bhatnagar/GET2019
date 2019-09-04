function studentFormValidation(){
	
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var fatherName = document.getElementById("fatherName").value;
    var email = document.getElementById("email").value;
    var classNo = parseInt(document.getElementById("classNo").value);
    var age = parseInt(document.getElementById("age").value);

    var flag = true;

    //first Name validation 
    if (fname.length < 2 && fname.length < 50) {
        var message = "Length of name should be min 2 character and max 50";
        document.getElementById("sfname").innerHTML = message;
        flag = false;
    } else if (!(/^[a-zA-Z ]+$/.test(fname))) {
        var message = "Name must contain alphabets only";
        document.getElementById("sfname").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("sfname").innerHTML = "";
    }

    //last Name validation
    if (lname.length < 2 && lname.length > 50) {
        var message = "Length of name should be min 2 character and max 50";
        document.getElementById("slname").innerHTML = message;
        flag = false;
    } else if (!(/^[a-zA-Z ]+$/.test(lname))) {
        var message = "Name must contain alphabets only";
        document.getElementById("slname").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("slname").innerHTML = "";
    }

    //father Name validation
    if (fatherName.length < 3) {
        var message = "Length of name should be min 2 character and max 50";
        document.getElementById("sfatherName").innerHTML = message;
        flag = false;
    } else if (!(/^[a-zA-Z ]+$/.test(fatherName))) {
        var message = "Name must contain alphabets only";
        document.getElementById("sfatherName").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("sfatherName").innerHTML = "";
    }

    //Email Validation
    if (!(/\S+@\S+\.\S+/.test(email)) || email.length >50) {
        var message = "Invalid email address";
        document.getElementById("semail").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("semail").innerHTML = "";
    }


    //Age Validation
    if(age<3 || age > 35){
        var message = "Invalid Age";
        document.getElementById("sage").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("sage").innerHTML = "";
    }

    return flag;

}

function searchFormValidation(){

    var flag = true;
   
    var firstName = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;

    //first Name validation 
    if (firstName.length < 2 && firstName.length < 50) {
        var message = "length of name should be min 2 character and max 50";
        document.getElementById("sfname").innerHTML = message;
        flag = false;
    } else if (!(/^[a-zA-Z]+$/.test(firstName))) {
        var message = "name must be in alphabet and should not contain space";
        document.getElementById("sfname").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("sfname").innerHTML = "";
    }

    //last Name validation
    if (lname.length < 2 && lname.length > 50) {
        var message = "length of name should be min 2 character and max 50";
        document.getElementById("slname").innerHTML = message;
        flag = false;
    } else if (!(/^[a-zA-Z]+$/.test(lname))) {
        var message = "name must be in alphabet and should not contain space";
        document.getElementById("slname").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("slname").innerHTML = "";
    }
    return flag;
}