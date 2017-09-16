package exceptionHandling9;

/**
 * Created by zncu on 2017-03-11.
 */
public class DivisionByZeroException extends Exception {
    // Constructor
    public DivisionByZeroException()
    {
        // Since this class is particular for this type of errors; that is,
        // division by zero, a message to that effect can be coded to that effect
        super("Error ... Division by zero detected. Cannot perform division operation.");
    }

    // A constructor that takes a String parameter
    public DivisionByZeroException(String s)
    {
        // Allows the possibility to display any other desired exception message
        super(s);
    }

    public String getMessage()
    {
        return super.getMessage();
    }

}
