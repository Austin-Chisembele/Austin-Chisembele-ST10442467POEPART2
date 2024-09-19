/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activtity.registrations;

/**
 *
 * @author RC_Student_lab
 */


//External login class 
import java.util.regex.Pattern;

//Create a class for login(Farrell, 2022).
class Login{
//Declare the data names and make them priavte(Farrell, 2022).
private String user;
private String password;
private String name;
private String surName;

public Login(String user, String password, String name, String surName) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.surName = surName;
        
    }

 
//Create a boolean method for Check user Name(Farrell, 2022).
boolean checkUserName(String user){
//Check the username length to see if it less than 5 and includes an underscore
    return !(user.length()>5 || user.indexOf('_')==-1);
}

//Check the password complexity method and to see if the password is greater than 8
boolean checkPasswordComplexity(String password){
return password.length() >= 8 &&
               Pattern.compile("[A-Z]").matcher(password).find() &&
               Pattern.compile("\\d").matcher(password).find() &&
               Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find();
}

//Create a boolean method login user to register(Farrell, 2022).
boolean loginUser(String user,String password){
    return user.equals(this.user) && password.equals(this.password);
}


//Create a method for the LoginStatus(Farrell, 2022).
String returnLoginStatus(String user,String password){
     
if(loginUser(user, password)){
  //message is True so display the message
  String str1= "Welcome "+ name.concat("\t"+surName)+" it is great to see you again.";
   String str2="Login Successful";
return str1 +"\r\n"+"=========================================================="+"\r\n"+str2;
}else{
   //messages is False so display the message
return " Login Failed";
}
}

//Create a method for the user to register(Farrell, 2022).
String registerUser(String user, String password, String name, String surName){
//Check username format
if(checkUserName(user)){
this.user = user;
System.out.println("Username has been successfully recorded. ");
}
else{
System.out.println("The format of your username is incorrect.Please make sure that it is no longer than 5 characters and includes an underscore.");
}
//Check password complexity
if(checkPasswordComplexity(password)){
this.password = password;
System.out.println("Password was successfully obtained. ");
}
else{
System.out.println("Please ensure that the password is at least 8 characters long, contains a capital letter, a number, and a special character. The password is not formatted correctly.");
}
if(checkUserName(user) && checkPasswordComplexity(password)){
this.name = name;
this.surName = surName;
System.out.println(""+returnLoginStatus(user, password));

}else{
    System.out.println("Please attempt again. Password or username incorrect.");
    System.out.println("==========================================================");
    System.out.println("Login Failed ");
}
return returnLoginStatus(user, password);
}

}
