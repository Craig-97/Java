package strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setFlyBehaviour(new FliesProper());
		setQuackBehaviour(new Quack());
	}

}
