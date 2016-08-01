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
public class Customer implements java.io.Serializable{
      String mainName;
      int guestsInRoom;
      public  String fName;
      public  String lName;
      public  int RoomNum;
            int customerCount = 0;
       private static int x=-1;
  

    public Customer() {
        mainName = "k";
        fName="e";
        lName="e";
        RoomNum=x;
       // System.out.println();
    }

    public void setName(String aName) {
       // System.out.println("add name class method ");
        mainName = aName;
    }

    public String getName() {
        return mainName;
    }
    // encapsulation
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(int RoomNum) {// validate roomNum
		if (RoomNum >= 0 && RoomNum < 10)
			this.RoomNum = RoomNum;
	}
    
}
