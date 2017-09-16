package Testing;

import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.Serializable;
/**
 * Created by zncu on 2017-03-06.
 */
public class PersonDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee("e1","e1",01);
        Employee e2 = new Employee("e2","e2",02);
        Employee e3 = new Employee("e3","e3",03);
        Student s1 = new Student("s1","s1",04,"full-time");
        Student s2 = new Student("s2","s2",05,"full-time");
        Student s3 = new Student("s3","s3",06,"full-time");

        Person[] array = new Person[6];
        array [0] = e1;
        array [1] = e2;
        array [3] = e3;
        array [4] = s1;


        String fileName;

        Scanner kb = new Scanner(System.in);


        System.out.print("Please enter the \"binary\" file name to which the objects should be stored: ");
        fileName = kb.next();

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try
        {
            // Create an ObjectOutputStream to write into the binary file
            oos = new ObjectOutputStream(new FileOutputStream(fileName));

            // If this point is reached, then the stream was created successfully.
            // So, start writing the objects to the file.
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);

            oos.close();
            System.out.println("Objects have been written to the file " + fileName + ".");
        }
        catch(IOException e)
        {
            System.out.println("Error: Problem Reading from file: " + fileName + ".");
            System.out.println("Program will terminate.");
            System.exit(0);
        }

        try
        {
            // Create an ObjectOutputStream to write into the binary file
            ois = new ObjectInputStream(new FileInputStream(fileName));

            // If this point is reached, then the stream was created successfully.
            // So, start reading the objects from the file.
            Employee cr;
            int i = 1;

            System.out.println("\nWill start displaying the objects stored in file: \"" + fileName + "\".");
            System.out.println("================================================================ ");
            try
            {
                while(true)
                {
                    cr = (Employee)ois.readObject();

                    System.out.println("\nHere is the information of object # " + i++ + ":");
                    System.out.println("====================================== ");
                    System.out.println(cr);
                }
            }
            catch(ClassNotFoundException e)
            {
                System.out.println("Error has occurred while reading the file: " + fileName + ".");
            }
            catch(EOFException e)
            {
                System.out.println("\nReading file \"" + fileName + "\" has been completed.");
            }
            ois.close();		// Close the file
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File: " + fileName + " could not been found.");
            System.out.println("Program will terminate.");
            System.exit(0);
        }
        catch(IOException e)
        {
            System.out.println("Error: Problem Reading from file: " + fileName + ".");
            System.out.println("Program will terminate.");
            System.exit(0);
        }





    }
}
