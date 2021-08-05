
public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueEmptyException {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.insert(10, 10);
		pq.insert(8, 8);
		pq.insert(6, 6);
		pq.insert(2, 2);
		pq.insert(3, 3);
		pq.insert(1, 1);
		
		pq.heap.forEach(temp -> {
			System.out.print(temp.value + " ");
		});
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.removeMin());
		}
		
	}
	
}
