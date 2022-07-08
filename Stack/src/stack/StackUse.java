package stack;

public class StackUse {

	public static void main(String[] args) throws StackUnderflowException {
		Stack s = new Stack();
		
//		s.pop();	FOR CCHECKING UNDERFLOW EXCEPTION
		
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
//		s.push(5);	FOR CHECKING OVERFLOW EXCEPTION CLASS
		
		System.out.println("Size : " + s.size());
		System.out.println("Print : ");
		s.print();
		System.out.println("Popped Element : " + s.pop());
		System.out.println("Size : " + s.size());
		System.out.println("Print : ");
		s.print();
		
		System.out.println("Top : " + s.top());

	}

}
