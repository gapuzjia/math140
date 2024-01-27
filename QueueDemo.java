package fa23;

import fa23Labs.Queue;

public class QueueDemo 
{

	public static void main(String[]args)
	{
		Queue<Character> myQueue = new Queue<>();
		
		myQueue.enqueue('c');
		myQueue.enqueue('p');
		myQueue.enqueue('m');
		
		System.out.println(myQueue.size());
		
		System.out.println(myQueue.dequeue());
		
		System.out.println(myQueue.size());
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		
		//handles out of bounds!!
		//can only be in main code
		try 
		{
			System.out.println(myQueue.dequeue());
		}
		catch(RuntimeException e)
		{
			System.out.println("Oops!");
		}
		
		
		
		
	}
}