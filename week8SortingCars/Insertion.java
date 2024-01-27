package week8SortingCars;

public class Insertion 
{
	public static void sort(Comparable[] a)
	{
		int size = a.length;
		for (int i = 1; i < size; i++) 
		{
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) 
			{
				exch(a, j, j-1);
			}
		}
	}
	
	//if v < w
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
