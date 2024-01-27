/********************************************************
 *
 *  Project :  Week 5 Linked Lists Part 2
 *  File    :  LinkedList.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/
package week5LinkedLists;

public class LinkedList <T>
{
	//creating LinkedList automatically creates a null Node
			private Node first;
			
			//add method adds a node to the start of the list
			public void add(T item)
			{
				
				Node oldFirst = first; //assign old first to current first
				first = new Node(); //create new node an assign to first
				first.data = item; //put value in new node (first)
				first.next = oldFirst; //assign first.next to old first's address
			}
			
			public void removeFirst()
			{
				if(first == null)//check if the linked list is empty
					System.out.print("Can't remove, LinkedList is empty!");
				else
					first = first.next;
			}
			
			public void insertNode(Node cn, T item)
			{
				Node newNode = new Node(); //create a new node
				newNode.data = item; //populate node
				
				newNode.next = cn.next; //new node's next is current node's next
				cn.next = newNode; //current node's next is new node
			}
			
			public void insertAfter(T key, T item)
		    {
		        //Create a node named newNode with the newItem
				Node newNode = new Node();
				newNode.data = item;
				boolean keyExists = false;

				//search for key in linked list, if key exists, add after key
				for(Node current = first; current != null; current = current.next)
				{
					if(current.data == key)
					{
						newNode.next = current.next;
						current.next = newNode;
						keyExists = true;
					}
				}

				//if key does not exist in linked list, prepend to list
				if(!keyExists)
				{
					newNode.next = first;
					first = newNode;
				}
		    }
			
			public void removeAfter(T key)
			{
				for(Node current = first; current.next != null; current = current.next)
				{
					if(current.data == key)
						current.next = current.next.next;
				}
			}
			
			public void removeDuplicate(T key)
			{
				//prepend element to linked list
				this.add(key);
				
				Node preNode = first;
				boolean duplicate = false;
				
				//start traversing list at second element
				for(Node current = first.next; current != null && !duplicate; current = current.next)
				{

					if(current.data == key)
					{
						preNode.next = current.next;
						duplicate = true;
					}
					
					//update preNode
					preNode = current;		
				}
			}
			
			//.printList traverses and prints contents of LinkedList
			public void printList()
			{
				//assign current node to first node
				Node currentNode = first;
				
				while(currentNode.next != null) //keep traversing until .next points to nothing
				{
					System.out.println(currentNode.data);
					currentNode = currentNode.next; //assign 
				}
			}
			
			
			//uses a for loop!
			//returns a string
			public String toString()
			{
				String str = "";
				
				for(Node currentNode = first; currentNode != null; currentNode = currentNode.next)
				{
					str = str + currentNode.data + " ";
				}
				
				return str;
			}
			
			public boolean search(T key)
			{
				Node cn = first; //nc means current node
				boolean found = false;
				
				while(cn != null && !found)
				{
					//need to make .equals method to compare whatever object is in nodes
					if(cn.data.equals(key))
						found = true;
					else
						cn = cn.next;
				}
				
				return found;
			}
			
			//CAN HAVE MULTIPLE CLASSES IN CLASS, but only the father class is public
			//"baby class" node is inside LinkedList class
			private class Node
			{
				private T data;
				private Node next;
			}
}
