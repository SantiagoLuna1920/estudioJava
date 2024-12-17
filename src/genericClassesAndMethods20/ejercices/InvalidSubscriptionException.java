package genericClassesAndMethods20.ejercices;

public class InvalidSubscriptionException extends RuntimeException {
    public InvalidSubscriptionException(String message) {
        super(message);
    }

    public InvalidSubscriptionException() {
        this("Invalid subscription");
    }
}
