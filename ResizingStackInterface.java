package fa23;

public interface ResizingStackInterface <T>
{
	public void push(T data);

	public T pop();

	public boolean isEmpty();

	public int size();
	
	public void resize(int cap);
}
