package strategy;

public class GreenParty extends Politician {
	
	public GreenParty() {
		setliveBehaviour(new Trees());
		setbeliefBehaviour(new Recycle());
	}

}
