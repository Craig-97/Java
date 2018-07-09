package w4x1;

/* Main MP class. I have added an identifier (id), not mentioned in the question, to make it easier
 * from the menu to select any desired MP. 
 */
public class MP {

	private final int id;
	private PolType party;
	private String fname;
	private String sname;
	
	private BeliefBehaviour bb;
	private HomeBehaviour hb;
	
	// Why am I setting id = 0 in the no-arg constructor? See week 5 exercise 3.
	public MP() {id = 0;}
	
	// multi-arg constructor
	public MP(int id, PolType party, String fname, String sname,
			BeliefBehaviour bb, HomeBehaviour hb) {
		this.id = id;
		this.party = party;
		this.fname = fname;
		this.sname = sname;
		this.bb = bb;
		this.hb = hb;
	}
	
	public int getID() {return id;}
	
	// display the MPs details and behaviours
	public void speechify() {
		System.out.println("\n***Hello, " + fname + " " + sname +" here [" + id +"]***");
		System.out.println("******************************");
		System.out.print("I believe:\n       ");
		bb.perform();
		System.out.print("Well, I am off:\n      ");
		hb.perform();
		System.out.println("---------------------------------");
	}
	
	// change a belief behaviour
	public void beliefUTurn(BeliefBehaviour newbb) {
		this.bb = newbb;
	}
	
	// change a home behaviour
	public void homeUTurn(HomeBehaviour newhb) {
		this.hb = newhb;
	}
	
	// override toString for convienient display
	public String toString() {
		return fname + " " + sname + ", " + party + " [" + id + "]";
	}	
	
}
