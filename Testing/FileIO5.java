package Testing;

/**
 * Created by zncu on 2017-03-09.
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;



public class FileIO5{

    public static void main(String[] args)
    {

        String s;
        Scanner kb = new Scanner(System.in);
        Scanner sc = null;		// A scanner object
        long id1, id2, id3, id4, id5, id6, id7;
        int i = 0;

        try
        {
            sc = new Scanner(new FileInputStream("StudentInfo.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not open input file for reading."
                    + " Please check if file exists.");
            System.out.print("Program will terminate.");
            System.exit(0);
        }
        // The format of the file is assumed to be known.
        // The file starts with a line indicating the course name, followed by
        // the list of students in the course (as ID# then First and Last Name)

        System.out.println("Will read the input file and display the first line, " +
                "followed by the first 7 IDs. ");
        System.out.println("\nThe first line of the file has the following text:");
        s = sc.nextLine();	// read the entire first line from the file then display it
        System.out.println(s);

        System.out.println("\nHere are the first 7 IDs in that course: ");

        while(sc.hasNextLine() && i < 7)
        {
            i++;
            id1 = sc.nextLong();
            s = sc.nextLine();		// just read the rest of the line so we can go to the next line
            System.out.println(id1);
        }
        if (i < 7)
            System.out.println("\nPlease note that the course has only " + i + " registrations.");



    }
}

