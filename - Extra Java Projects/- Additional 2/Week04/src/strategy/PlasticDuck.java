package strategy;

public class PlasticDuck extends Duck {

	public PlasticDuck() {
		setFlyBehaviour(new DoesNotFly());
		setQuackBehaviour(new Quack());
	}
}
