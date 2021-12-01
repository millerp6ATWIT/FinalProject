package data.structs;
import java.util.Arrays;

public class List<T> implements ListInterface<T> {

	private T[] list;
	private int numberOfEntries;
	private boolean integrityOK;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	
	public List()
	{
		this(DEFAULT_CAPACITY);
	}
	public List(int initialCapacity)
	{
		integrityOK = false;
	
		if (initialCapacity < DEFAULT_CAPACITY)
		{
			initialCapacity = DEFAULT_CAPACITY;
		}
		else
		{
			checkCapacity(initialCapacity);
			@SuppressWarnings("unchecked")
			T[] tempList = (T[])new Object[initialCapacity + 1];
			list = tempList;
			numberOfEntries = 0;
			integrityOK = true;
		}
	}
	
	@Override
	public void add(T newEntry) {
		checkIntegrity();
		list[numberOfEntries + 1] = newEntry;
		numberOfEntries++;
		ensureCapacity();		
	}

	@Override
	public void add(int index, T newEntry) {
		checkIntegrity();
			if ((index >= 1) && (index <= numberOfEntries + 1))
			{
				if (index <= numberOfEntries)
				makeRoom(index);
				list[index] = newEntry;
				numberOfEntries++;
				ensureCapacity();
		}
		else
		throw new IndexOutOfBoundsException(
		"Given position of add's new entry is out of bounds.");
	}

	@Override
	public T remove(int index) {

		checkIntegrity();
		if ((index >= 1) && (index <= numberOfEntries))
		{
			T result = list[index];
			if (index < numberOfEntries)
			{
				removeGap(index);
			}
			list[numberOfEntries] = null;
			numberOfEntries--;
			return result;
		}
		else
		{
			throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
		}
	}

	@Override
	public void clear() {
		for(int i = 0; i < numberOfEntries;i++) {
			list[i] = null;
		}
		numberOfEntries = 0;
	}

	@Override
	public T set(int index, T anEntry) {
		list[index] =  anEntry;
		return null;
	}

	@Override
	public T get(int index) {
		return list[index];
	}

	@Override
	public boolean contains(Object anEntry) {
		checkIntegrity();
		boolean found = false;
		int index = 1;
		while (!found && (index <= numberOfEntries))
		{
		if (anEntry.equals(list[index]))
		found = true;
		index++;
		}
		return false;
	}

	@Override
	public int size() {
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
		}
	private void checkIntegrity()
	{
		if (!integrityOK) {
			throw new SecurityException("List object is corrupt.");
		}
	}
	private void ensureCapacity()
	{
		int capacity = list.length - 1;
		if (numberOfEntries >= capacity)
		{
			int newCapacity = 2 * capacity;
			checkCapacity(newCapacity);
			list = Arrays.copyOf(list, newCapacity + 1);
		} 
	}
	private void checkCapacity(int capacity)
	{
		if (capacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a list whose " +"capacity exeeds allowed " +	"maximum of " + MAX_CAPACITY);
	}
	private void makeRoom(int givenPosition)
	{
		int newIndex = givenPosition;
		int lastIndex = numberOfEntries;
		for (int index = lastIndex; index >= newIndex; index--)
		{
			list[index + 1] = list[index];
		}
	}
	private void removeGap(int givenPosition)
	{
		int removedIndex = givenPosition;
		for (int index = removedIndex; index < numberOfEntries; index++)
		list[index] = list[index + 1];
	}
}
