/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Menu;
import Main_Menu.Furniture.*;
import Main_Menu.Survey.*;
import java.util.Scanner;

/**
 *
 * @author matth
 */
//Main menu for User
public class User_Menu {
    public void mainMenu(){
        System.out.println();
        System.out.println("Welcome to Dahl's Furniture Store");
        System.out.println("Buisness Hours: 9AM - 9PM");
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("1. Furniture");
        System.out.println("2. Survey");
        System.out.println("3. Quit");
        System.out.print("Choose One: ");}
    
//New method that lets user pick which section they want.    
    public void mainMenu_choice() {
        Scanner scan = new Scanner(System.in);
        Furniture goods = new Furniture();
        Survey survey = new Survey();
         
       
        int choice = scan.nextInt();
       
            switch(choice){
             //If user inputs 1, directs to furniture menu   
             case 1:
                goods.furniture_Menu();
                goods.furniture_Menu_Choice();
                break;
            //If user inputs 2, directs to Survey     
             case 2: 
                 System.out.println();
                 survey.title();
                 survey.Questions();
                 survey.Response();
                break;
             //If user inputs 3, terminates program   
             case 3:
                 System.out.println();
                 System.out.println("Come back again!");
                break;}
    
    }
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        User_Menu ob1 = new User_Menu();
        
        
        ob1.mainMenu();
        ob1.mainMenu_choice();
       }
    

    
}
