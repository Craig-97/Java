package command;

public class SoupOrder extends FoodOrder {

	public SoupOrder(Chef chef) {
		setChef(chef);
	}
	

	public void cook() {
		this.chef.prepareThis("soup");

	}

}
