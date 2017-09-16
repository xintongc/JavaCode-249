package Testing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by zncu on 2017-03-06.
 */
public class SearchInt {
    public static void main(String[] args) {
        Scanner InputStream = null;
        File searchText = null;
        try{
            searchText = new File("searchText.txt");
            if(!searchText.exists())
                throw new FileNotFoundException("File does not exist in this directory");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try{
            InputStream = new Scanner(searchText);

        }
        catch (FileNotFoundException e2){
            System.out.println(e2.getMessage());
        }



    }
}
