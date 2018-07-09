package observerPopStar;

public class DemoObserver {
	public static void main(String[] args) {
		PopStar james = new PopStar("James");
		Fan f1 = new Fan("Alan");
		Fan f2 = new Fan("Fred");
		
		james.registerObserver(f1);
		james.registerObserver(f2);
		
		james.setNews("Free tickets available on the website");
		james.notifyObservers();
		
		james.removeObserver(f1);
		
		james.setNews("Only two tickets left");
		james.notifyObservers();

	}

}
