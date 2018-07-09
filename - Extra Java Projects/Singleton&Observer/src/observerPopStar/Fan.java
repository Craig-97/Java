package observerPopStar;

import javax.swing.JOptionPane;

public class Fan implements Observer, DisplayInterface {
	
	String name;
	String updates;
	
	public Fan(String name) {
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
