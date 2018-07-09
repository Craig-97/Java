package w3x2;


public class Kylie {
	private static Kylie uniqueInstance;
	
	private Kylie() {
		
	}
	
	public static synchronized Kylie getInstance()   {
		if(uniqueInstance == null) {
			uniqueInstance = new Kylie();
		} else{
			try {
				throw new UniqueKylieException();
			} catch (UniqueKylieException e) {
				e.display();
			}
		}
		
		return uniqueInstance;
	}
}
