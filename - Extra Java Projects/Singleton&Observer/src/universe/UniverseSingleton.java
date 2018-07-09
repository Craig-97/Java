package universe;

import javax.swing.JOptionPane;

public class UniverseSingleton {
	
		public static void main(String[] args) {
			String output;
			
			Universe u1 = Universe.getInstance();
			Universe u2 = Universe.getInstance();
			
			if(u1.equals(u2)) {
				output = "only one";
			} else {
				output = "there are two!!!!!!!!!!!!!!";
			}

			JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);

		}

}
