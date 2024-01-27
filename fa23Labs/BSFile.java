/********************************************************
 *
 *  Project :  Week 7 Lab - Binary Search Recursive
 *  File    :  BSFile.java
 *  Name    :  Jia Gapuz
 *  Date    :  10/5/2023
 *
 *  Description : (Narrative desciption, not code)
 *
 *    1) Code uses the binary search method to look for a key in the file
 *    2) Arrays
 *    3) Binary search algorithm
 *    4) Input files used
 *    	largeAllowlist.txt
 *    5) No output files are generated
 *    6) Methods
 *    	 public static int rank(int key, int[] a)
 *    	 public static int rankRecursive(int key, int[]a, int low, int hi)
 *
 *  Changes :  No changes since 10/5/2023
 *
 ********************************************************/

package fa23Labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BSFile
{

    public static void main(String[]args) throws FileNotFoundException
    {
        // Open the file for reading.
        File file = new File("C:\\Users\\Jia Gapuz\\eclipse-workspace\\testing\\src\\fa23Labs\\largeAllowlist.txt");
        Scanner inputFile = new Scanner(file);
        int arraySize = inputFile.nextInt();
        int[] whitelist = new int[arraySize];

        Scanner sc = new Scanner(System.in);
        int key;
        
        if (!file.exists())
        	System.out.println("No file");
        // Read all of the values from the file
        
        for (int i = 0; i < arraySize; i++)
            // Read a value from the file.

            whitelist[i] = inputFile.nextInt();

        System.out.println("Enter a key to look in whitelist: ");
        key = sc.nextInt();

        Arrays.sort(whitelist);

        System.out.println("Recursive " + rankRecursive(key, whitelist, 0, whitelist.length -1 ) );
        // Read key, print if not in whitelist.
        //Displays -1 if key is not in whiltelist.
        //Displays the index of key is in whiltelist.
        System.out.println(rank(key, whitelist)); 
         
        // Close the file.
        inputFile.close();

    }

    public static int rank(int key, int[] a)
    { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
    
    public static int rankRecursive(int key, int[]a, int low, int hi)
    {
    	int mid = low + (hi - low) / 2;

    	
    	//if the subscript of low is greater than high, the key does not exist in the file
    	if (low > hi)
    		return -1;	
    	
    	if(key > a[mid])
    		return rankRecursive(key, a, mid + 1, hi);
    	
    	if(key < a[mid])
    		return rankRecursive(key, a, low, mid - 1);
    	
    	return a[mid];
   
    }



}
