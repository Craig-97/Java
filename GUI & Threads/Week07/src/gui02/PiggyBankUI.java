package gui02;

import javax.swing.JOptionPane;

public class PiggyBankUI {
	
	private PiggyBank theBank;
	
	public PiggyBankUI() {
		theBank = new PiggyBank();
	}

	public void displayMenu() {
		String output;
		String choiceS;
		int choice;
		
		do {
			output = getDisplayMessage();
			
			choiceS = JOptionPane.showInputDialog(output);
			choice = Integer.parseInt(choiceS);
			execute(choice);	
		} while (choice != 9);
	} //diplayMenu
	
	
	private void execute(int choice) {
		switch(choice ) {
			case 1 : this.theBank.addPenny();
					 break;
			case 2 : this.theBank.addTwoPence();
					 break;
			case 3 : this.theBank.addFivePence();
					 break;
			case 4 : this.theBank.addTenPence();
					 break;
			case 5 : this.theBank.addTwentyPence();
					 break;
			case 6 : this.theBank.addFiftyPence();
					 break;
			case 7 : this.theBank.addOnePound();
					 break;
			case 8 : this.theBank.raid();
					 break;
			case 9 : System.exit(0);
					 break;
			default : didNotRecogniseError(); 
		}
		
	}

	private void didNotRecogniseError() {
		String output;
		
		output = "I did not recognise your entry";
		JOptionPane.showMessageDialog(null, output);
		
	}

	private String getDisplayMessage() {
		String output;
		
		output = "Your balance is " +this.theBank.getBalance() +"\n\n";
		output = output + "Enter \n";
		output = output + "1 - add 1p \n";
		output = output + "2 - add 2p \n";
		output = output + "3 - add 5p \n";
		output = output + "4 - add 10p \n";
		output = output + "5 - add 20p \n";
		output = output + "6 - add 50p \n";
		output = output + "7 - add £1 \n";
		output = output + "8 - raid the piggy bank \n";
		output = output + "9 - exit \n";
		
		return output;
		
	}
}//end class
