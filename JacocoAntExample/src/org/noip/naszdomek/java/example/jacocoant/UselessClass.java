package org.noip.naszdomek.java.example.jacocoant;

/**
 * This class is providing methods which should be tested
 * 
 * @author bartosz.tomaszewski
 * 
 */
public class UselessClass {

	/**
	 * Useless method which returns integer and has multiple paths in its body.
	 * 
	 * @param a
	 *            useless parameter 1
	 * @param b
	 *            useless parameter 2
	 * @return useless value
	 */
	public int method1(int a, int b) {
		if (a > b) {
			int result = a * b;
			if (result > 100) {
				return 1;
			} else {
				return result;
			}
		}
		if (a == b) {
			return a + b;
		} else {
			return (a / b) + 100;
		}
	}

	/**
	 * Useless method 2 which uses useless method 1
	 * 
	 * @param a
	 *            useless parameter
	 * @return useless value
	 */
	public int method2(int a) {
		if (a == 777) {
			return this.method1(a, 444);
		} else {
			return a % 777;
		}
	}
}
