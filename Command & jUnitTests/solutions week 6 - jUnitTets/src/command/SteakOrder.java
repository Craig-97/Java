package command;

public class SteakOrder extends FoodOrder {

	public SteakOrder(Chef chef) {
		setChef(chef);
	}
	
	
	public void cook() {
		this.chef.prepareThis("steak");

	}

}
