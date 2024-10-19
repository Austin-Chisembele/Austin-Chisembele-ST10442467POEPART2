/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activtity.registrations;

/**
 *
 * @author RC_Student_lab
 */

import java.util.List;
/*
*********************  External POE File ***************************************
********************************************************************************
********************************************************************************
*/
class Task {

/*
**********************  Part 2 POE *********************************************
********************************************************************************
********************************************************************************
*/
    private static int taskCounter = 0;
    private final String taskName;
    private final String taskDescription;
    private final String developerDetails;
    private final int taskDuration;
    private final String taskStatus;

    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        taskCounter++;
        this.taskStatus = taskStatus;
    }
    
   
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    //Method to create the task ID
    public String createTaskID() {
        String initials = taskName.substring(0, 2).toUpperCase();
        String devLastThree = developerDetails.split(" ")[1].substring(0, 3).toUpperCase();
        return initials + ":" + (taskCounter - 1) + ":" + devLastThree;
    }
    
//Method to print the task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + (taskCounter - 1) + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + createTaskID() + "\n" +
               "Duration: " + taskDuration + " hrs";
    }
    //Method to return the total combined hours of all tasks(Farrell, 2022).
    public static int returnTotalHours(List<Task> tasks) {
        int total = 0;
        for (Task task : tasks) {
            total += task.taskDuration;
        }
        return total;
    }
   
    public int getreturnTotalHours() {
        return taskDuration;
    }
    
}
/*
********************  End of Part 2 POE ****************************************
********************************************************************************
********************************************************************************
*/
