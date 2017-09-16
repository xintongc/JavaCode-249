package Testing;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Created by zncu on 2017-03-06.
 */
public class Driver {
    public static void main(String[] args) {
        Scanner InputStream = null;
        File quoteText = null;
        try { quoteText = new File("Quote.txt");
            if (!quoteText.exists())
                throw new FileNotFoundException("File does not exist in this directory");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
        InputStream = new Scanner(quoteText);

        }
        catch (FileNotFoundException e2){
            System.out.println(e2.getMessage());
        }
        InputStream.useDelimiter("-");
        String t = InputStream.next();
        String a = InputStream.nextLine();
        int b = InputStream.nextInt();
        System.out.println(t);
        System.out.println(a);
        System.out.println(b);


    }
}
