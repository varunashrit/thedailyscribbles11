package thedailyscribbles.exception;

/**
 * This class extends the Exception class and is used to represent an error 
 * condition where the requested Admin is not found.
 * 
 */

public class AdminNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException(String msg) {
		super(msg);
	}
}
