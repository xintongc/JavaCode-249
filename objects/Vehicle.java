package objects;

/**
 * Created by zncu on 2017-03-04.
 */
class Vehicle {

    // Attributes
    private int numOfDoors;
    private double price;
    protected static int i = 12;

    // Constructors
    public Vehicle()	// default constructor
    {
        System.out.println("\nCreating a vehicle object using default constructor ....");

        numOfDoors = 4;
        price = 10000;
    }

    public Vehicle(int nd, double pr)
    {
        System.out.println("\nCreating a vehicle object using parameterized constructor ....");

        numOfDoors = nd;
        price = pr;
    }


    public Vehicle(Vehicle vec)	// copy constructor
    {
        System.out.println("\nCreating a vehicle object using copy constructor ....");

        numOfDoors = vec.numOfDoors;
        price = vec.price;
    }

    public int getNumOfDoors()
    {
        return numOfDoors;
    }

    public void setNumOfDoors(int nd)
    {
        numOfDoors = nd;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }

    public String toString()
    {
        return "This Vehicle has " + numOfDoors +
                " doors and it price is " + price + "$.";
    }
}