package data.structs;

public class Queue<T> implements QueueInterface<T> {
	private Node firstNode;

	private int numberOfEntries;

	public Queue() {
		firstNode = null;
		numberOfEntries = 0;
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		if (numberOfEntries == 0) {
			firstNode = new Node(newEntry);
		} else {
			Node currentNode = firstNode.next;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new Node(newEntry);
			numberOfEntries++;
		}
	}

	@Override
	public T dequeue() {
		if (numberOfEntries==0) {
			return null;
		}
		else {
			Node removedNode = firstNode;
			firstNode = firstNode.next;
			numberOfEntries++;
			return removedNode.data;
		}
	}
	
	@Override
	public int size() {
		return numberOfEntries;
	}

	@Override
	public T getFront() {
		return firstNode.data;
	}

	@Override
	public boolean isEmpty() {
		return (numberOfEntries==0);
	}

	@Override
	public void clear() {
		firstNode = null;
		numberOfEntries = 0;

	}

	private class Node {
		private T data; // Entry in bag
		private Node next; // Link to next node

		private Node(T dataPortion) {
			this(dataPortion, null);
		} // end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} // end constructor
	} // end Node

}
