package kylieminogue;

import javax.swing.JOptionPane;

public class KylieMinogueSingleton {
	
	public static void main(String[] args) {
		
		try{
		String output;
		
		KylieMinogue k1 = KylieMinogue.getInstance();
		KylieMinogue k2 = KylieMinogue.getInstance();
		
		if(k1.equals(k2)) {
			output = "Only one Instance can be created";
		} else {
			output = "There are two Instances";
		}

		JOptionPane.showMessageDialog(null, output, null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch (Exception e)
		{
			System.out.println("There is only one Kylie");
		}

	}

}