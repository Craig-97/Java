package w5x3;

import w4x1.*;
import w5x2.*;

/*
 * MPwithPolicy is implemented as decorator of the MP class used in w4x1. In line with the earlier example,
 * each decorator adds a single policy, but the MP may be decorated multiple times. For the various methods
 * of MP, instead of their implementation being inherited from the superclass MP, they are delegated to 
 * the decorated base MP.
 * 
 * Since this class extends MP, it also has has the ID instance variable, but as the decorator does not represent
 * a separate MP and does not need a separate identity, in the no-arg constructor of MP, the ID is just
 * set to zero; the getter method is delegated to the base MP of course. (The no-arg MP constructor is 
 * implicitly called by the MPwithPolicy constructor).
 * 
 * The decorator checks the type of its base MP in speechify, so that a message introducing the policies 
 * can be output once and at the correct point.
 * 
 */


public class MPwithPolicy extends MP {
	private MP baseMP;
	private String myPolicy;
	
	public MPwithPolicy(MP mp) {
		baseMP = mp; 
		myPolicy = Policy.getPolicy().toString(); // use the policy factory
		}
	
	@Override
	public int getID() {
		return baseMP.getID();
	}

	@Override
	public void speechify() {
		baseMP.speechify();
		if (!(baseMP instanceof MPwithPolicy))
			System.out.println("Policies? I advocate the following :-");
		System.out.println("---" + myPolicy);
	}

	@Override
	public void beliefUTurn(BeliefBehaviour newbb) {
		baseMP.beliefUTurn(newbb);
	}

	@Override
	public void homeUTurn(HomeBehaviour newhb) {
		baseMP.homeUTurn(newhb);
	}

	@Override
	public String toString() {
		return baseMP.toString();
	}
}
