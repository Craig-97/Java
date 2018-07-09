package strategy;

public class DemoStrategy {

	public static void main(String[] args) {

		Conservative James = new Conservative();
		
		James.performLive();
		
		James.setliveBehaviour(new CloudLand());
		
		James.performLive();

	}

}
