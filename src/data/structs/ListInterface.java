package data.structs;

public interface ListInterface <T>{
	public void add(T newEntry);
	public void add(int index, T newEntry);
	public T remove(int index);
	public void clear();
	public T set(int index, T anEntry);
	public T get(int index);
	public boolean contains(Object anEntry);
	public int size(); 
	public boolean isEmpty();
}
