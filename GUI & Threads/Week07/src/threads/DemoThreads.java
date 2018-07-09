package threads;

public class DemoThreads {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new LazyStudent("Bob"));
		Thread t2 = new Thread(new LazyStudent("Fred"));
		Thread t3 = new Thread(new LazyStudent("Mary"));
		Thread t4 = new Thread(new LazyStudent("Betty"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
