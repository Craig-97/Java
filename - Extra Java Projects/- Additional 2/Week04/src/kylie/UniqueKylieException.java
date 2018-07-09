package kylie;

import javax.swing.JOptionPane;

public class UniqueKylieException extends Exception {

	public String toString() {
		return "There is only one Kylie!";
	}
	
	public void display() {
		String output = toString();
		
		JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);
	}
}
