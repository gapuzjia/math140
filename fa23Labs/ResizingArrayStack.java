package fa23Labs;

public class ResizingArrayStack <T>
{
	private int size;
	private T[]item;
	
	public ResizingArrayStack(int cap)
	{
		item =(T[]) (new Object[cap]);
	}
	
	
	public void push(T data) 
	{
		if(size == item.length)
		{
			resize(2 * item.length);
		}
			
		
		item[size++] = data;
	}

	//KEEP TRACK OF THIS, OUR CODE IS DIFFERENT
	public T pop() 
	{
		if(size == item.length/4)
		{
			resize(item.length/2);
		}
			
		
		return item[--size];
	}
	
	public T peak()
	{
		return item[size - 1];
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
		T temp[] = (T[])(new Object[cap]);
		for(int i = 0; i < size; i++)
			temp[i] = item[i];
		
		item = temp;
	}

}
