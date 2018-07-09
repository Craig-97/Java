package threads2;

import java.util.Random;

public class LazyStudent extends Thread {
	private String theName;
	private int time;
	Random rand = new Random();
	
	public LazyStudent(String name) {
		setTheName(name);
		setTime(rand.nextInt(999));
	}
	
	public String getTheName() {
		return this.theName;
	}

	public void setTheName(String name) {
		this.theName = name;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
	public void run() {
		
		try {
			System.out.println(this.theName + " is about to sleep "  +this.time);
			Thread.sleep(this.time);
			System.out.println(this.theName + " is awake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
