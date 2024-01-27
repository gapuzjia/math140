package fa23;
public class FixedCapacityStackDemo 
{

	public static void main (String[]args)
	{
		ResizingStack resizingStack = new ResizingStack(2);
		int temp;
		
		resizingStack.push(6);
		resizingStack.push(4);
		resizingStack.push(23);
		resizingStack.push(253);
		resizingStack.push(523);
		resizingStack.push(2);
		resizingStack.pop();
		resizingStack.pop();
		resizingStack.pop();
		
		System.out.println(resizingStack.size());
		
		
		
		
	}
}
