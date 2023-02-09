/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Menu.Survey;
import Main_Menu.User_Menu;
import java.util.Scanner;

/**
 *
 * @author matth
 */
//Allows user to take a survey
interface questionnaire{
    public void title();
    public void Questions();
    public void Response();}
  
public class Survey {
    User_Menu ob1 = new User_Menu();
    String Q1;      //Question 1. response
    String Q2;      //Question 2. response
    String Q3;      //Question 3. response
    String Q4;      //Question 4. response
    
    Scanner scan = new Scanner(System.in);
    
    //Lets user know they will take a survey
    public void title(){
        System.out.println("This survey is a reflection of our buisness");
        System.out.println("Please answer honestly because we take our surveys "
                + "seriously");
        System.out.println();}
    
    //Ask user questions and record responses
    public void Questions(){
        System.out.println("Question 1.");
        System.out.println("How easy is the purchasing process"
                + " with our company?");
        Q1 = scan.nextLine();
        
        System.out.println();
        System.out.println("Question 2.");
        System.out.println("How likely are you to recommend us");
                
        Q2 = scan.nextLine();
        
        System.out.println();
        System.out.println("Question 3.");
        System.out.println("Did you find our website useful?");
        Q3 = scan.nextLine();
        
        System.out.println();
        System.out.println("Question 4.");
        System.out.println("How could we improve our delivery System?");
        Q4 = scan.nextLine();
    }
    
    //Output the user reponses
    public void Response() {
        String answer;
        
        System.out.println("Responses");
        System.out.println("----------");
        
        System.out.println("Question 1.");
        System.out.println("You said:" + Q1);
        System.out.println();
        
        System.out.println("Question 2.");
        System.out.println("You said:" + Q2);
        System.out.println();
        
        System.out.println("Question 3.");
        System.out.println("You said:" + Q3);
        System.out.println();
        
        System.out.println("Question 4.");
        System.out.println("You said:" + Q4);
        System.out.println();
        
        //Give the user the ability to change their response
        //using a do-while statement
        do{
        System.out.println("Do you wish to change responses?");
        System.out.println("Enter YES to change responses"
                + " or NO to return to main menu");
        
        answer = scan.nextLine();
        
        //if yes then it lets user change response
        if(answer.equalsIgnoreCase("yes")){
            Questions(); //Question method
            Response();  //recursion
            break;}
        else if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for taking our survey!\n");
            ob1.mainMenu();
            ob1.mainMenu_choice();
            break;}
        }while(!answer.equalsIgnoreCase("yes")|!answer.equalsIgnoreCase("no"));
        
    }
    
}
