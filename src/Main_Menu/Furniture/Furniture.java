/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Menu.Furniture;
import Main_Menu.User_Menu;
import java.util.Scanner;
/**
 *
 * @author matth
 */
public class Furniture {
    //Output furniture menu
    public void furniture_Menu(){
        System.out.println();
        System.out.println("Furniture Menu");
        System.out.println("1. Couches");
        System.out.println("2. Tables");
        System.out.println("3. Mattresses");
        System.out.println("4. Return to Main Menu");
        System.out.print("Choose One: ");}
    
    //allow user to input choice
    public void furniture_Menu_Choice() {
        
    //Create objects for couch, table and mattress menus
        Scanner scan = new Scanner(System.in);
        Couch ob1 = new Couch();
        Table ob2 = new Table();
        Mattress ob3 = new Mattress();
        User_Menu ob4 = new User_Menu();
        
        
        int choice = scan.nextInt();
       
            switch(choice){
                //User inputs 1, directs to couch menu   
             case 1:
                 System.out.println();
                 System.out.println("We have many options for your living room!");
                 System.out.println("Which couch would you like to purchase?");
                 ob1.Couch_Menu();
                 ob1.Couch_Menu_Choice(); 
                break;
             case 2:
                 //User inputs 2, directs to table menu
                 System.out.println();
                 System.out.println("You can't have a room without a table!");
                 System.out.println("Which table would you like to purchase?");
                 ob2.Table_Menu();
                 ob2.Table_Menu_Choice();
               break;
             case 3:
                 //User iputs 3, directs to mattress menu
                 System.out.println();
                 System.out.println("Everyone needs to sleep!");
                 System.out.println("Which mattress would you like to purchase?");
                 ob3.Mattress_Menu();
                 ob3.Mattress_Menu_Choice();
                
                break;
                //User inputs 4, directs back to main menu
             case 4:
                ob4.mainMenu();
                ob4.mainMenu_choice();}
    
    }        
    
    
}


    


      




       
       
       
      
       

       
       
       
      
        
        
        
        
        
       
    
    

