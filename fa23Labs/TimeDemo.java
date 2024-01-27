/*
 Jia Gapuz
 9/7/2023
 Week 3 Lab
 */
package fa23Labs;

public class TimeDemo 
{
	public static void main(String[]args)
	{
		NewTime time1 = new NewTime(1, 2, 3);
		NewTime time2 = new NewTime("1:2:3");
		
		System.out.println(time1);
		System.out.println(time2);
		
		if(time1.equals(time2))
			System.out.println("Same time!");
		else
			System.out.println("Different times.");
		
	}
}


