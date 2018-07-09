package gui02;

public class PiggyBankDemo {

	public static void main(String[] args) {
		
		/*
		 * Initial piggy bank test
	 	
		*/
		/*
		PiggyBank pg = new PiggyBank();
		
		pg.addPenny();
		pg.addTwentyPence();
		pg.addOnePound();
		
		System.out.println(pg.getBalance());
		
		pg.initialise();
		
		System.out.println(pg.getBalance());
	*/
		
		PiggyBankUI pgui = new PiggyBankUI();
		
		pgui.displayMenu();
		
	}

}
