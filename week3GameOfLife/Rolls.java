/********************************************************
 *
 *  Project :  Week 2 Lab 1 - Rolling a Die
 *  File    :  Rolls.java
 *  Name    :  Jia Gapuz
 *  Date    :  09/03/23
 *
 *  Description :
 *
 *    1) The code simulates rolling a die and counting the occurrences of each of the six sides
 *    2) Arrays
 *    3) Random number generator algorithm
 *    4) No input files
 *    5) No output files
 *    6) No methods
 *
 *  Changes :  No changes since 09/03/23
 *
 ********************************************************/
package week3GameOfLife;

import week4SimpleCompiler.Counter;

public class Rolls 
{
	public static void main(String[]args)
	{
		Counter rolls[] = new Counter[6];
		int side;
		
		//populate array of Counters
		for(int i = 0; i < rolls.length; i++)
		{
			rolls[i] = new Counter("Side " + i);
			
		}
		
		//simulate rolling a die 30 times
		//increment the index of the die that is rolled
		for(int i = 0; i < 30; i++)
		{
			side = (int)(Math.random()*6);
			rolls[side].increment();
		}
		
		//print final outputs
		System.out.printf("Number of \nOccurrences    Side\n");
		System.out.println("---------------------");
		for(int i = 0; i < rolls.length; i++)
		{
			System.out.println(rolls[i]);
		}
	}
	
}	
