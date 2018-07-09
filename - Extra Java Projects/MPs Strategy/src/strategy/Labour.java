package strategy;

public class Labour extends Politician {
	
	public Labour() {
		setliveBehaviour(new ModestHouses());
		setbeliefBehaviour(new EveryoneJob());
	}

}
