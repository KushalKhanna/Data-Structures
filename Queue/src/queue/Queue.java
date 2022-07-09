package queue;

public class Queue {

	int[] data;
	int n;
	int first;
	int last;
	int size;
	
	public Queue() {
		data = new int[5];
		n = 5;
		first = -1;
		last = -1;
		size = 0;
	}
	
	int top() throws QueueUnderflowException {
		if(first == -1) {
			throw new QueueUnderflowException();
		}
		return data[first];
	}
	
	int size() throws QueueUnderflowException {
//		if(first == -1) {
//			throw new QueueUnderflowException();
//		}
		return size;
	}
	
	void push(int num) throws QueueOverflowException {
		if(size == n) {
			throw new QueueOverflowException();
		}
		
		if(last == -1) {
			first = 0;
			last = 0;
		}
		
		data[last] = num; 
		size++;
		last++;
	}
	
	int pop() throws QueueUnderflowException {
		if(first == -1) {
			throw new QueueUnderflowException();
		}
//		if(size == n+1) {
//			throw new QueueOverflowException();
//		}
		int temp = data[first];
		if(size == 1) {
			first = -1;
			last = -1;
		} else {
			first++;
		}
		size--;
		return temp;
	}
	
	void print() {
		for(int i=first; i<last; i++) {
			System.out.println(data[i]);
		}
	}
}
