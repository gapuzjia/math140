package week8SortingCars;

public class Shell 
{
	// This class should not be instantiated.
	private Shell() { }
	/**
	* Rearranges the array in ascending order, using the natural order.
	* @param a the array to be sorted
	*/
	
	public static void sort(Comparable[] a) 
	{
		int n = a.length;
		// 3x+1 increment sequence: 1, 4, 13, 40, 121, 364, 1093, ...
		int h = 1;
		while (h < n/3) h = 3*h + 1;
		while (h >= 1) 
		{
			// h-sort the array
			for (int i = h; i < n; i++) 
			{
				for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) 
				{
					exch(a, j, j-h);
				}
			}
			System.out.println("h = "+h);
			h = h/3;
			}
		}
	
	/***************************************************************************
	* Helper sorting functions.
	***************************************************************************/
	// is v < w ?
	
	private static boolean less(Comparable v, Comparable w) 
	{
		return v.compareTo(w) < 0;
	}
	// exchange a[i] and a[j]
	
	private static void exch(Object[] a, int i, int j) 
	{
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	/***************************************************************************
	* Check if array is sorted - useful for debugging.
	***************************************************************************/
	public static boolean isSorted(Comparable[] a) 
	{
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i-1])) return false;
		return true;
	}
	
	// print array to standard output
	private static void show(Comparable[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
		System.out.println("");
	}
	/**
	* Reads in a sequence of strings from standard input; Shellsorts them;
	* and prints them to standard output in ascending order.
	*
	* @param args the command-line arguments
	*/
	
	public static void main(String[] args) 
	{
		String str = "NGELLEXAMFINALSPRISH";
		String[] a = str.split("");
		// String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		show(a);
		Shell.sort(a);
		show(a);
	}
}
