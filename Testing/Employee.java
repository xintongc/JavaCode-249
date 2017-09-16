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
public class Employee extends Person implements Serializable{
    private long employeeId;

    public Employee(String firstName, String lastName, long employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }

    public Employee() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        return employeeId == employee.employeeId;
    }


}
