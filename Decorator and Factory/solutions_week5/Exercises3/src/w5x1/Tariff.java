package w5x1;

/*
 * In the first version, I set the price in each individual Coffee subclass, but now I have pulled
 * all the prices together into a single static class. The advantage of this is that it pulls all 
 * the prices together where they can be maintained and compared, but the disadvantage is that 
 * adding a new coffee type also means updating the pricelist. Either approach is acceptable.
 * 
 * 
 */

public class Tariff {

	private static java.util.HashMap<String, Float> pricelist;
	
	static { // set the prices for all the varieties
		pricelist = new java.util.HashMap<String, Float>();
		pricelist.put("DarkRoast",       2.50f);
		pricelist.put("Espresso",        1.50f);
		pricelist.put("Decaf",           2.90f);
		pricelist.put("CoffeeWithChoc",  1.20f);
		pricelist.put("CoffeeWithCream", 0.75f);
		pricelist.put("CoffeeWithMilk",  0.20f);
		pricelist.put("CoffeeWithSyrup", 0.99f);
	}
	
	public static float getPrice(String coffeetype) {
		float price = 0;
		// should add error checking here for unknown coffee types
		price = pricelist.get(coffeetype);
		return price;
	}
	
	// useful display to refer to when checking that prices add up right
	public static void displayPrices() {
		for (String cof : pricelist.keySet()) {
			System.out.printf("%-15s : �%.2f\n", cof, pricelist.get(cof));
		}
	}
}
