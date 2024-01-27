package week8SortingCars;

public class Selection 
{
	public static void sort(Comparable[] a)
	{
		int size = a.length;
		for (int i = 0; i < size -1; i++) 
		{
			int min = i;
			
			for (int j = i + 1; j < size; j++)
				if (less(a[j], a[min]))
					min = j;
			
			exch(a, i, min);
		}
	}
	
	//helper methods
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
