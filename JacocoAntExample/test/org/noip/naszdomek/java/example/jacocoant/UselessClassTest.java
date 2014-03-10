package org.noip.naszdomek.java.example.jacocoant;

import static org.junit.Assert.*;

import org.junit.Test;
import org.noip.naszdomek.java.example.jacocoant.UselessClass;

/**
 * jUnit tests for UselessClass
 * 
 * @author bartosz.tomaszewski
 *
 */
public class UselessClassTest {

	/**
	 * Test method for {@link org.noip.naszdomek.java.example.jacocoant.UselessClass#method1(int, int)}.
	 */
	@Test
	public void testMethod1() {
		UselessClass classUnderTest = new UselessClass();
		
		int a = 100;
		int b = 2;
		
		int result = classUnderTest.method1(a, b);
		
		assertEquals(1, result);
		
	}

	/**
	 * Test method for {@link org.noip.naszdomek.java.example.jacocoant.UselessClass#method2(int)}.
	 */
	@Test
	public void testMethod2() {
		UselessClass classUnderTest = new UselessClass();
		
		int a = 100;
		
		int result = classUnderTest.method2(a);
		
		assertEquals(100, result);
		
	}

}
