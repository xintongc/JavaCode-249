package except;
import java.util.Scanner;
/**
 * Created by zncu on 2017-03-02.
 */
class ExhaustedNumberOfAttemptsException extends Exception
{
    private static final int MAXIMUM_ALLOWED_ATTEMPTS = 3;
    private int numOfAttempts;
    // Constructor
    public ExhaustedNumberOfAttemptsException()
    {
        numOfAttempts = 0;
    }

    // A constructor that takes a String parameter
    public ExhaustedNumberOfAttemptsException(String s)
    {
        // Allows the possibility to display any other desired exception message
        super(s);
        numOfAttempts = 0;
    }

    public String getMessage()
    {
        return super.getMessage();
    }

    public int getNumOfAttempts()
    {
        return numOfAttempts;
    }

    public void incNumOfAttempts()
    {

        Scanner kb = new Scanner(System.in);
        double d1, d2;

        numOfAttempts++;
        if (numOfAttempts >= MAXIMUM_ALLOWED_ATTEMPTS)
        {
            System.out.print("You have entered bad value " + MAXIMUM_ALLOWED_ATTEMPTS + " times.");
            System.out.print("\nNo more attempts will be allowed. Program will terminate immediately.");
            System.exit(0);
        }
        else
        {
            System.out.print("Just exhausted attempt # " + numOfAttempts +
                    "........\nPlease enter two new values to perform a division: ");
            d1 = kb.nextDouble();
            d2 = kb.nextDouble();
            try
            {
                ExceptionHandling9.divide(d1, d2);
            }
            catch(DivisionByZeroException e)
            {
                String s = e.getMessage();
                System.out.println(s);
                try
                {
                    // Throw, or possibly re-throw, myself.
                    // Why not: throw new ExhaustedNumberOfAttemptsException();?
                    throw (this);
                }
                catch(ExhaustedNumberOfAttemptsException e2)
                {
                    e2.incNumOfAttempts();
                }

            }
            catch(ResultIsAlwaysZeroException e)
            {
                String s = e.getMessage();
                System.out.println(s);
            }
        }


    }

}
