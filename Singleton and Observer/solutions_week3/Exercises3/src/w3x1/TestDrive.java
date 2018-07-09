package w3x1;

/*
 *  Testing the singletons. Twice try to create a Universe and a Pebble instance, then output, 
 *  expect the same Universe (seen twice) but two different pebbles. 
 *  
 *  Using the == operator checks object references are equal.
 *  
 *  The default toString method shows each objects hash (in hexadecimal format), this identifies
 *  each object in memory, so expect to be the same for universes and different for pebbles.
 *  
 *  My friend who's into conspiracy theories told me that those Java guys are trying to cover up
 *  the existence of another universe, and have probably doctored the code to keep it under wraps,
 *  so in addition to checking the references and the hash-codes, I then added my own random key 
 *  to each object so I could compare those too! I added an Identifiable class, only change to the
 *  existing project was to make Universe and Pebble inherit from it.
 *  
 */

public class TestDrive {

	public static void main(String[] args) {
	// let's create a universe!
	Universe uni1 = Universe.getInstance();
	Universe uni2 = Universe.getInstance();
	System.out.println("Comparing universes ...");
	System.out.println("Checking for uniqueness after twice gettting an instance ...");
	if (uni1 == uni2) 
		System.out.println("universe references are the same");
	else
		System.out.println("universe references are the different");
	System.out.println("hashcodes below ...");
	System.out.println(uni1);
	System.out.println(uni2);
	// and make some pebbles
	Pebble p1 = Pebble.getInstance();
	Pebble p2 = Pebble.getInstance();
	System.out.println("Comparing pebbles ...");
	if (p1 == p2) 
		System.out.println("pebble references are the same");
	else
		System.out.println("pebble references are the different");
	System.out.println("hashcodes below ...");
	System.out.println(p1);
	System.out.println(p2);	
	System.out.println("Hmm, let's dig a little deeper ..."); // added after first test drive
	System.out.println("----------------------------------");
	System.out.println("Comparing random keys in case I don't trust the Java API!");

	System.out.println(uni1 + " ("  + uni1.getMykey() + ")");
	System.out.println(uni2 + " ("  + uni2.getMykey() + ")");
	System.out.println(p1 + " ("  + p1.getMykey() + ")");
	System.out.println(p2 + " ("  + p2.getMykey() + ")");
	}
}
