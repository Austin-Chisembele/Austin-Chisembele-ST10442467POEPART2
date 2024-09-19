/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.registrations;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

//Create Main Class for Registration(Farrell, 2022).
public class Registrations{
public static void main(String[] args) {
    
    String user;
    String password;
    String name;
    String surName;
    
//Display the Information for the login and Registration Feature(Farrell, 2022).
    Scanner code = new Scanner(System.in);
        //Display the Information for the login and Registration Feature(Farrell, 2022).
        System.out.println("==========================================================");
        System.out.println("ST10442467 POE PART 1");
        System.out.println("Austin Chisembele Chipanta");
        System.out.println("==========================================================");
        System.out.println("Login to the Account");
        System.out.println("==========================================================");
        //Prompt the user to enter the information needed for the account(Farrell, 2022).
        System.out.print("Enter the Username:");
        user = code.nextLine();
        System.out.print("Enter the Password:");
        password = code.nextLine();
        System.out.print("Enter your First Name:");
        name = code.nextLine();
        System.out.print("Enter Your SurName:");
        surName = code.nextLine();

//Display output of the User(Farrell, 2022).
System.out.println("\r\n");
System.out.println("==========================================================");
System.out.println("=================Display Output==========================="); 
System.out.println("\r\n");
//Instance of a External login class 
Login user1 = new Login(user,  password,  name,  surName);

//Call the method called reigisterUser to the main class from the external Class(Farrell, 2022).
user1.registerUser(user,  password,  name,  surName);
System.out.println("==========================================================");
System.out.println("=================Exit Account=============================");
/*
References List

AdityaRao.2023.designing a login logout system in java a low level design approach,18 April 2023.[Online].
Available at:https://medium.com/@adityarao1501/designing-a-login-logout-system-in-java-a-low-level-design-approach-b9dfe9750045
[Accessed 30 August 2024].
 
Farrell,J.2022.Java Programming.10th ed.United States of America: Cengage learning.
 
geeksforgeeks.2023.program check strength password,26 December 2023.[Online].
Available at:https://www.geeksforgeeks.org/program-check-strength-password/
[Accessed 2 September 2024].

 
Quora.2024.How do I create a login form in Java,28 March 2024.[Online].
Available at:https://www.quora.com/How-do-I-create-a-login-form-in-Java
[Accessed 2 September 2024].
 
 
SheCodes.2024.how to create login and registration code in java,11 November 2023.[Online].
Available at:https://www.shecodes.io/athena/39971-how-to-create-login-and-registration-code-in-java
[Accessed 6 September 2024].

 
Stackoverflow.2024.Regex to validate password strength,16 March 2016.[Online].
Available at:https://stackoverflow.com/questions/5142103/regex-to-validate-password-strength
[Accessed 6 September 2024].


W3schools.2024.Java Tutorial,10 August 2024.[Online].
Available at:https://www.w3schools.com/
[Accessed 10 September 2024].
 
*/

}


}

