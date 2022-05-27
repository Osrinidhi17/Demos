package Customexceptiondemos;

public class InvalidAccountNumberException extends Exception {
	
	private static final long serialVersionUID = 1L;
	/**
	 * this will create InvalidAccountNumberException object without error message.
	 */
 public InvalidAccountNumberException() {
	 super();
 }
 /**
  * this will create InvalidAccountNumberException object with error message.
  */
 public InvalidAccountNumberException(String errMsg) {
	 super(errMsg);
 }
}
