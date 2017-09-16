package objects;

/**
 * Created by zncu on 2017-03-04.
 */
class RaceCar extends SportCar{

    // Attributes
    private int horsePower;

    // Constructors
    public RaceCar()	// default constructor
    {
        System.out.println("Creating a race car object using default constructor ....");

        horsePower = 400;
    }

    public RaceCar(int nd, double pr, int ns, double gc, int hp)
    {
        super(nd, pr, ns, gc);
        System.out.println("Creating a race car object using parameterized constructor ....");
        horsePower = hp;
    }

    public RaceCar(RaceCar rc)
    {
        System.out.println("Creating a race car object using copy constructor ....");

        setNumOfDoors(rc.getNumOfDoors());
        setPrice(rc.getPrice());
        setNumOfSeats(rc.getNumOfSeats());
        setGasConsumption(rc.getGasConsumption());

        horsePower = rc.horsePower;
    }


    public int getHorsePower()
    {
        return horsePower;
    }

    public void setHorsePower(int hp)
    {
        horsePower = hp;
    }

    public String toString()
    {
        return "This Race Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this Race Car is " + getNumOfSeats() +
                "\nand its gas consumption is " + getGasConsumption() + " gallons/100-mile." +
                "The horse power of this Race Car is: " + horsePower + ".";
    }

}   // end of Race Car class

