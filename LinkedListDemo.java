package fa23;

import week5LinkedLists.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[]args)
	{
		//every time you do new LinkedList, a new list is created
		LinkedList<String> myList = new LinkedList();
		
		//INSTEAD, to add nodes to the Linked list, use.add
		//.add adds to the beginning (first) of the linked list
		//can modify the .add method
		myList.add("omg");
		myList.add("adorable");
		myList.add("qt");
		myList.add("HI!!");
		
		//.printList traverses and prints contents of LinkedList
		myList.printList();
		
		//modified toString method for LinkedList
		//uses a for loop !!!
		System.out.println(myList);
		
		//search method checks if argument is in the linked list
		String str = "omg";
		
		if(myList.search(str))
			System.out.println("the string is there!");
		
		//remove the first node in the linked list
		myList.removeFirst();
		System.out.println(myList);
		
		//try linked list on integers!
		LinkedList<Integer> numList = new LinkedList();
		numList.add(3);
		numList.add(4);
		numList.add(6);
		numList.add(9);
		
		if(numList.search(9))
			System.out.println("the number is there!");
		
		
		
		
	}
}
