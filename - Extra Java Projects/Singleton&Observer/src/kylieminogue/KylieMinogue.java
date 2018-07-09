package kylieminogue;

public class KylieMinogue {
	private static KylieMinogue uniqueInstance;

	private KylieMinogue() {
		
	}
	
	public static synchronized KylieMinogue getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new KylieMinogue();
		}
			else
			{
				throw new RuntimeException("Instance already exists");
			}
			
		return uniqueInstance;

	}
		
}


