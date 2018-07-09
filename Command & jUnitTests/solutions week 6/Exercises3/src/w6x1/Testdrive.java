package w6x1;

/* Testdrive class for CandIT Command Pattern example. We want to create some Users who report ProblemTickets,
 * and check that the Helpdesk can log, prioritise, and assign the tickets. The tickets will be executed by 
 * a Technician following the Command Pattern. For simplicity, assume there is only one Technician (to avoid
 * having to think about balancing workloads), also check that the Helpdesk will not break if there are no
 * tickets in the system.
 * 
 */

public class Testdrive {

	public static void main(String[] args) {
		Testdrive td = new Testdrive();
		td.go();
	}
	
	// run the testdrive
	private void go() {
		
		User u1 = new StaffMember("Sue");	// no real difference between Student and Staff
		User u2 = new Student("Jorge");		// but let's have one of each
		
		// create some problems.
		ProblemTicket pt1 = new ProblemTicket("My keyboard smells of bacon", u1);
		ProblemTicket pt2 = new ProblemTicket("My mouse is sticky", u2);
		ProblemTicket pt3 = new ProblemTicket("My monitor is haunted", u2);
		pt3.prioritise(); // expect this to be dealt with first!
		ProblemTicket pt4 = new ProblemTicket("My character set has defaulted to the G(r)eek alphabet", u2);
		ProblemTicket pt5 = new ProblemTicket("My PC is humming, I think it's Auld Lang Syne", u1);
		
		// log the problems
		HelpDesk hd = new HelpDesk();
		System.out.println("HELPDESK :-\n");
		hd.logIssue(pt1);
		hd.logIssue(pt2);
		hd.logIssue(pt3);
		hd.logIssue(pt4);
		hd.logIssue(pt5);
		System.out.println("\n\n-------------------------------\n\n");
		
		// assign to our one technician
		Technician eric = new Technician();
        hd.assignNextIssue(eric);
        hd.assignNextIssue(eric);
        hd.assignNextIssue(eric);
        hd.assignNextIssue(eric);
        hd.assignNextIssue(eric);
        hd.assignNextIssue(eric);
	}
	
}
