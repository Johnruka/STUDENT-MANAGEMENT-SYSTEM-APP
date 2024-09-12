package se.lexicon.exception;

public class StudentException extends RuntimeException{

    public StudentException(String message, int paramName) {
        super(message);
    }
}
