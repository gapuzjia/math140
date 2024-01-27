/********************************************************
 *
 *  Project :  Week 6 Reversing A String
 *  File    :  ReversingAString.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 *
 *  Description : 
 *
 *    1) This code reverses a string
 *    2) Stacks and Queues
 *    3) Uses string reversal algorithm
 *    4) No input files are used
 *    5) No output files are used
 *    6) No methods implemented in the code
 *
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/

package fa23Labs;

import week4SimpleCompiler.Stack;

public class ReversingAString 
{
	public static void main(String[]args)
	{
		//create stack and queue
		Stack<Character> myStack = new Stack<>();
		Queue<Character> myQueue = new Queue<>();
		
		//declare string
		String inputStr = "aij";
		
		//populate queue with characters from string
		for(int i = 0; i < inputStr.length(); i++)
		{
			myQueue.enqueue(inputStr.charAt(i));
			
		}
		
		//while queue is not empty, dequeue from queue and push into stack
		while(!myQueue.isEmpty())
		{
			myStack.push(myQueue.dequeue());
		}
		
		//while stack is not empty, pop an item from stack and enqueue it to queue
		while(!myStack.isEmpty())
		{
			myQueue.enqueue(myStack.pop());
		}
		
		while(!myQueue.isEmpty())
		{
			System.out.print(myQueue.dequeue());
		}
			
	}
}