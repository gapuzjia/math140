/********************************************************
 *
 *  Project :  Week 1 - Lab 3
 *  File    :  Week1Lab3.java
 *  Name    :  Jia Gapuz
 *  Date    :  8/25/2023
 *
 *  Description : 
 *
 *    1) Code reverses the contents of the array.
 *    2) Arrays
 *    3) Utilizes a temp variable to swap respective values of the array.
 *    4) No input files used.
 *    5) No output files used.
 *    6) No methods in this code.
 *
 *	Changes: No changes since 8/25/2023
 *
 ********************************************************/

package fa23Labs;

public class Week1Lab3 
{
	public static void main(String[]args)
	{
		//declare and populate array
		int[] array1= {1, 2, 3, 4, 5};
		
		//declare temp variable
		int temp;
		
		for(int i = 0 ; i < array1.length/2; i++)
		{
			temp = array1[array1.length - 1 -i];
			array1[array1.length - 1 - i] = array1[i];
			array1[i] = temp;
		}
		
		//print contents of reversed array
		for(int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
	}
}
