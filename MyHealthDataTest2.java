/**
File name: MyHealthDataTest2
Author: Zachary Bernard 041073789
Course: CST8132 - OOP
Assignment: Assignment01
Date:Oct 15, 2023
Professor: Islam Gomaa
*/

// NOTE: in MyHealthDataBase the incorrectBMI method does 'weight / 703 / weight * height'
// rather than 'weight * 703 / weight * height'.

package assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test class
 * @author Zachary Bernard
   @version 1.0
   @since JRE17
 *
 */
public class MyHealthDataTest2 extends MyHealthDataBase //extended from MyHealthDataBase for easier access to methods
{
	/**
	 * epsilon variable
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * tests calculateBMI method; should succeed
	 */
	@Test //id = 1
	public void testCalculateBMI()
	{		
		double result = super.calculateBMI(1,1);
		double expected = 703; //1(703)/1*1 = 703
	    Assert.assertEquals(expected, result, EPSILON);
		
	}
	
	/**
	 * tests incorrectBMI method; should fail
	 */
	@Test //id = 2
	public void testIncorrectBMI() //parameters and expected value have been inputed as if the method works correctly
	{		
		double result = super.incorrectBMI(1,1);
		double expected = 703; //1(703)/1*1 = 703
	    Assert.assertEquals(expected, result, EPSILON);
		
	}
}
