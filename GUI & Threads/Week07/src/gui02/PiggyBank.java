package gui02;

public class PiggyBank {
	
	private int ones, twos, fives, tens, twenties, fifties, pounds;
	
	public PiggyBank() {
		initialise();
	}

	public void initialise() {
		this.ones = this.twos = this.fives = this.tens = this.twenties = this.fifties = this.pounds = 0;
		
	}
	
	
	public double getBalance() {
		double balance;
		
		balance = (this.ones + (this.twos * 2) + (this.fives * 5) + (this.tens * 10) + (this.twenties * 20) + (this.fifties * 50) + (this.pounds * 100)) / 100.0;
		
		return balance;
	}
	
	public void raid() {
		initialise();
	}
	
	public void addPenny() {
		this.ones++;
	}
	
	public void addTwoPence() {
		this.twos++;
	}
	
	public void addFivePence() {
		this.fives++;
	}
	
	public void addTenPence() {
		this.tens++;
	}
	
	public void addTwentyPence() {
		this.twenties++;
	}
	
	public void addFiftyPence() {
		this.fifties++;
	}
	
	public void addOnePound() {
		this.pounds++;
	}

}
