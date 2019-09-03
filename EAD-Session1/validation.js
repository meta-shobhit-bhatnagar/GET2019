function empFormValidation(){

    var flag= true;
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var confirm_password = document.getElementById("confirm_password").value;
    var number = document.getElementById("number").value;



    //Name Validation
    if(name.length < 2){
        var message= "Name must be atleast 2 characters";
        document.getElementById("eName").innerHTML= message;
        flag=false;
    }else if(!name.match(/^[a-zA-Z ]+$/)){
        var message= "Name should contain alphabets only";
        document.getElementById("eName").innerHTML= message;
        flag=false;
    }else{
        document.getElementById("eName").innerHTML="";
    }

    //Email Validation
    if(!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email))){
        var message= "You have entered Invalid emailID";
        document.getElementById("eEmail").innerHTML= message;
        flag=false;
    }else{
        document.getElementById("eEmail").innerHTML= "";
    }

    //Password Validation
    if(password.length < 8){
        var message= "Password length should be atleast 8";
        document.getElementById("ePassword").innerHTML = message;
        flag = false;
    }else if(!(/^(?=.*\d)(?=.*[a-zA-Z])[a-zA-Z0-9]+$/.test(password))){
        var message = "Password should be at least One Upper and One Lower case and one digit";
        document.getElementById("ePassword").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("ePassword").innerHTML = "";
    }

    //Confirm Validation
    if(password != confirm_password){
        var message= "Password not matching!";
        document.getElementById("eConfirmPassword").innerHTML = message;
        flag = false;
    }else{
        document.getElementById("eConfirmPassword").innerHTML = "";
    }

    //Phone Number Verification
    if(number.length < 10){
        var message = "Phone number should be 10 digits";
        document.getElementById("eContactNo").innerHTML = message;
        flag = false;
    }else if (!(/^[0-9]+$/.test(number))) {
        var message = "Phone number must contain only numeric value";
        document.getElementById("eContactNo").innerHTML = message;
        flag = false;
    }
    else {
        document.getElementById("eContactNo").innerHTML = "";
    }


    return flag;
}