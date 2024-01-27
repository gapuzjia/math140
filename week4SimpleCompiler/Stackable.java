package week4SimpleCompiler;

public interface Stackable <T>
{
	public int size();
	public boolean isEmpty();
	public void push(T item);
	public T pop();
}