package bbwb;

import java.util.Random;

public class Game {
	
	Random numGenerator = new Random();
	
	public void play() {
		WhiteBall wb = new WhiteBall();
		BlackBall bb = new BlackBall();
		Ball winner;
		int num;
		
		num = this.numGenerator.nextInt(2);
		
		if (num == 0) {
			winner = bb;
		} else {
			winner = wb;
		}
		
		System.out.println("The winner is " +winner.getTheColour());
		
	}

}
