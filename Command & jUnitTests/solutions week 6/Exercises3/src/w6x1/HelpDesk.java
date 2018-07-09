package w6x1;

/* The Helpdesk will log ProblemTickets (commands), prioritise them, and assign to a technician for
 * execution.
 * 
 */

import java.util.*;

public class HelpDesk {

	private ArrayList<ProblemTicket> issuequeue = new ArrayList<ProblemTicket>();
	private ArrayList<ProblemTicket> priorityqueue = new ArrayList<ProblemTicket>();
	
	public void logIssue(ProblemTicket pt) {
		System.out.print("HelpDesk -- logging issue " + pt + ", for user " + pt.getReporter());
		if (pt.prioritised()) System.out.print(" *** PRIORITY ***");
		System.out.println();
		if (pt.prioritised())
			priorityqueue.add(pt);
		else
			issuequeue.add(pt);
	}
	
	public void assignNextIssue (Technician t) {
		ProblemTicket pt = null;
		if (! priorityqueue.isEmpty()) {
			pt = priorityqueue.get(0);
			priorityqueue.remove(0);

		}
		else if (! issuequeue.isEmpty()) {
			pt = issuequeue.get(0);
			issuequeue.remove(0);
		}
		else System.out.print("HelpDesk -- no issues to assign at present");
		if (pt != null) t.takeOnIssue(pt);
	}
}
