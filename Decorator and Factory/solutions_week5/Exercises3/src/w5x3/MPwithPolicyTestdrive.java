package w5x3;

import w4x1.*;

/*
 * Very simple test drive class, we create one MP using class from a previous exercise, 
 * assign some policies, the call speechify which is overridden also to show the policies.
 * 
 */


public class MPwithPolicyTestdrive {

	public static void main(String [] args) {
		MPwithPolicyTestdrive td = new MPwithPolicyTestdrive();
		td.go();
	}
	
	// run the test
	private void go(){
		MP cal = MPFactory.getInstance(PolType.GREEN, "Caroline", "Lucas");
		MPwithPolicy cal_x = adoptPolicies(cal);
		cal_x.speechify();
	}
	
	// let our MP adopt up to 5 policies ...
	private MPwithPolicy adoptPolicies(MP mp) {
		int num = (int)(Math.random() * 5) + 1; // random 1...5 policies
		MP tmpMP = mp;
		for (int i = 1 ; i <= num; i++) {
			tmpMP = new MPwithPolicy(tmpMP); // decorator loop
		}		return (MPwithPolicy) tmpMP;
	}
}
