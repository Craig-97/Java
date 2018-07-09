package commands;

import java.util.ArrayList;

import main.GameRun;
import ships.EnemyFactory;
import ships.EnemyShip;
import ships.Ship;

public class EnemySpawnCommand implements Command {

	ArrayList<Ship> ships;
	EnemyShip enemy;
	
	// Save the ships reference in the constructor
	public EnemySpawnCommand(ArrayList<Ship> ships) {
		this.ships = ships;
	}
	
	@Override
	public void execute() {
		// Create an Enemy and add it to the ships ArrayList
		enemy = EnemyFactory.createEnemy();
		ships.add(enemy);
		
		// Set the changed flag to true
		GameRun.getGame().setChangedTrue();
	}

	@Override
	public void undo() {
		// remove the enemy added in execute
		ships.remove(enemy);
		
		// Set the changed flag to true
		GameRun.getGame().setChangedTrue();
	}

}
