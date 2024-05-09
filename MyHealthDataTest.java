/**
File name: MyHealthDataTest
Author: Zachary Bernard 041073789
Course: CST8132 - OOP
Assignment: Assignment01
Date:Oct 15, 2023
Professor: Islam Gomaa
*/

package assignment1;

import java.util.Scanner;

/**
 * driver method
 * @author Zachary Bernard
   @version 1.0
   @since JRE17
 *
 */
public class MyHealthDataTest {
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		//scanner open
		Scanner s = new Scanner(System.in);
		//empty myHealthData (current year 2023)
		MyHealthData m = new MyHealthData("","","",0.0,0.0,0,2023);
		
		//UI
		System.out.println("What is your first name?");
		m.setFirstName(s.nextLine());
		System.out.println("What is your last name?");
		m.setLastName(s.nextLine());
		System.out.println("What is your gender?");
		m.setGender(s.nextLine());
		System.out.println("What is your weight?");
		m.setWeight(s.nextDouble());
		System.out.println("What is your height?");
		m.setHeight(s.nextDouble());	
		System.out.println("What is the year of your birth?");
		m.setBirthYear(s.nextInt());
		
		m.displayMyHealthData();

		//scanner close
		s.close();
	}
}
