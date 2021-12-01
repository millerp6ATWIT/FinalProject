package data.structs;

public interface QueueInterface<T> {
	
	public void enqueue(T newEntry);

	public T dequeue();

	public T getFront();
	
	public int size();

	public boolean isEmpty();

	public void clear();
	
}
