package fa23;

public class Recursion 
{
	
	public static void main(String[]args)
	{
		System.out.println(factorial(4));
		System.out.println(power(2,4));
		
		int arr[] = {1, 2, 3, 4, 5, 99, 7};
		System.out.println(sum(arr, 0));
		
		int max = arr[0];
		System.out.println(maximum(arr, 0));
	}
	
	public static int factorial(int n)
	{

		//base case
		if(n == 0)//n is what decrements, so n is the flag
			return 1;
		
		return n* factorial(n-1);
		
	}
	
	
	public static int power(int num, int exp)
	{

		//base case
		if(exp == 0) //exp is what decrements, so exp is the "flag"
			return 1;
		
		return num * power(num, exp-1); //call power method again, but send the base num and the current exp value--
		
	}
	
	
	public static int sum(int[]arr, int i)
	{
		if(i == arr.length)
			return 0;
		
		return arr[i] + sum(arr, i + 1);
	}
	
	
	public static int maximum(int[] arr, int i)
	{

		if(i == arr.length - 1)
			return arr[arr.length - 1];
		
		return Math.max(arr[i], maximum(arr, i + 1));
	}

}
