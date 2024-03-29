package strategy;

import java.awt.Point;
import java.util.ArrayList;

import commands.CommandCenter;
import commands.ShipDestroyCommand;
import ships.Ship;


public class DefensiveStrategy implements OperationalStrategy {
	
	// Returns true if the game is over
	public boolean check(ArrayList<Ship> ships, CommandCenter cm) {
		Point master = ships.get(0).getLoc();
		ArrayList<Ship> matches = new ArrayList<Ship>();
		
		// Add ships to the matches ArrayList if they are in the same square as the MasterShip
		for (int s=1; s<ships.size(); s++) {
			if (ships.get(s).getLoc().equals(master)) {
				matches.add(ships.get(s));
			}
		}
		
		
		if (matches.size() == 0) {
			return false;
		} else if (matches.size() == 1) {
			// DestroyShips if matches contains 1 
			cm.execute(new ShipDestroyCommand(ships, matches));
			System.out.println("Total Ships: "+ships.size() + "\tdestroyed: " + matches.size());
			return false;
		} else {
			// More than 1 ship matched, game over
			System.out.println("GAME OVER");
			return true;
		}
	}
}