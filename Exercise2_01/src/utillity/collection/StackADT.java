package utillity.collection;

public interface StackADT<T>
{
	
	public T pop();
	public T peek();
	public int indexOf(T element);
	public boolean isEmpty();
	public int size();
	public void push(T element);
}
