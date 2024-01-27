/********************************************************
 *
 *  Project :  Week 6 Reversing A String
 *  File    :  Stack.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 *
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/

package week4SimpleCompiler;

public class Stack <T> implements Stackable <T>
{

	private int size;
	private Node first;
	
	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	public void push(T item) 
	{
		size++;
		Node oldFirst = first;
		first = new Node();
		first.data = item;
		first.next = oldFirst;
	}

	@Override
	public T pop() 
	{
		Node temp;
		if(isEmpty())
			throw new RuntimeException("Pop from an empty stack :(((("); //custom error message
		
		temp = first;
		first = first.next;
		size--;
		return temp.data;
	}
	
	public T peek()
	{
		return first.data;
	}
	
	private class Node
	{
		private T data;
		private Node next;
	}

}