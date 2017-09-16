package tutorialInterface;

/**
 * Created by zncu on 2017-03-20.
 */
public abstract class Employee implements Payable{
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;

    public Employee() {
    }

    public Employee(String firstname, String lastname, String socialSecurityNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPaymentAmount();

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
