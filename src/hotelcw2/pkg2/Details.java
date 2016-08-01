/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcw2.pkg2;


public class Details {
    private Customer customerDetails;
	private int RoomNum;
        public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
        	public int getRoomNumber() {
		return RoomNum;
	}

	public void setRoomNumber(int RoomNum) {
		this.RoomNum = RoomNum;
	}
}
