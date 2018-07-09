package strategy;

public class DemoStrategy {

	public static void main(String[] args) {

		/*
		MallardDuck m = new MallardDuck();
		
		m.performFly();
		m.performQuack();
		
		m.setFlyBehaviour(new DoesNotFly());
		
		m.performFly();
		*/
		PlasticDuck bathMate = new PlasticDuck();
		
		bathMate.performFly();
		
		bathMate.setFlyBehaviour(new FliesProper());
		
		bathMate.performFly();

	}

}
