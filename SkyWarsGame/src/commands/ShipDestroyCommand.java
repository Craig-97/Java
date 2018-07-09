package commands;

import java.util.ArrayList;

import main.GameRun;
import ships.Ship;

public class ShipDestroyCommand implements Command {
	
	ArrayList<Ship> ships, shipsDestroyed;
	
	public ShipDestroyCommand(ArrayList<Ship> ships, ArrayList<Ship> shipsDestroyed) {
		this.ships = ships;
		this.shipsDestroyed = shipsDestroyed;
	}
	
	@Override
	public void execute() {
		if (ships.removeAll(shipsDestroyed)) {
			// Set the changed flag to true
			GameRun.getGame().setChangedTrue();
		}
	}

	@Override
	public void undo() {
		if (ships.addAll(shipsDestroyed)) {
			// Set the changed flag to true
			GameRun.getGame().setChangedTrue();
		}
		
		shipsDestroyed.clear();
	}
	
}
