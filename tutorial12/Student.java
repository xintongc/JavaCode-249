package tutorial12;

import static com.sun.tools.doclint.Entity.gt;
import static com.sun.tools.doclint.Entity.lt;

/**
 * Created by zncu on 2017-04-10.
 */
public class Student implements Comparable<Student>{
    private long studentID;
    private String name;

    public Student() {
    }

    public Student(long studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentID != student.studentID) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    public int compareTo(Student Student){
        if(studentID == Student.studentID){
            return 0;
        }else {
            return (this.studentID > Student.studentID ) ? 1 : -1;
        }
//        return (this.studentID > Student.studentID ) ? 1 : (this.studentID < Student.studentID) ? -1 : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }
}
