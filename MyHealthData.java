/**
File name: MyHealthData
Author: Zachary Bernard 041073789
Course: CST8132 - OOP
Assignment: Assignment01
Date:Oct 15, 2023
Professor: Islam Gomaa
*/

package assignment1;

/**
 * MyHealthData stores info about a patient and calls on MyHealthDataBase to perform BMI calculations
 * @author Zachary Bernard
   @version 1.0
   @since JRE17
 *
 */
public class MyHealthData extends MyHealthDataBase
{


    //START CODE
	/**
	 * stores customers first name
	 */
	private String firstName;
	/**
	 * stores customers last name
	 */
	private String lastName;
	/**
	 * stores customers gender
	 */
	private String gender;
	/**
	 * stores customers birth year
	 */
	private int birthYear;
	/**
	 * stores the current year
	 */
	private int currentYear;
	/**
	 * stores customers height
	 */
	private double height;
	/**
	 * stores customers weight
	 */
	private double weight;
    //END CODE


    // TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
    //START CODE
	
	/**
	 *  constructor - assigns values to all attributes.
	 *  @param firstName - patients first name
	 *  @param lastName - patients last name
	 *  @param gender - patients gender
	 *  @param weight - patients weight in pounds
	 *  @param height - patients height in inches
	 *  @param birthYear - year of patients birth
	 *  @param currentYear - the current year 
	 */
	
	MyHealthData(String firstName, String lastName, String gender, double weight, double height, int birthYear, int currentYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.birthYear = birthYear; 
		this.currentYear = currentYear;
	}
	
    //END CODE



    //TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE.
	
	/**
	 * getter for firstName
	 * @return firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * setter for First Name
	 * @param firstName 
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * Getter for lastName
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Setter for LastName
	 * @param lastName
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * Getter for gender
	 * @return gender
	 */
	public String getGender()
	{
		return gender;
	}
	
	/**
	 * Setter for gender
	 * @param gender
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	
	/**
	 * Getter for birthYear
	 * @return birthYear
	 */
	public int getBirthYear()
	{
		return birthYear;
	}
	
	/**
	 * Setter for birthYear
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear)
	{
		this.birthYear = birthYear;
	}
	

	/**
	 * Getter for currentYear
	 * @return currentYear
	 */
	public int getCurrentYear()
	{
		return currentYear;
	}
	
	/**
	 * getter for height
	 * @return height
	 */
	public double getHeight()
	{
		return height;
		
	}
	
	/**
	 * setter for height
	 * @param height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * getter for weight
	 * @return weight
	 */
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * setter for weight
	 * @param weight
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Calculates and returns the patients age using the currentYear and birthYear
	 * @return age
	 */
	public int getAge()
	{
		int age = currentYear - birthYear;
		return age;
	}	
	
	/**
	 * calculates the maximum heart rate
	 * @return maximumHeartRate
	 */
	public int getMaximumHeartRate() 
	{
		int maximumHeartRate = 220 - this.getAge();
		return maximumHeartRate;
	}
	
	/**
	 * calculates the minimum heart rate in the heart rate range
	 * @return minimumTargetHeartRate
	 */
	public double getMinimumTargetHeartRate()
	{
		double minimumTargetHeartRate = this.getMaximumHeartRate() * 0.5;
		return minimumTargetHeartRate;
	}
	
	/**
	 * calculates the maximum heart rate in the heart rate range
	 * @return maximumTargetHeartRate
	 */
	public double getMaximumTargetHeartRate()
	{
		double maximumTargetHeartRate = this.getMaximumHeartRate() * 0.85;
		return maximumTargetHeartRate;
	}
	
	/**
	 * calculates the patients BMI using the super class MyHealthDataBase
	 * @return BMI
	 */
	public double calculateBMI()
	{
		double BMI = super.calculateBMI(weight, height);
		return BMI;
	}

	/**
	 * This method displays all the patients health data
	 */
    public void displayMyHealthData() 
    { 

    //TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.

    // START CODE
    	System.out.printf("First Name: %s%nLast Name: %s%nGender: %s%nBirth Year: %d%nCurrent Year: %d%nAge: %d%nHeight: %f%nWeight: %f%nBMI: %f%nMax Heart Rate: %d%nTarget Heart Range: %f" + " - " + "%f%n", firstName, lastName, gender, birthYear, currentYear, this.getAge(), height, weight, this.calculateBMI(), this.getMaximumHeartRate(), this.getMaximumTargetHeartRate(), this.getMinimumTargetHeartRate());
    //END CODE

    // NOTE: added for formatting
    	System.out.println();
    	
    //You do not need to modify this piece of code, it is fine as it is.

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

} // end class MyHealthData