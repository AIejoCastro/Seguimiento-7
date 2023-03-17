package exceptions;

public class NegativeNumberException extends RuntimeException{

    public NegativeNumberException() {
        super("A negative number is not allowed");
    }
}
