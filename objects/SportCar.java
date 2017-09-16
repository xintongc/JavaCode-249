package objects;

/**
 * Created by zncu on 2017-03-04.
 */
class SportCar extends Car{

    // Attributes
    private double gasConsumption;

    // Constructors
    public SportCar()	// default constructor
    {
        System.out.println("Creating a sport car object using default constructor ....");

        gasConsumption = 4;
    }

    public SportCar(int nd, double pr, int ns, double gc)
    {
        super(nd, pr, ns);
        System.out.println("Creating a sport car object using parameterized constructor ....");
        gasConsumption = gc;
    }

    public SportCar(SportCar sc)
    {
        System.out.println("Creating a sport car object using copy constructor ....");

        setNumOfDoors(sc.getNumOfDoors());
        setPrice(sc.getPrice());
        setNumOfSeats(sc.getNumOfSeats());

        gasConsumption = sc.gasConsumption;
    }


    public double getGasConsumption()
    {
        return gasConsumption;
    }

    public void setGasConsumption(double gc)
    {
        gasConsumption = gc;;
    }

    public String toString()
    {
        return "This Sport Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this Sport Car is " + getNumOfSeats() +
                "\nand its gas consumption is " + gasConsumption + " gallons/100-mile.";
    }

}