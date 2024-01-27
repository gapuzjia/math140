/********************************************************
 *
 *  Project :  Week 6 Reversing A String
 *  File    :  Queue.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 *
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/

package fa23Labs;

public class Queue <T>
{
	private int size;
	private Node first;
	private Node last;
	
	//our code looks diff, we didn't use an old last
	//pay attention to this
	public void enqueue(T item)
	{

		Node newNode = new Node();
		newNode.item = item;
		
		if(isEmpty())
		{
			first = newNode;
			last = newNode;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
		
		size++;
		
	}
	
	public T dequeue()
	{
		//check if queue is empty
		if(isEmpty())
			throw new RuntimeException("Dequeue from an empty queue");
		
		//store first element in a temp value to return later
		T temp = first.item;
		first = first.next;
		size--;
		
		//check if queue is empty after dequeue
		//if so, adjust last
		if(isEmpty())
			last = null;
		
		return temp;
		
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}

	private class Node
	{
		private T item;
		private Node next;
	}
}