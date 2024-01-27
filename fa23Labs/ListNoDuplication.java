/********************************************************
 *
 *  Project :  Week 5 Linked Lists Part 2
 *  File    :  ListNoDuplication.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 *
 *  Description : 
 *
 *    1) Code adds elements to linked list, and deletes duplications of said element
 *    2) Linked Lists
 *    3) No algorithms are used
 *    4) No input files are used.
 *    5) No output files are generated
 *    6) No methods are implemented 
 *
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/
package fa23Labs;

import week5LinkedLists.LinkedList;

public class ListNoDuplication 
{
	public static void main(String[]args)
	{
		LinkedList<Integer> a = new LinkedList<>();
		a.removeDuplicate(12);
		a.removeDuplicate(13);
		a.removeDuplicate(14);
		a.removeDuplicate(12);// to check if the duplicated node is the last node
		a.removeDuplicate(12); // to check if the duplicated node is the first node
		a. removeDuplicate(14); // to check if the duplicated node is one of the middle nodes
		System.out.println(a);
	}
}
