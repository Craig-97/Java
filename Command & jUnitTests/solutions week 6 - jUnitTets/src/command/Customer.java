package command;

public class Customer {
	public static void main(String[] args) {
		Chef chef = new Chef();
		Waitress theWaitress = new Waitress();
		
		FoodOrder myStarter = new SoupOrder(chef);
		FoodOrder myMain = new SteakOrder(chef);
		
		theWaitress.takeOrder(myStarter);
		theWaitress.takeOrder(myMain);
		
		theWaitress.haveAFagBreak();
		
		theWaitress.popIntoKitchen();

	}

}
