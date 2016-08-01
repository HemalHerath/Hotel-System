/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcw2.pkg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author win 8
 */
public class Room {
   
             private static int customerCount;
              static Queue que = new Queue();
     
   public static void viewAllRooms(Customer[] myHotel ){
           System.out.println();
           System.out.println("     **** Available Rooms At the Moment ****   ");
           System.out.println();
        int counter = 1;
        
            for (int x =0 ;x< myHotel.length ; x++ ){
                if(!myHotel[x].getfName().equals("e")||!myHotel[x].getlName().equals("e")){
                 System.out.println("\n\tCustomer, " + myHotel[x].getfName() + " " + myHotel[x].getlName()
					+ " assigned to Room No." + myHotel[x].getRoomNum() + "\n");
            
           } else {
            System.out.println("\tRoom" +x+ "is empty");
            
            }
                                                                             
          }
            counter++;
   }
   
            public static void addCustomer(Customer[] myHotel ){
                
                  Customer cus = new Customer();
                  Scanner input = new Scanner(System.in);
       
       try{
              System.out.print("\n\tEnter room no (0-9): ");
                  cus.setRoomNum(input.nextInt());
              myHotel[cus.getRoomNum()].setRoomNum(cus.getRoomNum());
            
	if(myHotel[cus.getRoomNum()].getfName().equals("e")||myHotel[cus.getRoomNum()].getlName().equals("e")){	
        
                System.out.print("\n\tEnter customer's first name "  + " :");
                myHotel[cus.getRoomNum()].setfName(input.next());
            
                System.out.print("\n\tEnter customer's last name "  + " :");
                myHotel[cus.getRoomNum()].setlName(input.next());
          
                //Adding to Queue
             que.push(myHotel[cus.getRoomNum()].getfName()+" "+myHotel[cus.getRoomNum()].getlName());

                       
       System.out.println("\n\tCustomer, " +  myHotel[cus.getRoomNum()].getfName() + " " + myHotel[cus.getRoomNum()].getfName()
					+ " assigned to Room No." + cus.getRoomNum() + "\n");
           
        }else{
         System.out.println("\n\tSorry the room is already occupied\n");
        
        }
       }catch(Exception e) {
			// avoiding invalid inputs from user
			System.err.println("\n\tInvalid Input! Try Again...\n");
		}
	}
            public static void viewEmptyRooms(Customer[] myHotel ){
           
             for (int x = 0; x < 10; x++ ){
             if(myHotel[x].getfName().equals("e") || myHotel[x].getlName().equals("e")){
           System.out.println("\tRoom "+x +"is Empty");
             }
            
                             }
         System.out.println(); 
            }
            
            public static void deleteCustomer(Customer[] myHotel) {
                  Customer cus = new Customer();
            	Scanner input = new Scanner(System.in);

           try{
                    System.out.print("\n\tEnter customer's first name or last name : ");
		        String name = input.next().toLowerCase();
                 
             for (int x = 0; x < 10; x++ ){
                    if(myHotel[x].getfName().equalsIgnoreCase(name) || myHotel[x].getlName().equalsIgnoreCase(name)){
                      
                      myHotel[x].setfName("e");
                      myHotel[x].setlName("e");
                      
                      System.out.println();
                      System.out.println("\n\tCustomer, " + name.toUpperCase() + " successfully deleted!\n");
                                        
                      customerCount--;
                       }
                  
                  }
                }catch (Exception e){
                	System.err.println("\n\tCustomer not found! Try again....!\n");
			deleteCustomer(myHotel);
                }
            }
  
            
            
            public static void fileWriting(Customer[] myHotel,Customer cus)  {
                try{
                File file = new File("Customers.txt");
                
                if(!file.exists()){
                  file.createNewFile();
                }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(Customer cust : myHotel){
                bw.write(cust.toString());
                bw.newLine();
                }
                bw.close();
                System.out.println("\n\tAll the Data Saved Succesfully\n");
	}catch (IOException e){
            System.out.println("\tERRRRRRORRRRRR");
        }
            }
           
            public static void fileReading(Customer[] myHotel){
                BufferedReader br = null;
               try{ 
                String line;
                
                br = new BufferedReader(new FileReader("Customers.txt"));
                while((line = br.readLine())!=null){
                
                   String[] lineparts = line.split(" ",-1);
                   
                   String RoomNum = lineparts[0];
                   String fName   = lineparts[1];
                   String lName   = lineparts[2];
                   
                   myHotel[Integer.parseInt(RoomNum)].setfName(fName);
                    myHotel[Integer.parseInt(RoomNum)].setlName(lName);
                   
                   
                }
                System.out.println("\n\tAll the data Successfully loaded\n");
            
            }catch(IOException e){
               System.out.println("\tErrrorrrr");
            }finally{
               try{
               if(br != null)br.close();
               }catch(IOException ex){
               System.out.println("\tSomething went wrong!!!!");
               }
               }
            }
            public static void sortByName(Customer[] myHotel){
             Sort sort = new Sort();
            sort.displaySorted(myHotel);
            }
            public static void exitProgram(){
            System.out.println("\t--------Thank You---------");
            System.exit(0);
            }
}
          
