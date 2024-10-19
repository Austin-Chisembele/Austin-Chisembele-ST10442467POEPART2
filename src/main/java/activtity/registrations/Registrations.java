/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.registrations;

/**
 *
 * @author RC_Student_lab
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
******************************  Main POE File **********************************
********************************************************************************
********************************************************************************
*/

//Create Main Class for Registrations(Farrell, 2022).
public class Registrations{
public static void main(String[] args) {
    
    
JOptionPane.showMessageDialog(null, "POE PART 2 EasyKanban App(ST10442467 Austin)");
   
/***************************** Part 1 POE **************************************
********************************************************************************
********************************************************************************
*/
   
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
System.out.println("\n");
System.out.println("==========================================================");
System.out.println("=================Display Output===========================" ); 
System.out.println("\n");
//Instance of a External login class 
Login user1 = new Login(user,  password,  name,  surName);


//Call the method called reigisterUser to the main class from the external Class(Farrell, 2022).
user1.registerUser(user,  password,  name,  surName);
System.out.println("==========================================================");
System.out.println("=================Exit Account=============================");


/******************************End of Part 1 POE********************************
********************************************************************************
********************************************************************************
*/


/**********************************Part 2 POE **********************************
********************************************************************************
********************************************************************************
*/

 
       user = JOptionPane.showInputDialog("Enter your Username:");//kyl_1
       password = JOptionPane.showInputDialog("Enter your Password:");//Ch&&sec@ke99!
       name= JOptionPane.showInputDialog("Enter your Name:");//Austin
       surName = JOptionPane.showInputDialog("Enter your Surname:");//Chisembele
         
     
       
        if (user1.checkUserName(user) && user1.checkPasswordComplexity(password)) {
            
         //login successful display a messageDialog for the app. 
         String display="Username has been successfully recorded. \n Password was successfully obtained.\n ";
               
         JOptionPane.showMessageDialog(null,display + user1.registerUser(user,  password,  name,  surName)   );
           
         JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            
            int option;
            do {
                // Display menu option
                String menu = "Choose an option:\n1) Add Tasks\n2) Show Report\n3) Quit";
                String choice = JOptionPane.showInputDialog(menu);
                option = Integer.parseInt(choice);

                switch (option) {
                    case 1 -> attachTasks();
                    case 2 -> JOptionPane.showMessageDialog(null, "Coming Soon");
                    case 3 -> JOptionPane.showMessageDialog(null, "Exiting the application. Goodbye!");
                    default -> JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                }
            } while (option != 3);
            
        } else {
             
             String error="The format of your username is incorrect.Please make sure that it is no longer than 5 characters and includes an underscore.\n OR \n Please ensure that the password is at least 8 characters long, contains a capital letter, a number, and a special character. The password is not formatted correctly.\n Please attempt again. Password or username incorrect.\n ==========================================================\n Login Failed. ";
              JOptionPane.showMessageDialog(null,  error );
        }
        
}

     private static void attachTasks() {
         
        List<Task> tasks = new ArrayList<>();
         
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));
            
            for (int i = 0; i < numTasks; i++) {
                String taskName = JOptionPane.showInputDialog("Enter Task Name:");
                String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 chars):");
                
                if (!new Task(taskName, taskDescription, "", 0, "").checkTaskDescription()) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                    i--; // decrement i to retry
                    continue;
                }
                
                String developerDetails = JOptionPane.showInputDialog("Enter Developer Details (First Last):");
                int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (hrs):"));
                String taskStatus = (String) JOptionPane.showInputDialog(null, "Select Task Status:",
                        "Task Status", JOptionPane.QUESTION_MESSAGE, null, new String[]{"To Do", "Doing", "Done"}, "To Do");
                
                //Call the class called Task from external class
                Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
                tasks.add(task);
                 JOptionPane.showMessageDialog(null, "Tasks added successfully!");
                JOptionPane.showMessageDialog(null, task.printTaskDetails());
            }
            int totalHours = Task.returnTotalHours(tasks);
            JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
            JOptionPane.showMessageDialog(null, "Thank you for using EasyKanban!");
    }

}
/*
References List

Farrell,J.2022.Java Programming.10th ed.United States of America: Cengage learning.
 
Geeksforgeeks.2023.java joptionpane,7 November 2023.[Online].
Available at:https://www.geeksforgeeks.org/java-joptionpane/
[Accessed 4 October 2024].


Java JOptionpane.2024.java joptionpane,11 October 2024.[Online].
Available at:https://www.javatpoint.com/java-joptionpane
[Accessed 11 October 2024].


Stackoverflow.2022.printing multiple user input from a loop,30 May 2022.[Online].
Available at:https://stackoverflow.com/questions/72426601/printing-multiple-user-input-from-a-loop
[Accessed 10 October 2024].


W3schools.2024.Java Tutorial,10 August 2024.[Online].
Available at:https://www.w3schools.com/
[Accessed 18 October 2024].
 
*/


/**********************End of Part 2 POE****************************************
********************************************************************************
********************************************************************************
*/