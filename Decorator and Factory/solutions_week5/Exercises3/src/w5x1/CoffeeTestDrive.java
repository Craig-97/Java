package w5x1;

/*
 *  Test-drive class for coffee example. Want to create some different coffees and make sure they display correctly 
 *  and that prices add up properly. As we have three base coffee types I used a tryVariants method we can
 *  call on each kind, just to save some typing...
 *  
 */

public class CoffeeTestDrive {

	public static void main(String[] args) {
		CoffeeTestDrive ct = new CoffeeTestDrive();
		ct.run();
	}
	
	// compare the outputs with the Tariff class to be sure we
	// get what's expected.
	public void run() {
		System.out.println("Current prices :-");
		System.out.println("------------------");;
		Tariff.displayPrices();
		System.out.println("\n\n");
		Coffee c = new DarkRoast(); // �2.50
		tryVariants(c);
		c = new Espresso(); // �1.50
		tryVariants(c);
		c = new Decaf(); // �2.90
		tryVariants(c);
	}
	
	public void tryVariants(Coffee c) {
		// use printf rather than println to format the prices a bit neater
		System.out.printf("%s costs �%.2f\n", c, c.getPrice());
		System.out.println("-----------");
		Coffee cwc = new CoffeeWithCream(c);
		System.out.printf("%s costs �%.2f\n", cwc, cwc.getPrice());
		Coffee cwcws = new CoffeeWithSyrup(cwc); // double decorated
		System.out.printf("%s costs �%.2f\n", cwcws, cwcws.getPrice());
		System.out.println("-----------");
		Coffee cwch = new CoffeeWithChoc(c);
		System.out.printf("%s costs �%.2f\n", cwch, cwch.getPrice());
		Coffee cwchwm = new CoffeeWithMilk(cwch); // double decorated
		System.out.printf("%s costs �%.2f\n", cwchwm, cwchwm.getPrice());
		System.out.println("\n");
	}
}
