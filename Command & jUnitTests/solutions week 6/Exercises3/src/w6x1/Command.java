package w6x1;

/*
 * The inclusion of undo here is purely protreptic: execute and undo are the basic capabilities of a command.
 * But see the important comment in the ProblemTicket class.
 */

public interface Command {
	
	public void execute();
	public void undo();

}
