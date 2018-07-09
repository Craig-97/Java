package strategy;

import java.util.ArrayList;

import commands.CommandCenter;
import ships.Ship;


public interface OperationalStrategy {
	public boolean check(ArrayList<Ship> ships, CommandCenter cm);
}
