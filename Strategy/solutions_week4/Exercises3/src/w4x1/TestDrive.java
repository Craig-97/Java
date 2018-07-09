package w4x1;

/* 
 * This is a static test drive class I used to check MP creation, display, default 
 * behaviours and update of behaviour were working as expected, before building the
 * menu class to interact with them dynamically.
 */

public class TestDrive {

	public static void main(String[] args) {
		test();

	}
	
	static void test() {
		MP nick = MPFactory.getInstance(PolType.LIBDEM, "Nick", "Clegg"); 
		System.out.println("\n\n");
		nick.speechify();
		MP tes = MPFactory.getInstance(PolType.CON, "Theresa", "May");
		System.out.println("\n\n");
		tes.speechify();
		MP jez = MPFactory.getInstance(PolType.LAB, "Jeremy", "Corbyn");
		System.out.println("\n\n");
		jez.speechify();
		MP cal = MPFactory.getInstance(PolType.GREEN, "Caroline", "Lucas");
		System.out.println("\n\n");
		cal.speechify();
		// let's try a dynamic behaviour change ...
		System.out.println("\n\n");
		cal.homeUTurn(new CloudBehaviour());
		cal.speechify();
		
	}
	
	

}
