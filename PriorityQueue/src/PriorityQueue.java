import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T> {
	
	public List<Element<T>> heap;
	
	public PriorityQueue()
	{
		heap = new ArrayList<Element<T>>();
	}
	
	public T getMin() throws PriorityQueueEmptyException
	{
		if(heap.size()==0)
			throw new PriorityQueueEmptyException();
		return heap.get(0).value;
	}
	
	public int getSize() throws PriorityQueueEmptyException
	{
		if(heap.size()==0)
			throw new PriorityQueueEmptyException();
		return heap.size() - 1;
	}
	
	public boolean isEmpty()
	{
		return heap.size() == 0;
	}
	
	public void insert(T value, int priority)
	{
		Element<T> newElement = new Element<>(value, priority);
		heap.add(newElement);
		
		int childIndex  = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		
		while(childIndex > 0)
		{
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority)
			{
				Element<T> temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			else
				return;
		}
	}
	
	public T removeMin() throws PriorityQueueEmptyException
	{
		if(heap.size()==0)
			throw new PriorityQueueEmptyException();
		
		T value = heap.get(0).value;
		
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		
		int parentIndex = 0;
		int minIndex = parentIndex;
		
		int leftChildIndex = 2*minIndex + 1;
		int rightChildIndex = 2*minIndex + 2;
		
		while(leftChildIndex < heap.size())
		{
			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority)
				minIndex = leftChildIndex;
			
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority)
				minIndex = rightChildIndex;
			
			if(minIndex == parentIndex)
				break;
			
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex = minIndex;
			leftChildIndex = 2*minIndex + 1;
			rightChildIndex = 2*minIndex + 2;
		}
		return value;
	}
}
