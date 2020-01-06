package test.myException;

/**
 * 受查异常
 */
public class AgeException extends Exception{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
