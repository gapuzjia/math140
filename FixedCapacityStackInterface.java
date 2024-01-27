package fa23;

public interface FixedCapacityStackInterface 
{
	public void push(int data);

	public int pop();

	public boolean isEmpty();

	public int size();
	
	public void resize(int cap);
}
