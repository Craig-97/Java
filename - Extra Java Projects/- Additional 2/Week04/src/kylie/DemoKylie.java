package kylie;

public class DemoKylie {
	public static void main(String[] args) {
		Kylie k1 = Kylie.getInstance();
		Kylie k2 = Kylie.getInstance();
		
		System.out.println(k1.equals(k2));

	}

}
