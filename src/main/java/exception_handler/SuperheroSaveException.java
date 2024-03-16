package exception_handler;

public class SuperheroSaveException extends RuntimeException {

    public SuperheroSaveException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
