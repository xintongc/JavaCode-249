package tutorialInterface;

/**
 * Created by zncu on 2017-03-20.
 */
public class SalariedEmployee extends Employee {
    private double weeklySalalry;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String firstname, String lastname, String socialSecurityNumber, double weeklySalalry) {
        super(firstname, lastname, socialSecurityNumber);
        this.weeklySalalry = weeklySalalry;
    }

    public double getPaymentAmount(){
        return weeklySalalry * 4;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalalry=" + weeklySalalry +
                '}';
    }
}
