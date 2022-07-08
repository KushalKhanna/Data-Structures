package Stack;

public class StackUnderflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackUnderflowException() {
		System.out.println("Stack Underflow !");
	}
}
