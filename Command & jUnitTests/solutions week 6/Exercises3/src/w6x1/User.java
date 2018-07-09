package w6x1;

/* Abstract superclass of the Staff and Student classes mentioned in the problem description.
 */

public abstract class User {

	private String name;
	
	public User(String n) {
		name = n;
	}
	
	public String getName() { return name; } // for convenient output
	
	//@override
	public String toString () { return name; } // for convenient output
	
}
