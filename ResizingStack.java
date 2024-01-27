package fa23;

public class ResizingStack <T> implements ResizingStackInterface 
{

	private int size;
	private T[]item;
	
	public ResizingStack(int cap)
	{
		item = (T[])(new Object[cap]);
	}
	

	@Override
	public void push(Object data) 
	{
		if(size == item.length)
			resize(2 * item.length);
		
		item[size++] = (T)(data);
		
	}

	public T pop()
	{
		if(size == item.length/4)
			resize(item.length/2);
		
		return item[--size];
	}


	public boolean isEmpty() 
	{
		return (size == 0);
	}

	public int size() 
	{
		return size;
	}
	
	public void resize(int cap)
	{
		T temp[] =(T[])(new Object[cap]);
		for(int i = 0; i < size; i++)
			temp[i] = item[i];
		
		item = temp;
	}





	

}
