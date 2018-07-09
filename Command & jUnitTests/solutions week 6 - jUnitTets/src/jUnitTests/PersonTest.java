package jUnitTests;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testHappyBirthday() {
		Person p1 = new Person();
		int age = 21;
		
		p1.setAge(age);
		p1.happyBirthday();
		
		int actual, expected;
		
		actual = p1.getAge();
		expected = age + 1;
		
		assertTrue(actual == expected);
	}

	public void testSetAge() {
		Person p1 = new Person();
		int age = 21;
		
		p1.setAge(age);
		
		int actual, expected;
		
		actual = p1.getAge();
		expected = age;
		
		assertTrue(actual == expected);
	}

}
