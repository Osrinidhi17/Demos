package Customexceptiondemos;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * this will create InvalidAccountNumberException object without error message.
	 */
 public InsufficientBalanceException() {
	 super();
 }
 /**
  * this will create InvalidAccountNumberException object with error message.
  */
 public InsufficientBalanceException(String errMsg) {
	 super(errMsg);
 }
}
