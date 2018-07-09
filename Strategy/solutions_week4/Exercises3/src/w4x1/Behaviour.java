package w4x1;

/*
 * Main (abstract) behaviour class, perform method to be implemented by subclasses.
 */

abstract class Behaviour {
	
	// this is the key method to exhibit behaviour
	// must be implemented by subclasses
	public abstract void perform();
	
	// useful aux method to shorten output code
	public void say(String soundbyte) {
		System.out.println(soundbyte);
	}
	
}
