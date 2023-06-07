package ejerciciosClaseOcho;

public class CarritoCeroException extends RuntimeException{

	public CarritoCeroException() {
		super();
	}

	public CarritoCeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public CarritoCeroException(String message) {
		super(message);
	}

	public CarritoCeroException(Throwable cause) {
		super(cause);
	}

}
