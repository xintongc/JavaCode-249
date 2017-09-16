package Testing;

/**
 * Created by zncu on 2017-03-06.
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;



public class FileIO1{

    public static void main(String[] args) throws FileNotFoundException
    {			// Notice that the main() function is declaring the exception!!! 				// You should consider never doing that!

        // Create an output stream object to write to a file
        // The "real" output file name will be called "Info.text";
        // notice that this can be any other name

        PrintWriter pw;
        pw = new PrintWriter(new FileOutputStream("Info.txt"));

        // From this point on, all references to the file will
        // be made through that stream object name; that is, the
        // stream object name is considered as the file name through
        // the program from this point on

        String s;

        Scanner kb = new Scanner(System.in);
        System.out.print("We need to store your information; Please enter your First and Last Name: ");
        s = kb.nextLine();
        pw.println("Name: " + s);	// Write this info to the file

        System.out.print("\nPlease enter your Address: ");
        s = kb.nextLine();
        pw.println("Address: " + s);	// Write this info to the file

        System.out.print("\nPlease enter your School Name: ");
        s = kb.nextLine();
        pw.println("School Name: " + s);	// Write this info to the file

        pw.close();		// Close the file

        System.out.println("Thank you for filling your information.");
        System.out.println("Your information has been stored in a file called \"Info.txt\".");
    }

}
