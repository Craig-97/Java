package w3x1;

/* Non-singleton class, just so we can contrast it with Universe; this is not mentioned in the
 * question, but I wanted to have a comparison to the singleton.
 * 
 * (I remember seeing lots of pebbles at the beach, so pretty sure there can be multiple instances).
 * 
 */

public class Pebble extends Identifiable {
	
	private Pebble () {}
	
	// Use private constructor and a factory method to mirror the structure of the Universe class,
	// for an even comparison, except that no singularity is enforced here.
	public static Pebble getInstance()
	{
		return new Pebble();	
	}

}
