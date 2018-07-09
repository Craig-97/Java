package w4x1;

/*
 * Menu to execute simple commands to create, display, and update MPs and their behaviours.
 * The point is to show how the behaviours can be rewired at runtime -- the strategy pattern.
 * 
 */

import java.util.*;

public class Menu {

	// run the menu
	public static void main(String[] args) {
		Menu m = new Menu();
		m.run();
	}
	
	// output message showing the user the available commands
	private String msg = " ***********************************\n" +
						 " * C to create an MP               *\n" +
						 " * L to list all MPs               *\n" +
						 " * D to detail all MPs             *\n" +
						 " * <int> to detail MP with that ID *\n" +
						 " * U to update (u-turn!) an MP     *\n" +
						 " * X to exit                       *\n" +
						 " ***********************************\n";
	
	private ArrayList <MP> theMPs = new ArrayList<MP>(); // list of MPs created
	Scanner scr = new Scanner(System.in); // use Scanner to get user's input
	
	// read the user's input
	private String getinput() {
		String cmd;
		cmd = scr.nextLine();
		return cmd;
	}
	
	// the main display-read-execute loop
	public void run() {
		String cmd = "";
		while (true) {
			System.out.println("\n\n");
			System.out.println(msg);
			cmd = getinput();
			processcmd(cmd);
		}
	}
	
	// dynamically create an MP
	private void createMP() {
		System.out.println("enter first name of MP: ");
		String fn = scr.nextLine();
		System.out.println("enter second name of MP: ");
		String sn = scr.nextLine();
		PolType party;
		System.out.println("enter 1 for CON, 2 for LAB, 3 for LIBDEM, 4 for GREEN");
		String pt = scr.nextLine();
		switch (pt) {
		    case "1" : party = PolType.CON;
		    break;
		    case "2" : party = PolType.LAB;
		    break;
		    case "3" : party = PolType.LIBDEM;
		    break;
		    case "4" : party = PolType.GREEN;
		    break;
		    default : System.out.println("unknown party, aborting create operation"); 
		    		  return;
		}
		MP mp = MPFactory.getInstance(party, fn, sn);
		theMPs.add(mp.getID()-1, mp);
		System.out.println("MP created: " + mp);
	}
	
	// dynamically change an MP
	private void updateMP() {
		System.out.println("enter ID of MP to update: ");
		MP mp;
		try {
			int mpid = Integer.parseInt(scr.nextLine());
			mp = theMPs.get(mpid-1);
		}
		catch (Exception e) {
			System.out.println("no such MP, aborting update");
			return;
		}
		System.out.println("updating " + mp);
		System.out.println("updating beliefs: ");
		System.out.println("enter 1 for know best, 2 for daft public, 3 for jobs, 4 for recycling");
		String newbehav = scr.nextLine();
		BeliefBehaviour bb;
		switch (newbehav) {
		    case "1" : bb = new KnowBestBehaviour();
		    break;
		    case "2" : bb = new DaftBehaviour();
		    break;
		    case "3" : bb = new JobBehaviour();
		    break;
		    case "4" : bb = new RecyclingBehaviour();
		    break;
		    default : System.out.println("unknown belief, aborting update operation"); return;
		    }
		System.out.println("updating home: ");
		System.out.println("enter 1 for modest house, 2 for grand house, 3 for tree, 4 for clouds");
		newbehav = scr.nextLine();
		HomeBehaviour hb;
		switch (newbehav) {
		    case "1" : hb = new BungalowBehaviour();
		    break;
		    case "2" : hb = new MansionBehaviour();
		    break;
		    case "3" : hb = new TreeBehaviour();
		    break;
		    case "4" : hb = new CloudBehaviour();
		    break;
		    default : System.out.println("unknown home, aborting update operation"); return;
		    }
		mp.beliefUTurn(bb);
		mp.homeUTurn(hb);
		System.out.println("MP updated: " + mp);
		}

	// interpret and execute the user's commands
	private void processcmd(String c) {
		switch (c) {
			case "X" :
			case "x" : 
				System.out.println("bye");
				scr.close();
				System.exit(0);
			case "C" :
			case "c" : 
				createMP();
				break;
			case "U" :
			case "u" :
				updateMP();
				break;
			case "L" :
			case "l" : 
				for (MP mp : theMPs) System.out.println(mp);
				break;
			case "D" :
			case "d" :
				for (MP mp : theMPs) mp.speechify();
				break;
			default:
				// maybe it was an MP's ID as an <int>, let's check
				MP mp = null;
				try {
					int i = Integer.parseInt(c);
					mp = theMPs.get(i-1);
				}
				catch (Exception e) {
					// nope
					System.out.println("Unknown command " + c);
					return;
				}
			    // if it was valid <int>, show details for corresponding MP
				mp.speechify();
		}
	}
}
