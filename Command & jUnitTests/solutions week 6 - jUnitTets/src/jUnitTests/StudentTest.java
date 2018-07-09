package jUnitTests;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	public void testSetMatricNumber() {
		Student s1 = new Student();
		double matric = 123456;
		
		s1.setMatricNumber(matric);
		
		double actual, expected;
		
		actual = s1.getMatricNumber();
		expected = matric;
		
		assertTrue(actual == expected);
	}

}
