/********************************************************
 *
 *  Project :  Week 8 Project Sorting Cars
 *  File    :  Cars.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/21/2023
 *
 *  Description : 
 *
 *    1) The following code sorts cars given attributes such as color, make, year, and license plate number
 *    2) Arrays
 *    3) Selection sort, Insertion sort, and Shell sort
 *    4) Cars.csv files
 *    5) Sort.csv
 *
 *  Changes :  No changes since 10/21/2023
 *
 ********************************************************/
package week8SortingCars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class CarsDemo 
{
	public static void main(String[]args)throws FileNotFoundException
	{
		//declare variable for user's selection
		int x;
		
		//declare scanner for user's input
		Scanner scnr = new Scanner(System.in);
		
		// Open the file for reading.
        File file = new File("C:\\Users\\Jia Gapuz\\eclipse-workspace\\testing\\src\\fa23Labs\\Cars10.csv");
        Scanner inputFile = new Scanner(file);
        
        //input array size from file
        int arraySize = inputFile.nextInt();
        String str = inputFile.nextLine();
        
        //declare array of cars
        Cars[] carsToBeSorted = new Cars[arraySize];
        
        for(int i = 0; i < arraySize; i++)
        {
        	carsToBeSorted[i] = new Cars(inputFile.nextLine());
        }
        
        // Close the file.
        inputFile.close();
        
        System.out.println("Please enter a value 1, 2 or 3: ");
        System.out.print("Enter 1 for Selection Sort\n"
        		+ "Enter 2 for Insertion Sort\n"
        		+ "Enter 3 for Shell Sort\n\n"
        		+ "Your selection: ");
        
        x = scnr.nextInt();
         
        //selection sort
         if(x == 1)
         {
        	 System.out.println("You chose Selection sort.");
        	 Stopwatch stopwatch = new Stopwatch();
        	 Selection.sort(carsToBeSorted);
        	 System.out.println("Time elapsed: " + stopwatch.elapsedTime() + "s");

         }
        	 
        //insertion sort
         else if(x == 2)
         {
        	 System.out.println("You chose Insertion sort."); 
        	 Stopwatch stopwatch = new Stopwatch();
        	 Insertion.sort(carsToBeSorted);
        	 System.out.println("Time elapsed: " + stopwatch.elapsedTime() + "s");

         }
         
         //shell sort
         else if(x == 3)
         {
        	 System.out.println("You chose Shell sort.");
        	 Stopwatch stopwatch = new Stopwatch();
        	 Shell.sort(carsToBeSorted);
        	 System.out.println("Time elapsed: " + stopwatch.elapsedTime() + "s");
         }
        	 
         else
         {
        	 System.out.println("Invalid input!");
         }
         
       //declare file write
 		PrintWriter outputFile = new PrintWriter("C:\\Users\\Jia Gapuz\\Desktop\\Sort.csv");
 		
 		for(int i = 0; i < arraySize; i++)
 		{
 			outputFile.print(carsToBeSorted[i]);
 		}
 		
 		//close output file
 		outputFile.close();
 		
 		//print to console that data was written to file
 		System.out.println();
 		System.out.println("Data written to file.");
 		
       
        
	}
	
}
