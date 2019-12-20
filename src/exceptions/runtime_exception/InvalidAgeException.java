package exceptions.runtime_exception;

public class InvalidAgeException extends RuntimeException {
    private String message;

    public InvalidAgeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}