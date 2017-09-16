package except;

/**
 * Created by zncu on 2017-03-03.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling10{


    // A method that takes two double value and return the result of their division
    // This method throws an exception in case division by zero is detected
    // The method also targets the special trivial case when the result is always
    // going to be zero
    public static double divide(double x, double y)
            throws DivisionByZeroException, ResultIsAlwaysZeroException
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
        double d1 = 0, d2 = 0;	// To keep compiler happy!
        boolean done = false, valuesAreNumbers = false;

        while(!done)
        {
            // First make sure that the user enters two numbers
            while(!valuesAreNumbers)
            {
                try
                {
                    System.out.print("Please enter two values to perform a division: ");
                    d1 = kb.nextDouble();
                    d2 = kb.nextDouble();
                    valuesAreNumbers = true;
                }
                catch(InputMismatchException e)
                {
                    kb.nextLine(); // Clear that input line
                    System.out.println("You did not even enter two numbers! May you please enter numbers and nothing else: ");
                }
            }
            // If you reach this point, we do have two numbers
            try
            {
                // Call divide() to perform the division
                divide(d1, d2);
                // If you reach this line, then all is okay (no exception was thrown)
                done = true;
            }
            catch(DivisionByZeroException e)
            {
                String s = e.getMessage();
                System.out.println(s);
                valuesAreNumbers = false; // Reset that variable, so user can re-enter two values
            }
            catch(ResultIsAlwaysZeroException e)
            {
                String s = e.getMessage();
                System.out.println(s);
                done = true;			// Since this is not an error, take it as a valid input and stop
            }
        } // go back to the loop

        System.out.print("Program reached last statement.");
    }

}
