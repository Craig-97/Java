package observerDemo;

public class DemoObserver {

	public static void main(String[] args) {
		Lecturer john = new Lecturer("john");
		Student s1 = new Student("Fred");
		Student s2 = new Student("Bob");
		
		john.registerObserver(s1);
		john.registerObserver(s2);
		
		john.setNews("Free beer tomorrow");
		john.notifyObservers();
		
		john.removeObserver(s1);
		
		john.setNews("Beer cancelled");
		john.notifyObservers();

	}

}
