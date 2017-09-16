package objects;

/**
 * Created by zncu on 2017-03-04.
 */
class Bus extends Vehicle{

    // Attributes
    private int passengerCapacity;

    // Constructors
    public Bus()	// default constructor
    {
        System.out.println("Creating a bus object using default constructor ....");

        passengerCapacity = 10;
    }

    public Bus(int pc)
    {
        System.out.println("Creating a bus object using parameterized constructor ....");

        passengerCapacity = pc;
    }

    public Bus(Bus b)
    {
        System.out.println("Creating a bus object using copy constructor ....");

        setNumOfDoors(b.getNumOfDoors());
        setPrice(b.getPrice());
        passengerCapacity = b.passengerCapacity;
    }


    // A constructor that would allow the setting of the price and the number of doors
    // and the passenger capacity
    public Bus(int nd, double pr, int pc)
    {

        this(pc); 	// Call the constructor that sets the passenger capacity

        System.out.println("Creating a bus object using parameterized constructor for full settings....\n");

        // Notice that we now cannot call super to set the other two attributes
        // (i.e. super(nd, pr);) since either "this" or 'super" must be the first
        // statement, and it is not possible to have both of them as such!
        setPrice(pr);
        setNumOfDoors(nd);

    }


    public int getPassangerCapacity()
    {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int pc)
    {
        passengerCapacity = pc;;
    }

    public String toString()
    {
        return "This Bus has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The passenger capacity of this bus is " + passengerCapacity + ".";
    }

    // Override the setPrice() method
    public void setPrice(double pr)
    {
        if(pr < getPrice())
            System.out.println("The price of this bus will be reduced from " + getPrice() + "$ to " + pr + "$.");
        else if (pr > getPrice())
            System.out.println("The price of this bus will be increased from " + getPrice() + "$ to " + pr + "$.");
        else
            System.out.println("No change will be applied to this price of the bus.");

        super.setPrice(pr);
        // Notice that you cannot access "price" directly  since it is private to the base class
        // i.e. price = pr; would be illegal

    }
}   // end of Bus class
