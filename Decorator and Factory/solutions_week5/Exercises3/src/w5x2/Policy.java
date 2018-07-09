package w5x2;

/*
 * I have done this a bit differently from what the question asked. Instead of returning a policy
 * corresponding to a random number passed in, I made a factory for policies that returns a policy
 * randomly constructed from a list of component parts. This just seemed like more fun!
 * 
 */

public class Policy { // factory class

	private final String description; // this is a statement of the policy
	
	private Policy() {
		description = makePolicy();
	}
	
	public static Policy getPolicy()
	{
		return new Policy();
	}
	
	public String toString() {
		return description;
	}
	
	private String makePolicy() {
		String[] qualifier = {	"no",
								"free",
								"subsidised",
								"state-sponsored",
								"compulsory",
								"better",
								"world-class",
								"half-price",
								"more",
								"unlimited",
								"less"
								};
		String[] resource = {	"housing",
								"transport",
								"healthcare",
								"social integration",
								"eye tests",
								"yoga classes",
								"pet iguanas",
								"education",
								"mentoring",
								"acrylic socks",
								"beer",
								"tofu",
								"pot noodles",
								"pogo sticks",
								"skateboards"
							};
		
		String[] community = {	"Scotland",
								"UK citizens",
								"EU members",
								"politicians",
								"everyone",
								"teachers",
								"students",
								"pensioners",
								"Donald Trump",
								"part-time astronauts",
								"nurses",
								"golfers",
								"piano tuners",
								"saxophonists",
								"vegetarians",
								"atheists",
								"left-handed people",
								"Java programmers"
							};
		String pol;
		// assemble and return random policy
		pol= qualifier[(int)(Math.random()*qualifier.length)] + " " +
				resource[(int)(Math.random()*resource.length)]	+ " for " +
				community[(int)(Math.random()*community.length)];
		return pol;
		}
}
