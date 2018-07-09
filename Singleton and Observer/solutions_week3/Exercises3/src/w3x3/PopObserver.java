package w3x3;

/* Concrete observer class that can be extended by Fan.
 * 
 */

import java.util.ArrayList;

public class PopObserver {

	// to keep a list of updates received
	protected ArrayList<String> gossip = new ArrayList<String>();
	
	// to see what updates have been received
	public void update (PopObservable star, String news) {
	gossip.add(star + " says: " + news);
	}
	
	// to reset the updates (discard old updates)
	public void reset() {
		gossip = new ArrayList<String>(); // the old ArrayList will be garbage-collected
	}
}


