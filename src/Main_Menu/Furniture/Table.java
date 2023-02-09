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
public class Table {
    int choice;                 //User input for switch
    static String table;        //type of table user wants
    static int price;           //holds price of table
    
    //Outputs Table menu
    public void Table_Menu(){
        System.out.println();
        System.out.println("Table Menu");
        System.out.println("1. Dining Table");
        System.out.println("2. Coffee Table");
        System.out.println("3. Side Table");
        System.out.println("4. Return to Funiture Menu");
        System.out.println("5. Return to Main Menu");
        System.out.print("Choose One: ");}
    
    //Lets user choose want table they want
    public void Table_Menu_Choice() {
        Table_Delivery ob1 = new Table_Delivery(); //object for access
                                                   //to delivery methods
        Furniture ob2 = new Furniture();           //Object for furniture menu
        User_Menu ob3 = new User_Menu();           //Object for main menu
        
        //repeats if user inputs number outside range of case statements
        do{
        Scanner scan = new Scanner(System.in);
        
        choice = scan.nextInt();
        }
        while(choice<1 || choice>5);
       
            switch(choice){
             case 1:
                 table = "Dining Table"; //sets table to "Dining Table"
                 price = 1500; //sets price
                 System.out.println();
                 System.out.println("A great dinner on a beautiful table!");
                 System.out.println("Price: $" + price); //outputs price
                 System.out.println("What date would you like the "
                         + "Table delivered?");
                 ob1.delivery();        //Delivery method
                 ob1.time();            //Time method
                 ob1.payment();         //payment method
                 break;
                 
             case 2:
                 table = "Coffee Table"; //Sets table to "Coffee table"
                 price = 600; //sets price
                 System.out.println();
                 System.out.println("A table to kick back on!");
                 System.out.println("Price: $" + price); //outputs price
                 System.out.println("What date would you like the "
                         + "Table delivered?");
                 ob1.delivery();
                 ob1.time();
                 ob1.payment();
                 break;
                 
             case 3:
                 table = "Side Table"; //Sets table to "Side table"
                 price = 200; //sets price
                 System.out.println();
                 System.out.println("A table to place your knick Knacks!");
                 System.out.println("Price: $" + price); //outputs price
                 System.out.println("What date would you like the "
                         + "table delivered?");
                 System.out.println();
                 ob1.delivery();
                 ob1.time();
                 ob1.payment();
                 break;
             //If user inputs 4, returns to furniture menu    
             case 4:
                 ob2.furniture_Menu();
                 ob2.furniture_Menu_Choice();
                 break;
             //If user inputs 5, returns to main menu    
             case 5:
                 ob3.mainMenu();
                 ob3.mainMenu_choice();}
                 
                 
            
    
    }
    
    
}

//Lets the user set the delivery appointment
class Table_Delivery extends Table{
    String date;            //day user chooses to have delivery
    String time;            //time user chooses to have delivery
    String address;         // user's address
    String meridiem;        // AM or PM
    
    //Shows the month of Feburary
    public void delivery(){
    Scanner scan = new Scanner(System.in);
       
   int begin = 4;       //Feburary starts on a Wedneseday
   int dayNum = 28;     //Total days of Feburary
   
   //Days of the week
   String header = "  S  M  T  W  T  F  S";
   System.out.print(header);
   
   int day = 1;
   
   for(int i = 1; i <= begin + dayNum - 1; i++){
       
       if(i % 7 == 1)
       {
           System.out.println();
       }
       if(i < begin){
           System.out.print("   ");}
       
       else{
           if(day/10 == 0){
               System.out.print("  "+ day);}
           else{
               System.out.print(" "+ day);}
           
           day++;
       }
       
     }
   
   //Asking User for date to deliver goods
   System.out.println("\n");
   
   //Repeats if user does not input number
   System.out.print("Enter the day of Feburary you would like your delivery: ");
   while(!scan.hasNext("[1-9][0-9]*")){
       System.out.println("Please enter valid date");
       scan.next();}
   //Outputs day of Feburary
   date = scan.next();
   System.out.println("Your Delivery date is Feburary/"+date+"/2023");
   System.out.println();
    
        
    }
   
   //Lets user set the time they want the delivery 
   public void time(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What time would you like the"
                                                + " table to be delivered?");
        //New Array to hold Buisness hours
        int array [] = {9,10,11,12,1,2,3,4,5,6,7,8,9,};
        
        //Output morning hours and afternoon hours seprately
        for(int i = 0; i<4; i++){
            System.out.println(array[i] +"AM");
            System.out.println();}
        for(int i = 4; i<array.length; i++){
            System.out.println(array[i] +"PM");
            System.out.println();}
       
       //Repeats if user inputs anything but numbers 
       System.out.print("Enter time here: ");
       while(!scan.hasNext("[1-9][0-9]*")){
       System.out.println("Please enter valid time");
       scan.next();}
       time = scan.next();
       System.out.println();
       
       //Repeats if user inputs anything but letters
       System.out.print("AM or PM?: ");
       while(!scan.hasNext("[a-zA-Z]+")){
       System.out.println("Please enter AM or PM");
       scan.next();}
       meridiem = scan.next();
       System.out.println(); 
        
        System.out.println("Your Table will be delivered by " + time +
                                                               " " + meridiem );
        
        
    }
   //Allows user to pay for couch 
   public void payment() {
        System.out.println();
        String payment;   //yes or no if user chooses to proceed with payment
        String purchase;  //to purchase couch
        String menu;      //If user wants to return to main menu or quit program
        
        User_Menu ob1 = new User_Menu();        //object for main menu
        Scanner scan = new Scanner(System.in);
        
        //asks user to enter address
        System.out.print("Enter Address: ");
        address = scan.nextLine();
        System.out.println();
        
        //repeats if user inputs anything else but "yes" or "no"
       do {
            System.out.println("Do you wish to proceed to payment?");
            System.out.print("Enter Yes to proceed or No to"
                                            + " return to table menu: ");
            payment = scan.nextLine();
            
            //"no" returns to couch menu
            if(payment.equalsIgnoreCase("No")) {
               Table_Menu();
               Table_Menu_Choice();
               break;
            }
             //"yes" prompts user to press "p" to purchase
            else if(payment.equalsIgnoreCase("Yes")) {
                System.out.println();
                System.out.print("Press P to purchase Table: ");
                purchase = scan.nextLine();
                //If user presses "P" then gives order summary
                if(purchase.equalsIgnoreCase("P")) {
                    System.out.println("Thank you for purchasing with"
                                                 + " Dahl's Furniture Store");
                    System.out.println();
                    System.out.println("Order Summary");
                    System.out.println("--------------");
                    System.out.println("Item: " +table);
                    System.out.println("Delivery Date: Feburary/"+date+"/2023");
                    System.out.println("Time to be delivered: " + time +
                                                                " " + meridiem);
                    System.out.println("location to be delivered to: " + address);
                    System.out.println("Total price: $" + price);
                    System.out.println();
                    //Asks user if they want to return to main menu
                    System.out.println("Do you want to return to Main Menu?"
                                                       + " Enter yes or no.");
                    //Repeats if user inputs anything but letters
                    while(!scan.hasNext("[a-zA-Z]+")){
                    System.out.println("Please enter yes or no");
                    scan.next();}
                    menu = scan.next();
                    //If "yes" user returns to main menu
                    if(menu.equalsIgnoreCase("yes")){
                        System.out.println();
                        ob1.mainMenu();
                        ob1.mainMenu_choice();}
                    //If "no" user ends program
                    else if(menu.equalsIgnoreCase("no")){
                        System.out.println("Thank you.Come back next time!");
                        break;}
                  break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while(true);
    }
} 

