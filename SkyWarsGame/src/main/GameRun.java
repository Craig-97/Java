package main;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

import commands.CommandCenter;
import commands.EnemySpawnCommand;
import commands.MoveCommand;
import ships.MasterShip;
import ships.Ship;
import state.Start;
import strategy.OperationalStrategy;
import strategy.DefensiveStrategy;

public class GameRun extends Observable {
	
	private GUI gui;

	private static GameRun _game;
	
	private ArrayList<Ship> ships;
	private CommandCenter cmd;
	private OperationalStrategy strategy;
	
	public static void main(String[] args) {
		GameRun.getGame();
	}
	
	private GameRun() {
		// Open the GUI in a new thread
		new Thread(new Runnable() {
			public void run() {
				try {
					synchronized(this) {
						gui = new GUI();

						gui.setGameState(new Start());
						gui.run();
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();		
	}
	
	// gets a new game and returns it
	public static synchronized GameRun getGame() {
		if (_game == null) {
			_game = new GameRun();
		}
		
		return _game;
	}
	
	// plays the game and runs all necessary methods
	public void playGame() {
		ships = new ArrayList<Ship>();
		cmd = new CommandCenter();
		strategy = new DefensiveStrategy();
		
		ships.add(MasterShip.getMasterShip());
		
		gui.run();
		
		setChanged();
		// Draw updates
		notifyObservers("Play");
	}
	
	// ends the game
	public void endGame() {
		ships = null;
		cmd = null;
		strategy = null;
		
		// Next State (Play)
		gui.run();
	}
	
	public void setChangedTrue() {
		setChanged();
	}
	
	/*
	 * Move the ships.
	 * Spawn an enemy - 1 in 3 chance.
	 * Check the MasterShip square for ships.
	 */
	public void move() {
		cmd.execute(new MoveCommand(ships));
		
		// Spawn an enemy (1/3 chance)
		Random r = new Random();
		if (r.nextInt(3) == 0)
			cmd.execute(new EnemySpawnCommand(ships));

		// Check MasterShip square for other space ships
		if (this.strategy.check(ships, cmd)) {
			// Next state (End)
			gui.run();
		} else {
			// Draw updates
			notifyObservers("move");
		}
	}
	
	// Undo last commands
	public void undo() {
		cmd.undo();

		// Draw updates
		notifyObservers("undo");
	}
	
	// Proxy the CommandCenter isUndoAvailable method.
	public boolean isUndoAvailable() {
		return cmd.isUndoAvailable();
	}
	
	// Set the OperationalStrategy - strategy
	public void setOperationalStrategy(OperationalStrategy strategy) {
		this.strategy = strategy;
	}
	
	// Get the ships
	public ArrayList<Ship> getShips() {
		return this.ships;
	}
	
	// Get the ships at a Point
	public ArrayList<Ship> getShips(Point loc) {
		ArrayList<Ship> matches = new ArrayList<Ship>();
		for (Ship s : ships) {
			if (s.getLoc().equals(loc)) {
				matches.add(s);
			}
		}
		return matches;
	}
}
