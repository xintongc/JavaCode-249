package lab12;

/**
 * Created by zncu on 2017-04-12.
 */
public class Driver {

    public static void main(String[] args) {
        Car car1 = new Car(1);

        LinkedList linkedList = new LinkedList();
        linkedList.insert(car1);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.getCar(i));
        }

    }

}
