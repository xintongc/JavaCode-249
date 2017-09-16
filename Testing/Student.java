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
public class Student extends Person implements Serializable {
    private long studentId;
    private String type;

    public Student(String firstName, String lastName, long studentId, String type) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.type = type;
    }

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "studentId=" + studentId +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        return type != null ? type.equals(student.type) : student.type == null;
    }



}
