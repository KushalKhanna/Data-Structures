package Stack;

public class Stack {
	
	private int[] data;
	private int n;
	private int index;
	
	public Stack() {
		n = 5;
		data = new int[n];
		index = 0;
	}

	int top() throws StackUnderflowException {
		if(index == 0) {
			throw new StackUnderflowException();
		}
		return data[index-1];
	}
	
	int size() {
		return index;
	}
	
	void push(int num) throws StackOverflowException {
		if(index == n) {
			throw new StackOverflowException();
		}
		data[index] = num;
		index++;
	}
	
	int pop() throws StackUnderflowException {
		if(index == 0) {
			throw new StackUnderflowException();
		}
		index--;
		return data[index];
	}
	
	void print() {
		for(int i=0; i<index; i++) {
			System.out.println(data[i] + " ");
		}
	}
	
}
