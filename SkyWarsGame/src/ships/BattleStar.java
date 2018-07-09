package ships;

import main.ImageDepot;


public class BattleStar extends EnemyShip {

	public BattleStar() {
		super(); // Initialize to 0,0

		// Get the icon reference from the ImageDepot
		icon = ImageDepot.getImageIcon("ships/Battlestar-50.png");
	}
}
