package exceptions;
public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
