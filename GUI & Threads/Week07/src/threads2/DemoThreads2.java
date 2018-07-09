package threads2;

public class DemoThreads2 {
	public static void main(String[] args) {
		
		new LazyStudent("bob").start();
		new LazyStudent("fred").start();
		new LazyStudent("Mary").start();
		new LazyStudent("Betty").start();

	}

}
