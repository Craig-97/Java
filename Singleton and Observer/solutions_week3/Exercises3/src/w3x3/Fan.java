package w3x3;

/* Simple Fan class, the work is done by extending PopObserver, and a method chatter added
 * to show cumulative updates.
 */

public class Fan extends PopObserver {
	
	private String name;
	
	// simple constructor
	public Fan(String n) {
		name= n;
	}

	// method for the fan to show updates they have received
	public void chatter() {
		System.out.println("***Tweet from fan " + name + "***");
		for (String hotnews : gossip)
		System.out.println("     I heard that " + hotnews);
	}
	
}
