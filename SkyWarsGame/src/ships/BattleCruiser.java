package ships;

import main.ImageDepot;


public class BattleCruiser extends EnemyShip {
	
	public BattleCruiser() {
		super(); // Initialize to 0,0

		// Get the icon reference from the ImageDepot
		icon = ImageDepot.getImageIcon("ships/Battlecruiser-50.png");
	}
}
