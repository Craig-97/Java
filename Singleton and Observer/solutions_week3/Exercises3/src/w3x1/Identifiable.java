package w3x1;

/* I added this class after doing the main example, just to have an additional way of comparing
 * object identity -- see notes in the TestDrive class. Then the only change for Universe and 
 * pebble was to make them inherit from it.
 * 
 * Each instance is given a randomly assigned double precision numeric key; the changes of different
 * instances having the same key are statistically insignificant.
 * 
 */

public abstract class Identifiable {
	
	private final double mykey; // key cannot be changed after it's assigned
	
	public Identifiable() {
		mykey = Math.random();
	}

	public double getMykey() {
		return mykey;
	}
}
