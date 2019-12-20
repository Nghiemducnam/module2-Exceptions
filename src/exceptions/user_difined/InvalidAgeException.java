package exceptions.user_difined;

public class InvalidAgeException extends Exception {
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