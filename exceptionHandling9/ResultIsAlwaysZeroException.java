package exceptionHandling9;

/**
 * Created by zncu on 2017-03-11.
 */
class ResultIsAlwaysZeroException extends Exception
{
    // Constructor
    public ResultIsAlwaysZeroException()
    {
        super("Trivial Division ... Result is Always 0.");
    }

    // A constructor that takes a String parameter
    public ResultIsAlwaysZeroException(String s)
    {
        // Allows the possibility to display any other desired exception message
        super(s);
    }

    public String getMessage()
    {
        return super.getMessage();
    }
}

