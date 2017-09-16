package objects;

/**
 * Created by zncu on 2017-03-04.
 */
class Car extends Vehicle{

    // Attributes
    private int numOfSeats;

    // Constructors
    public Car()	// default constructor
    {
        System.out.println("Creating a car object using default constructor ....");

        numOfSeats = 5;
    }

    public Car(int nd, double pr, int ns)
    {
        super(nd, pr);
        System.out.println("Creating a car object using parameterized constructor ....");

        numOfSeats = ns;
    }

    public Car(Car c)
    {
        System.out.println("Creating a car object using copy constructor ....");
        setNumOfDoors(c.getNumOfDoors());
        setPrice(c.getPrice());
        numOfSeats = c.numOfSeats;
    }


    public int getNumOfSeats()
    {
        return numOfSeats;
    }

    public void setNumOfSeats(int ns)
    {
        numOfSeats = ns;;
    }

    public String toString()
    {
        return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this car is " + numOfSeats + ".";
    }

}   // end of Car class
