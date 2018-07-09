package command;

public abstract class FoodOrder {
	
	protected Chef chef;
	
	public abstract void cook();

	public Chef getChef() {
		return this.chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	

}
