package tutorial12;

import java.util.*;

/**
 * Created by zncu on 2017-04-10.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("Please input 3 students records");
        Scanner keyin = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<Student>();
        Student temp;
        studentsList.add(new Student(1,"stu1"));
        studentsList.add(new Student(3,"stu3"));
        studentsList.add(new Student(2,"stu2"));

        Iterator<Student> studentIterator = studentsList.iterator();

        while (studentIterator.hasNext()){
            temp = studentIterator.next();
            System.out.println(temp);

        }

        Collections.sort(studentsList);
        studentIterator = studentsList.iterator();

        while (studentIterator.hasNext()){
            temp = studentIterator.next();
            System.out.println(temp);
        }

        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
