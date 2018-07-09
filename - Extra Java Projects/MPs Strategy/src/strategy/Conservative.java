package strategy;

public class Conservative extends Politician {

	public Conservative() {
		setliveBehaviour(new BigDetatchedHouses());
		setbeliefBehaviour(new KnowBest());
	}
}
