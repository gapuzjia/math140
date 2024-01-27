/********************************************************
 *
 *  Project :  Baby Growth
 *  File    :  growth.java
 *  Name    :  Jia Gapuz
 *  Date    :  08/29/23
 *
 *  Description : (Narrative description, not code)
 *
 *    1) This program determines the length percentile based on a baby’s age and height.
 *    2) 2d arrays
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *    4) BabyGrowth.txt
 *    5) There are no output files generated from this program.
 *    6) findCol - returns the index of the first number that is higher than the baby’s height
 *
 *  Changes :  No changes/ modifications since 08/29/23
 *
 ********************************************************/

package week1BabyGrowth;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class growth 
{
	public static void main(String[]args)throws IOException
	{
		//declare 2d array
		double [][] length = new double [37][9];
		
		//declare variables
		int babyAge;
		double babyHeight;
		
		//declare percentile array
		double[] percentile = {3, 5, 10, 25, 50, 75, 90, 95, 97};
		
		//declare file object and open file
		File file = new File ("C:\\Users\\Jia Gapuz\\Desktop\\BabyGrowth.txt");
		
		//declare scanner to read file data
		Scanner inputFile = new Scanner (file);
		
		//declare scanner
		Scanner scnr = new Scanner (System.in);
		
		//populate 2d array with values from file
		for(int i = 0; i < 37; i++)
		{
			for(int j = 0; j < 9; j++)
				length[i][j] = inputFile.nextDouble();
		}
		
		//close file
		inputFile.close();
		
		//prompt user for baby's height and age
		System.out.print("Enter the baby's age in month between birth(0) to 36 months: ");
		babyAge = scnr.nextInt();
		
		System.out.print("Enter the baby's height in centimeters between 41-104: ");
		babyHeight = scnr.nextDouble();
		
		//print results
		System.out.printf("Baby's percentile is: %.1f%%", percentile[findCol(length[babyAge], babyHeight)]);
		
	}
	
	/**
	 * @param length  - a 2d array of height values
	 * @param babyHeight - baby's height as prompted from user
	 * @return the index of the column the first number greater than babyHeight
	 */
	public static int findCol(double[]length, double babyHeight)
	{
		for(int i = 0; i < 9; i++)
		{
			if (babyHeight < length[i])
				return i;
		}
		//returns last item of the column if no value is larger than baby Height
		return 8;
	}
}
