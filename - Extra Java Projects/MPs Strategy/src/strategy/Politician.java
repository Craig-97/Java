package strategy;

public abstract class Politician {
	
	protected Livable liveBehaviour;
	protected Beliefs beliefBehaviour;
	
	public void performLive() {
		this.liveBehaviour.live();
	}
	
	public void performBelief() {
		this.beliefBehaviour.belief();
	}
	
	public Livable getliveBehaviour() {
		return this.liveBehaviour;
	}
	public void setliveBehaviour(Livable liveBehaviour) {
		this.liveBehaviour = liveBehaviour;
	}
	public Beliefs setbeliefBehaviour() {
		return this.beliefBehaviour;
	}
	public void setbeliefBehaviour(Beliefs beliefBehaviour) {
		this.beliefBehaviour = beliefBehaviour;
	}
	
	

}
