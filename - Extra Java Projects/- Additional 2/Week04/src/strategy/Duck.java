package strategy;

public abstract class Duck {
	
	protected Flyable flyBehaviour;
	protected Quackable quackBehaviour;
	
	public void performFly() {
		this.flyBehaviour.fly();
	}
	
	public void performQuack() {
		this.quackBehaviour.quack();
	}
	
	public Flyable getFlyBehaviour() {
		return this.flyBehaviour;
	}
	public void setFlyBehaviour(Flyable flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public Quackable getQuackBehaviour() {
		return this.quackBehaviour;
	}
	public void setQuackBehaviour(Quackable quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	

}
