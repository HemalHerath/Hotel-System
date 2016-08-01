/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcw2.pkg2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author win 8
 */
public class HotelCW22 {

   private static Customer[] myHotel = new Customer[10];
   private static  Scanner sc = new Scanner(System.in); 
     
   public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println("                        *******WELCOME TO HOTEL MANAGEMENT SYSTEM*******              ");
       
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(" \n\t\t\t    ****    LOGIN    ****  ");
		System.out.println("");
		System.out.print("   Enter UserName:   ");
                String username = sc.next();
        System.out.println("");
        System.out.print("   Enter Password:   ");
				String password = sc.next();
		System.out.println("");
		if ((username.equalsIgnoreCase("123")) && ((password.equalsIgnoreCase("123")))) {
		System.out.println("Login Successfull!!!");        
  

       
       
                        Customer cus = new Customer();
                      for (int x = 0; x < myHotel .length; x++) {
			 myHotel [x] = new Customer();
			// myHotel [x].setRoomNum(x - 1);
		}
              
try{
        initialise(myHotel);
        char choose = 'q';// choice for the menu

   System.out.println("");
   System.out.println("\t\t\t Welcome to  Safaya Room Management System\n");
   while (choose != 'q' || choose != 'Q') {
                        System.out.println();
                        System.out.println("     Number of Customers : " + cus.customerCount);
			System.out.println("\n\tV: View all rooms");
		        System.out.println("\tA: Add a customer to a room");
			System.out.println("\tE: Display Empty rooms");
			System.out.println("\tD: Delete customer from room");
			System.out.println("\tQ: Queue details");
			System.out.println("\tS: Save program data");
			System.out.println("\tL: Load program data");
			System.out.println("\tO: View rooms ordered alphabetically by name");
			System.out.println("\tZ: Exit\n");

			System.out.print("\n\tEnter a choice to continue : ");
                        choose = sc.next().toLowerCase().charAt(0);

        
        x: switch (choose) {
          case 'v':
               Room v = new Room();//creating an object to call viewAllRooms method
               v.viewAllRooms(myHotel);  
           break x;
              
           case 'a':
               Room a = new Room();//creating an object to call addCustomer method
               a.addCustomer(myHotel);
	       cus.customerCount++;//increment customerCount when after adding a customer
	   break x;
               
           case 'e':
               Room e = new Room();//creating an object to call viewEmptyRooms method
               e.viewEmptyRooms(myHotel);
	   break x;
               
           case 'd':
               Room d = new Room();//creating an object to call deleteCustomer method
               d.deleteCustomer(myHotel);
	       cus.customerCount--;// decrement customer count every time this choice is
	   break x;
               
           case 's':
		Room.fileWriting(myHotel,cus);
           break x;
              
           case 'l':
		Room.fileReading(myHotel);
            break x; 
            case 'o':
              Room o = new Room();
              o.sortByName(myHotel);
	   break x;
              
           case 'q':
                Queue qu = new Queue();
                qu.queue();
           break x;
        }
   }
      
		} catch (Exception e) {
			// restart the program , anything goes wrong
			System.err.println("\n\tSomething went wrong! Program restarting again...\n");
			
		}
                }
    }
    private static void initialise( Customer hotelRef[] ) {
          for (int x = 0; x <myHotel .length; x++ ) hotelRef[x].mainName = "e";
           System.out.println();
     }
  
}

