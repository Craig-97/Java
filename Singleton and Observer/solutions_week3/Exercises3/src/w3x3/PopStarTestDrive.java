package w3x3;

/*
 * We want to create some stars and some fans and see that the updates are correctly observed. Need to 
 * show creation of stars and fans, assigning fans to stars, including the same fan following more than one
 * star, and the removal of fans from stars. Then that we want to check that the stars updates are
 * correctly disseminated.
 * 
 */

public class PopStarTestDrive {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		// make a coupld of pop stars
		PopStar jlo = new PopStar("Jennife Lopez");
		PopStar rob = new PopStar("Robyn");
		// and make some fans
		Fan fred = new Fan("Fred");
		Fan fiona = new Fan("Fiona");
		Fan fareek = new Fan("Fareek");
		jlo.addFan(fred);
		jlo.addFan(fiona);
		rob.addFan(fiona); // fiona follows two stars
		rob.addFan(fareek);
		// test simple notifications
		jlo.notifyFans("I am going on tour");
		rob.notifyFans("I am releasing a new album");
		// what do the fans say?
		System.out.println("\n-------- ------------------------------------");
		System.out.println("-------- what have the fans heard? ------------");
		System.out.println("---------------------------------------------\n");
		fred.chatter();
		fiona.chatter(); // should have updates from both rob and jlo
		fareek.chatter();
		// try removal and multiple notifications
		fred.reset(); fiona.reset(); fareek.reset(); // discard previous updates
		System.out.println("\n-------- ------------------------------------");
		System.out.println("-------- time for some newer gossip! --------");
		System.out.println("---------------------------------------------\n");
		jlo.removeFan(fiona); // should no longer show jlo's updates
		jlo.notifyFans("�Estoy haciendo una pel�cula!");
		jlo.notifyFans("I am making a film!"); // multiple notifications from same star
		rob.notifyFans("I have been nominated for the Nobel peace prize");
		// what do the fans say?
		fred.chatter();
		fiona.chatter();
		fareek.chatter();
	}

}
