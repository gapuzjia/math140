/********************************************************
 *
 *  Project :  Week 5 Linked Lists
 *  File    :  ListClient.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/1/2023
 *
 *  Description : 
 *
 *    1) Purpose of the code is to gain experience with working with linked lists
 *    2) Linked lists
 *    3) No algorithms are used
 *    4) No input files are used
 *    5) No output files are generated
 *    6) No methods are implemented
 *
 *  Changes :  No changes since 10/1/2023
 *
 ********************************************************/
package week5LinkedLists;

public class ListClient 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> grades = new LinkedList<>();
        grades.add(100); // prepend
        grades.add(98); // prepend
        grades.add(87); // prepend
        grades.add(76); // prepend
        grades.insertAfter(100, 99);
        grades.insertAfter(76, 32);
        grades.insertAfter(23, 89); // 23 is not in the list, so 89 will be added to the beginning of the list.
        System.out.println(grades);

        // removeAfter Implementation:
        // Please ensure that your code is handling edge cases like:
        // If you remove an element after the first node.
        // If you remove an element after a middle element.
        // If you attempt to remove the element after the last element, your code should not crash, as there is no such element.
        // If you implement the extra credit, please uncomment the following lines:

        grades.removeAfter(89); // remove the element after the first element
        System.out.println("Removing the element after the first element: " + grades);

        grades.removeAfter(87); // remove the element after a middle element
        System.out.println("Removing the element after a middle element: " + grades);

        grades.removeAfter(99); // remove the element after the last element. Your code should not crash.
        System.out.println("Removing the element after the last element: " + grades);

    }
}
