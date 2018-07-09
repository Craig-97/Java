package command;

import java.util.ArrayList;

public class Waitress {
	
	private ArrayList <FoodOrder> theOrders = new ArrayList <FoodOrder> ();
	
	public void takeOrder(FoodOrder theOrder) {
		this.theOrders.add(theOrder);
	}
	
	public void popIntoKitchen() {
		for(FoodOrder order : this.theOrders) {
			order.cook();
		}
	}
	
	public void haveAFagBreak() {
		System.out.println("I am out back, by the bins, having a fag....");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("I am back ... didn't bother washing my hands");
		
	}

}
