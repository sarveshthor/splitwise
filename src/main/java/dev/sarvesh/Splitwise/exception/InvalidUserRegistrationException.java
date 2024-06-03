package dev.sarvesh.Splitwise.exception;

public class InvalidUserRegistrationException extends RuntimeException{
    public InvalidUserRegistrationException() {
        super();
    }

    public InvalidUserRegistrationException(String message) {
        super(message);
    }
}
