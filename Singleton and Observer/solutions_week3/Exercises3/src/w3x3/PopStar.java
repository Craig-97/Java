package w3x3;

/*
 * This is a basic PopStar class, the work is done by extending PopObservable.
 * 
 */

public class PopStar extends PopObservable {
	
	private String name;
	
	// simple constructor
	public PopStar(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // for convenient output
		return name;
	}
	
}
