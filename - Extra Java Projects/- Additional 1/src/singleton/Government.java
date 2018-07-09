package singleton;

public class Government {
	private static Government uniqueInstance;
	
	private Government() {
		
	}
	
	public static synchronized Government getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Government();
		}
		return uniqueInstance;
	}
}
