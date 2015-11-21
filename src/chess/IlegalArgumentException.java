package chess;

public class IlegalArgumentException extends Exception {

	public IlegalArgumentException() {}

	public IlegalArgumentException(String message) {
		super(message);
	}

	public IlegalArgumentException(Throwable cause) {
		super(cause);
	}

	public IlegalArgumentException(String message, Throwable cause) {
		super(message, cause);
	}

	public IlegalArgumentException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
