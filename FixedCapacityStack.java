package fa23;

//NON GENERIC
public class FixedCapacityStack implements FixedCapacityStackInterface
{
	private int size;
	private int[]item;
	
	public FixedCapacityStack(int cap)
	{
		item = new int[cap];
	}
	
	public void push(int data) 
	{
		if(size == item.length)
			resize(2 * item.length);
		
		item[size++] = data;
	}


	@Override
	public int pop() 
	{
		if(size == item.length/4)
			resize(item.length/2);
		
		return item[--size];
	}

	@Override
	public boolean isEmpty() 
	{
		return (size == 0);
	}

	@Override
	public int size() 
	{
		return size;
	}
	
	public void resize(int cap)
	{
		int temp[] = new int[cap];
		for(int i = 0; i < size; i++)
			temp[i] = item[i];
		
		item = temp;
	}


	
}
