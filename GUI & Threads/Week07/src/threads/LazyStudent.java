package threads;

import java.util.Random;

public class LazyStudent implements Runnable {
	
	private String name;
	private int time;
	
	Random rand = new Random();
	
	public LazyStudent(String name) {
		setName(name);
		setTime(this.rand.nextInt(1000));
	}
	
	

	public String getName() {
		return this.name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getTime() {
		return this.time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	@Override
	public void run() {
		try {
			System.out.println(this.name + " is about to sleep for " +this.time);
			Thread.sleep(this.time);
			System.out.println(this.name + " is awake");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
