
/********************************************************
*
*  Project :  Merge Project
*  File    :  MergeProject.java
*  Name    :  Jia Gapuz
*  Date    :  10/29/2023

*  Changes :  No changes since 10/29/2023
*
********************************************************/
package week9MergeSortUsingQueues;
public class MergeProject
{

    private static Queue merge(Queue<Integer> queueA, Queue<Integer> queueB)
    {

       Queue<Integer> auxQueue = new Queue();
       int sizeA = queueA.size();
       int sizeB = queueB.size();
       
       for(int i = 0; i < sizeA; i++)
       {
    	   auxQueue.enqueue(queueA.dequeue());
       }
       
       for(int i = 0; i < sizeA + sizeB; i++)
       {
    	   if(auxQueue.isEmpty())
    		   queueA.enqueue(queueB.dequeue());
    	   
    	   else if(queueB.isEmpty())
    		   queueA.enqueue(auxQueue.dequeue());
    	   
    	   else if(less(auxQueue.peek(),queueB.peek()))
    		   queueA.enqueue(auxQueue.dequeue());
    	   
    	   else
    		   queueA.enqueue(queueB.dequeue());
       }
       
       
       return queueA;
    }

    /**
     * *************************************************************************
     * Helper sorting function.
     * *************************************************************************
     */
    // is v < w ?
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    // print array to standard output
    private static void show(Queue a)
    {
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        Queue<Integer> num1List = new Queue<>();
        Queue<Integer> num2List = new Queue<>();
        Queue<Integer> num3List = new Queue<>();
        num1List.enqueue(12);
        num1List.enqueue(26);
        num1List.enqueue(35);
        num1List.enqueue(42);
        System.out.println("First Sorted Queue: " + num1List);

        num2List.enqueue(10);
        num2List.enqueue(27);
        num2List.enqueue(55);
        num2List.enqueue(57);
        System.out.println("Second Sorted Queue: " + num2List);
        
        num3List = merge(num1List, num2List);
        System.out.print("Merged Two Sorted Queues: ");
        show(num3List);
    }
}
