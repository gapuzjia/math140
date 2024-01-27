package fa23;

public interface GenericStackInterface <T>
{
	public void push(T data);

	public T pop();

	public boolean isEmpty();

	public int size();
	
	public void resize(int cap);
}
