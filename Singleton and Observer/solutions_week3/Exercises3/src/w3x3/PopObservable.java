package w3x3;

/*
 * Use a concrete observable class, this can be extended by PopStar.
 */

import java.util.HashSet;

public class PopObservable {

	private HashSet<PopObserver> fanclub = new HashSet<PopObserver>();
	// use a HashSet so that that an observer can't be multiply observed
	// (to prevent the fan getting the same update multiple times)
	
	public void addFan(PopObserver fan) {
		fanclub.add(fan);
	}
	
	public void removeFan(PopObserver fan) {
		fanclub.remove(fan);
	}
	
	public void notifyFans(String news) {
		for (PopObserver fan : fanclub) fan.update((PopStar)this, news);
	}

}
