package ships;

import main.ImageDepot;


public class BattleShooter extends EnemyShip {
	
	public BattleShooter() {
		super(); // Initialize to 0,0

		// Get the icon reference from the ImageDepot
		icon = ImageDepot.getImageIcon("ships/Battleshooter-50.png");
	}
}
