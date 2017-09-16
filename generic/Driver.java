package generic;

/**
 * Created by zncu on 2017-03-27.
 */
public class Driver {
    public static void main(String[] args) {
//        Box<Integer> myIntegerBox = new Box<Integer>();
//        myIntegerBox.set(new Integer(10));
//        System.out.println(myIntegerBox);
        Box<String> myStringBox = new Box<String>();
        myStringBox.set(new String("For sale, baby shoes, never worn"));
        System.out.println(myStringBox);

        Box<Boolean> myBooleanBox = new Box<Boolean>();
        myBooleanBox.set(new Boolean(true));
        System.out.println(myBooleanBox);


        OrderedPair<Integer,String> myPair = new OrderedPair<Integer,String>();
        myPair.setFirst(new Integer(1));
        myPair.setSecond(new String("So much depends on a red wheelbarrow"));
        System.out.println(myPair);

        NumberBox<Integer> myIntegerBox = new NumberBox<Integer>();
        myIntegerBox.set(new Integer(10));
        System.out.println(myIntegerBox);
    }
}
