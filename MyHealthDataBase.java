/**
File name: MyHealthDataBase
Author: Zachary Bernard 041073789
Course: CST8132 - OOP
Assignment: Assignment01
Date:Oct 15, 2023
Professor: Islam Gomaa

*/

package assignment1;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Zachary Bernard
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/
public class MyHealthDataBase
{	
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam / 703 / (heightParam * heightParam);
    }
}