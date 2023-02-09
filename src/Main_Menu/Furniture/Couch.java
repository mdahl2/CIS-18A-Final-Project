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
public class Couch {
    //Create instance variables 
    int choice;             //for user input for switch
    static String couch;    //type couch user wants
    static int price;       //price of the couch
    
    //Output couch menu
    public void Couch_Menu(){
        System.out.println();
        System.out.println("Couch Menu");
        System.out.println("1. Three Seat Couch");
        System.out.println("2. Two Seat Couch");
        System.out.println("3. One Seat Couch");
        System.out.println("4. Return to Funiture Menu");
        System.out.println("5. Return to Main Menu");
        System.out.print("Choose One: ");}
    
    //Allows user to input choice
    public void Couch_Menu_Choice() {
        Couch_Delivery ob1 = new Couch_Delivery();//object to direct to delivery 
        Furniture ob2 = new Furniture();//object to direct back to furniture
        User_Menu ob3 = new User_Menu();//object to direct back to main menu
        
        //Pervents user from inputting number outside of Case statement range
        
        do{
        Scanner scan = new Scanner(System.in);
        
        choice = scan.nextInt();
        }
        while(choice<1 || choice>5);
       
            switch(choice){
             case 1:
                 couch = "3 Seat Couch"; //sets couch to 3 seat couch
                 price = 1250;
                 System.out.println();
                 System.out.println("This will be great for the family!");
                 System.out.println("Price: $" + price); //shows price of couch
                 System.out.println("What date would you like the "
                         + "Couch delivered?");
                 ob1.delivery();    //allows user to make delivery appointment
                 ob1.time();        //allows user to set the time for delivery
                 ob1.payment();     //allows user to buy couch
                 break;
                 
             case 2:
                 couch = "2 Seat Couch"; //sets couch to 2 seat couch
                 price = 850;
                 System.out.println();
                 System.out.println("Nice and cozy for a couple!");
                 System.out.println("Price: $" + price);
                 System.out.println("What date would you like the "
                         + "Couch delivered?");
                 ob1.delivery();
                 ob1.time();
                 ob1.payment();
                 break;
                 
             case 3:
                 couch = "1 Seat Couch"; //sets couch to 1 seat couch
                 price = 650;
                 System.out.println();
                 System.out.println("All alone? Thats okay I got what you need!");
                 System.out.println("Price: $" + price);
                 System.out.println("What date would you like the "
                         + "Couch delivered?");
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
            //IF user inputs 5, returns to main menu     
             case 5:
                 ob3.mainMenu();
                 ob3.mainMenu_choice();}
                 
                 
            
    
    }
    
}

class Couch_Delivery extends Couch{
    String date;
    String time;        //Time for delivery
    String address;     //User's address
    String meridiem;    //PM or AM
    
    //Outputs Calander. Shows the days of Feburary
    public void delivery(){
    Scanner scan = new Scanner(System.in);
    
   
   int begin = 4;       //Feburary begins on a Wednseday
   int dayNum = 28;     //Total of days in Feburary
   
   //Outputs the days of the week 
   String header = "  S  M  T  W  T  F  S";
   
   System.out.println("February");
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
   
   //Repeats question if user inputs anything else but a number
   System.out.print("Enter the day of Feburary you would like your delivery: ");
   while(!scan.hasNext("[1-9][0-9]*")){
       System.out.println("Please enter valid date");
       scan.next();}
   
   //user sets the date
   date = scan.next();
   System.out.println("Your Delivery date is Feburary/"+date+"/2023");
   System.out.println();
    
        
    }
   
   //User sets the time
   public void time(){
        //New Scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What time would you like the"
                                                + " couch to be delivered?");
        //New array to hold hours of buisness
        int array [] = {9,10,11,12,1,2,3,4,5,6,7,8,9,};
        
        //outputs hours seprately for the morning hours and afternoon hours
        for(int i = 0; i<4; i++){
            System.out.println(array[i] +"AM");
            System.out.println();}
        for(int i = 4; i<array.length; i++){
            System.out.println(array[i] +"PM");
            System.out.println();}
        
       //Repeats if user inputs anything else but a number 
       System.out.print("Enter time here: ");
       while(!scan.hasNext("[1-9][0-9]*")){
       System.out.println("Please enter valid time");
       scan.next();}
       time = scan.next();
       System.out.println();
       
       //Repeats if user inputs anything else but letters
       System.out.print("AM or PM?: ");
       while(!scan.hasNext("[a-zA-Z]+")){
       System.out.println("Please enter AM or PM");
       scan.next();}
       meridiem = scan.next();
       System.out.println(); 
        
        System.out.println("Your Couch will be delivered by " + time +
                                                               " " + meridiem );
        
        
    }
   
   //Allows user to pay for couch
   public void payment() {
        String payment;     //yes or no if user chooses to proceed with payment
        String purchase;    //to purchase couch
        String menu;        //If user wants to return to main menu or quit program
       
        System.out.println();
        User_Menu ob1 = new User_Menu();
        Scanner scan = new Scanner(System.in);
        
        //Asking user to enter address for delivery
        System.out.print("Enter Address: ");
        address = scan.nextLine();
        System.out.println();
        
        //Repeats question if user inputs anything other than "yes" or "no"
        do {
            System.out.println("Do you wish to proceed to payment?");
            System.out.print("Enter Yes to proceed or No to"
                                            + " return to couch menu: ");
            payment = scan.nextLine();
            
            //"no" returns to couch menu
            if(payment.equalsIgnoreCase("No")) { 
               Couch_Menu();
               Couch_Menu_Choice();
               break;
            }
            //"yes" prompts user to press "p" to purcase
            else if(payment.equalsIgnoreCase("Yes")) { 
                System.out.println();
                System.out.print("Press P to purchase Couch: ");
                purchase = scan.nextLine();
                //If user presses "P" then gives order summary
                if(purchase.equalsIgnoreCase("P")) {
                    System.out.println("Thank you for purchasing with"
                                                 + " Dahl's Furniture Store");
                    System.out.println();
                    System.out.println("Order Summary");
                    System.out.println("--------------");
                    System.out.println("Item: " +couch);
                    System.out.println("Delivery Date: 2/"+date+"/2023");
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
                        System.out.println("Thank you. Come back next time!");
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
