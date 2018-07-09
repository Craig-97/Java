package w5x1;

/* This is the abstract superclass of all "fancy coffees", that is coffees with added ingredients.
 * Extra instance variables hold a reference to the base coffee type and a description of what's added.
 * Note that the internal cost variable now represents the additional cost which must be added to the
 * base coffee cost.
 */

public abstract class FancyCoffee extends Coffee {
	
	protected String desc; 			// description of the added ingredients
	protected Coffee baseCoffee; 	// basis of the fancy coffee
	
	// handy constructor to set the base coffee and the 
	// description of the added ingredient
	public FancyCoffee(Coffee bc, String withAdded) {
		this.baseCoffee = bc;
		this.desc = withAdded;
	}
	
	// override getPrice to include costs of base coffee and added ingredient
	public float getPrice() {
		return this.cost + baseCoffee.getPrice();
	}
	
	// override toString to include the extra ingredient
	public String toString() {
		return baseCoffee.toString() + " " + desc;
	}
}
