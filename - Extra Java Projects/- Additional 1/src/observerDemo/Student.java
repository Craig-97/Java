package observerDemo;

import javax.swing.JOptionPane;

public class Student implements Observer, DisplayElement {
	
	String name;
	String updates;
	
	public Student(String name) {
		setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		String news = "News for " +this.name +"\n";
		
		news = news + this.updates;
		
		JOptionPane.showMessageDialog(null, news, "", JOptionPane.INFORMATION_MESSAGE);

	}

	public void update(String theNews) {
		this.updates = theNews;
		display();

	}

}
