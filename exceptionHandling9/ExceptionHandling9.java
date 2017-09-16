package exceptionHandling9;
import java.util.Scanner;

/**
 * Created by zncu on 2017-03-11.
 */
public class ExceptionHandling9{


    // A method that takes two double value and return the result of their division
    // This method throws an exception in case division by zero is detected
    // The method also targets the special trivial case when the result is always
    // going to be zero
    public static double divide(double x, double y) throws DivisionByZeroException, ResultIsAlwaysZeroException
    {
        double result;
        System.out.println("\nExecuting divide() ...");
        if (y == 0)
            throw new DivisionByZeroException("Error: Division by Zero Detected; Cannot Perform Division.");
        else if (x == 0)
            throw new ResultIsAlwaysZeroException("Trivial Division; Result is Always 0.");
        else
        {
            result = x/y;
            System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
            return result;
        }

    }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        double d1, d2;

        System.out.print("Please enter two values to perform a division: ");
        d1 = kb.nextDouble();
        d2 = kb.nextDouble();

        try
        {
            // Call divide() to perform the division
            divide(d1, d2);
        }
        catch(DivisionByZeroException e)
        {
            String s = e.getMessage();
            System.out.println(s);
            // Re-throw another exception that will handle number of failed attempts
            try
            {
                throw new ExhaustedNumberOfAttemptsException();
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
        finally
        {
            System.out.print("Program reached last statement.");
        }

    }

}
