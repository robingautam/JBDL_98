package ExceptionHandling.customeException;

public class AgeNotValidException extends Exception{

    public AgeNotValidException(String message){
        super(message);
    }

    // define the custom exception
}
