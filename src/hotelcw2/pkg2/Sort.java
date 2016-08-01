/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcw2.pkg2;

/**
 *
 * @author win 8
 */
  public class Sort{
              
                public static void displaySorted(Customer[] myHotel){
                   sortRooms (myHotel);
                   for(int k=0;k<myHotel.length;k++)
                       System.out.println(myHotel[k]);
                   System.out.println("");
                }
            
            
	public static void sortRooms(Customer[] myHotel) {//passed the hotelRooms array to method 
            //sorting array list according to alphabetically order
            String ftemp;
            String ltemp;
            Boolean flag = true;
            for(int i=0;i<(myHotel.length - 1);i++){//traversals
                for(int j=0;j<myHotel.length-1;j++){//comparison
                    
                    if(myHotel[j].getfName().compareToIgnoreCase(myHotel[j + 1].getlName())>0){
                        ftemp = myHotel[j].getfName();
                        ltemp = myHotel[j].getlName();
                        
                        myHotel[j].setfName(myHotel[j+1].getfName());
                        myHotel[j].setlName(myHotel[j+1].getlName());
                       
                        myHotel[j+1].setfName(ftemp);
                         myHotel[j+1].setlName(ltemp);
                        flag = false;
                    }
                }
                if(flag)break;  
            }
                           
            }
            }

