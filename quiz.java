package fa23;

public class quiz 
{
	public static void main(String[]args)
	{
		
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = {0, 0, 0, 0, 0, 0, 0};
		
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
}


