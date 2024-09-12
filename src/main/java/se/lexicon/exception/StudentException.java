package se.lexicon.exception;

public class StudentException extends RuntimeException{

    private int paramName;

    public StudentException(String message, int paramName) {
        super(message);
        this.paramName = paramName;
    }
}
