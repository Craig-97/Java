package w3x1;

/* 
 * Universe is the singleton class.
 * 
 */

public class Universe extends Identifiable {
	
	private static Universe one_and_only = null; // before the Creation ..
	
	public static Universe getInstance () {

		if (one_and_only == null)
			one_and_only = new Universe();
		return one_and_only	;

	}
}
