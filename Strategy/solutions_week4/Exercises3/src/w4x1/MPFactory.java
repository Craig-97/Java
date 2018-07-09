package w4x1;

/*
 * I have used an MP factory (not mentioned in the question) to create MPs and wire up their
 * default behaviours. The alternative would be to create a subclass for each type of MP and
 * wire up default behavour in the constructor of the subclass. Either approach is acceptable.
 * 
 * Using the factory reduces the number of classes in the solution, and pulls all the default
 * behaviours into one place.  However, it would need to be updated if new types of MP were
 * ever added in the future.
 * 
 * 
 */
public class MPFactory {
	
	static int lastid = 0; // assing sequential identifiers
	
	public static MP getInstance(PolType party, String fname, String sname) {
		lastid++;
		switch (party) {
			case GREEN : 
				return new MP(lastid, party, fname, sname, 
							new RecyclingBehaviour(),
							new TreeBehaviour());
			case LIBDEM :
				return new MP(lastid, party, fname, sname, 
						new DaftBehaviour(),
						new CloudBehaviour());
			case LAB :
				return new MP(lastid, party, fname, sname, 
						new JobBehaviour(),
						new BungalowBehaviour());
			case CON :
				return new MP(lastid, party, fname, sname, 
						new KnowBestBehaviour(),
						new MansionBehaviour());
			default : 
				throw new RuntimeException("Unknown political type!");
			}
	}
}
