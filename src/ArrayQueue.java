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
	
	public boolean isEmpty()
	{
		return numItems == 0;
	}
	public int dequeue()
	{
		int frontItem = -1;
		if (!isEmpty())
		{
			frontItem = queue[front];
			front++;
		}
		return frontItem;
	}
	
}
