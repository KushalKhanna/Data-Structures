package Stack;

public class StackOverflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackOverflowException() {
		System.out.println("Stack Overflowed !");
	}
}
