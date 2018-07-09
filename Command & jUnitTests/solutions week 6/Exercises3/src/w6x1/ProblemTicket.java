package w6x1;

/* Here, ProblemTicket is our (implied) Command -- deal with the problem. Note that undo does not make sense
 * in this context -- it would entail creating a problem on a PC that is working find -- so I have defined
 * it to throw and exception.
 * 
 * The basis of the pattern is to have a command object that can be created, passed around, processed, then 
 * (possibly later) executed by a recipient object. The creator and the recipient of the command are thus
 * decoupled. Here the User will create commands (ProblemTickets), the helpdesk will manage and assign them, 
 * and the Technician will execute them. 
 * 
 * Here, all ProblemTickets are instances of the same class, just with a different description, more 
 * realistically we'd need differing subclasses of ProblemTicket with varying problem-specific information.
 */

public class ProblemTicket extends Thread implements Command {
	
	private String description;
	private User reporter; // user who reported the problem
	private boolean priority = false; // set true for high priority issues
	
	public ProblemTicket(String d, User u) {
		description = d;
		reporter = u;
	}

	public void undo() {
		throw new RuntimeException("there is no undo!\n");
	}
	
	public void execute() {
		investigate();
		fix();
	}
	
	public void prioritise() { priority = true; }
	public boolean prioritised () { return priority; }
	
	public String getReporter() { return reporter.getName(); } // for convenient output
	
	//@override
	public String toString() { return description; } // for convenient output
	
	// we'll create a little pause will a problem is being investigated
	private void investigate() {
		System.out.println("investigating problem: " + description + ", for user " + reporter + " ...");
		int delay = 3000 + (int)(Math.random() * 6000.0);
		try { 
			sleep (delay); 
		} catch (InterruptedException ie) {
			System.out.println("Don't interrupt me when I am investigating a problem!");
		};
	}
	
	private void fix() {
		System.out.println("fixing problem: " + description + ", for user " + reporter +"\n");
	}
}
