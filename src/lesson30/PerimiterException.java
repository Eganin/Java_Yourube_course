package lesson30;

public class PerimiterException extends  Exception{
    public PerimiterException(String message) {
        super(message);
    }

    public PerimiterException() {
    }

    public PerimiterException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerimiterException(Throwable cause) {
        super(cause);
    }

    public PerimiterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
