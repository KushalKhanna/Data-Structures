package stack;

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
	
	void push(int num) {
		if(index == n) {
			resize();
		}
		data[index] = num;
		index++;
	}
	
	private void resize() {
		int[] temp = new int[n*2];
		for(int i=0; i<index; i++) {
			temp[i] = data[i];
		}
		data = temp;
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
