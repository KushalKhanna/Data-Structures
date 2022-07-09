package queue;

public class QueueUse {
	
	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		Queue q = new Queue();
		
		q.push(10);
		q.push(2);
		
		System.out.println("Popped element : " + q.pop());
		System.out.println("Popped element : " + q.pop());
		System.out.println("Size : " + q.size());
//		System.out.println("Popped element : " + q.pop());	UNDERFLOW EXCEPTION
		
		q.push(6);
		q.push(9);
		
		System.out.println("Top element : " + q.top());
		
		q.push(42);
		
		System.out.println("Size : " + q.size());
		q.print();
		
		System.out.println("Popped element : " + q.pop());
		System.out.println("Popped element : " + q.pop());
		
		System.out.println("Size : " + q.size());
		q.print();
		
	}

}