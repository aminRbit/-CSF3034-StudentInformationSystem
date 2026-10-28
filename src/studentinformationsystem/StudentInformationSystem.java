/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/********************************
* Author: Amin Rafid bin Ashari
* Program Name:StudentInformationSystem.java
* Description: To learn how to use git and github
* Date: 28 October 2026
* Modified Date: none
* Version: 1.0
*******************************/
//Standard public class
public class StudentInformationSystem {

   //Standard main method
    public static void main(String[] args) {
        //Display my name
        System.out.println("Name: Amin Rafid bin Ashari"); 
        //Display my student ID
        System.out.println("Student ID: S87311"); 
        int mark1 = 15;
        int mark2 = 7;
        int totalMarks = mark1 + mark2;
        System.out.println("Your total mark is: "+ totalMarks); 
        if (totalMarks >= 90){
             System.out.println("Excellent"); 
        }
        else if (totalMarks >= 40){
             System.out.println("Good"); 
        }
        else{
             System.out.println("Needs improvement"); 
        }
                
    }
    
}
