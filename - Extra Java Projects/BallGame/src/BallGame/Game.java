package BallGame;

import java.util.Random;
import javax.swing.JOptionPane;

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
			
			//display output
			JOptionPane.showMessageDialog(null, "The winner is " + winner.getColour(), "", JOptionPane.INFORMATION_MESSAGE); 
			
		}
	

}
