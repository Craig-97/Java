package w5x1;


/*
 * This is the abstract superclass of all coffee types.
 * 
 */

public abstract class Coffee {
	
protected float cost;
protected String type;

public Coffee() {
	// align the name with the class name, and get price from the tariff
	this.type = this.getClass().getSimpleName();
	this.cost = Tariff.getPrice(this.type);
} 

public float getPrice() {return cost; }

public String toString() {
	return type;
	}

}
