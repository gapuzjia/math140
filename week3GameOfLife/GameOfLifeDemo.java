/********************************************************
 *
 *  Project :  Game of Life
 *  File    :  GameOfLifeDemo.java
 *  Name    :  Jia Gapuz
 *  Date    :  9/8/2023
 *
 *  Description :
 *
 *    1) The code simulates a round of the Game of Life between the user and the computer
 *    2) No data structures
 *    3) Used the random class
 *    4) No input files
 *    5) No output files
 *    6) switchUsers - called to swap which user's turn it is
 *    increment - increments the tally for the counter
 *
 *  Changes :  No changes since 9/8/2023
 *
 ********************************************************/
package week3GameOfLife;
import java.util.*;

import week4SimpleCompiler.Counter;

public class GameOfLifeDemo 
{

	public static void main(String[]args)
	{
		Counter me = new Counter ("Jia");
		Counter computer = new Counter ("Computer");
		final int NUM_OF_SPACES = 30;
		final int EXPRESS_LINE = 13;
		final int PAY_DAY_1 = 6;
		final int PAY_DAY_2 = 23;
		int number;
		
		//scanner for ENTER button
		Scanner scnr = new Scanner(System.in);
		String input;
		
		//initialize for first turn 
		//switches to user on first line of while loop, user still has first turn
		Counter whoseTurn = computer;
		
		while(me.tally() < NUM_OF_SPACES && computer.tally() < NUM_OF_SPACES)
		{
			//switch turns
			whoseTurn = switchUsers(whoseTurn, me, computer);
			
			//prompt user to spin
			if(whoseTurn == me)
			{
				System.out.print("Your turn. Hit ENTER to spin!");
				input = scnr.nextLine();
			}
			else
				System.out.println("Computer's Turn.");
			
			//spin the spinner
			number = (int) (Math.random()*10);
			
			//display spinner result
			System.out.println("The Spinner shows: " + number);
			
			//increment counter and print result
			increment(whoseTurn,number);
			System.out.println(whoseTurn + "\n" );
			
			//check if landed on PAY DAY
			if (whoseTurn.tally() == PAY_DAY_1 || whoseTurn.tally() == PAY_DAY_2)
			{
				System.out.println("PAY DAY! Spin again.");
				switchUsers(whoseTurn, me, computer);
			}
			
			//check if landed on EXPRESS LINE
			if (whoseTurn.tally() == EXPRESS_LINE)
			{
				System.out.println("EXPRESS LINE! Skip 8 spaces ahead.\n");
				increment(whoseTurn, 8);
			}
		}
		
		//print winner to console
		System.out.println("The winner is: " + whoseTurn);
	}
	/****************************************************

	* Method : increment
	*
	* Purpose : The method increments the tally of the counter class
	*
	* Parameters : c - an object Counter
	* num - number of times the counter will increment
	*
	* Returns : void
	*
	****************************************************/
	public static void increment(Counter c, int num)
	{
		for(int i = 0; i < num; i++)
			c.increment();
	}
	
	/****************************************************

	* Method : switchUsers
	*
	* Purpose : switches the user in between turns
	*
	* Parameters : who - an object Counter 
	* me - an object Counter
	* computer - an Object computer
	*
	* Returns : a Counter 
	*
	****************************************************/
	public static Counter switchUsers(Counter who, Counter me, Counter computer)
	{
		if(who == me)
			who = computer;
		else
			who = me;
		
		return who;
	}
	
}
