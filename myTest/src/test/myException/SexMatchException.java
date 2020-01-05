package test.myException;

/**
 * 自定义性别匹配异常，运行时异常
 */
public class SexMatchException extends RuntimeException {
    public SexMatchException() {
        super();
    }

    public SexMatchException(String message) {
        super(message);
    }
}
