package strategy;

public class LibDem extends Politician {
	
	public LibDem() {
		setliveBehaviour(new CloudLand());
		setbeliefBehaviour(new PublicDaft());
	}

}
