/*
 Jia Gapuz
 9/7/2023
 Week 3 Lab
 */
package fa23Labs;

public class NewTime implements NewTimeInterface
{
	public int hour;
	public int minute;
	public int second;
	
	public NewTime(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public NewTime(String date)
	{
		String[] x = date.split(":");
		this.hour = Integer.parseInt(x[0]);
		this.minute = Integer.parseInt(x[1]);
		this.second = Integer.parseInt(x[2]);
	}
	
	
	
	public int hour()
	{
		return this.hour;
	}
	
	public int minute()
	{
		return this.minute;
	}
	
	public int second()
	{
		return this.second;
	}
	
	public String toString()
	{
		return String.format("%d:%d:%d", this.hour, this.minute, this.second);
	}
	
	public boolean equals(NewTime a)
	{
		if(this == a)
			return true;
		if(a == null)
			return false;
		
		if(a instanceof NewTime)
		{
			if((a.hour == this.hour) && (a.minute == this.minute) && (a.second == this.second))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
	
	
}
