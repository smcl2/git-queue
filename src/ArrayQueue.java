
public class ArrayQueue {
	
	int [] queue;
	int front,back,numItems;
	public ArrayQueue(int size)
	{
		queue = new int[size];
		front = 0;
		back = -1;
		numItems = 0;
	}
	
	public boolean isFull()
	{
		return numItems == queue.length;
	}
	public boolean enqueue(int newItem)
	{
		if (!isFull())
		{
			back++;
			queue[back] = newItem;
			return true;
		}
		return false;
	}
	
}
