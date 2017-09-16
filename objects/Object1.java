package objects;

/**
 * Created by zncu on 2017-03-04.
 */
public class Object1 {

    // A method that would accept any vehicle object and displays its information
    public static void showVehicleInfo(Object x)
    {
        // Knowing that all Vehicle classes have overridden the toString() method
        // if the passed object is one of these classes, then it is safe to use
        // the toString() method to display its information
        if(x instanceof Vehicle)
        {
            System.out.println("Here is the information of this vehicle");
            System.out.println(x);
            System.out.println();
        }
        else
            System.out.println("The type of the passed object is unknown; will not display any information ");
    }

    public static void main(String[] args) {
        System.out.println("Will create two Vehicle objects");

        Vehicle v1 = new Vehicle(), v2 = new Vehicle(4, 5000);
        v1.setPrice(22000);
        v2.setPrice(16700);

        System.out.println();
        System.out.println("Will create three Bus objects");

        Bus b1 = new Bus(2, 55000, 37), b2 = new Bus(3, 62000, 55), b3 = new Bus(b1);


        System.out.println();
        System.out.println("Will create two Car objects");

        Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 26000, 2);

        System.out.println();
        System.out.println("Will create two Sport Car objects");

        SportCar sc1 = new SportCar(4, 12000, 5, 3), sc2 = new SportCar(3, 18500, 4, 4);


        System.out.println();
        System.out.println("Will create two Race Car objects");

        RaceCar rc1 = new RaceCar(4, 67000, 2, 4, 400), rc2 = new RaceCar(3, 85000, 4, 4, 450);

        System.out.println("\nDisplaying Information of the different vehicles");
        System.out.println("================================================\n");


        Book bk1 = new Book();
        Painting p1 = new Painting();
        Phones ph1 = new Phones();


        // Now, since all of the created objects are in fact Object objects, the following
        // calls are all possible and legal, and would function as we planned them to.
        showVehicleInfo(v1);
        showVehicleInfo(v2);
        showVehicleInfo(b1);

        showVehicleInfo(bk1);

        showVehicleInfo(b2);
        showVehicleInfo(b3);
        showVehicleInfo(sc1);

        showVehicleInfo(p1);
        showVehicleInfo(ph1);

        showVehicleInfo(sc2);
        showVehicleInfo(rc1);
        showVehicleInfo(rc2);



    }

}
