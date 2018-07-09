package singleton;

import javax.swing.JOptionPane;

public class DemoSingleton {

	public static void main(String[] args) {
		String output;
		
		Government g1 = Government.getInstance();
		Government g2 = Government.getInstance();
		
		if(g1.equals(g2)) {
			output = "only one";
		} else {
			output = "there are two!!!!!!!!!!!!!!";
		}

		JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);

	}

}
