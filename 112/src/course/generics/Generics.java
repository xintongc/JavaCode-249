package course.generics;

/**
 * Created by zncu on 2017-03-19.
 */
public class Generics {
    public static void main(String[] args) {
        new Generics().run();
    }

    public void run(){
//        Node<Integer> nodeInt = new Node<Integer>();
//        nodeInt.setValue(10);
//        System.out.println(nodeInt.getValue());
//
//        Node<Double> nodeDouble = new Node<Double>();
//        nodeDouble.setValue(3.14);
//        System.out.println(nodeDouble.getValue());

        Node<Integer> nodeInt = new Node<Integer>();
        Integer anInt = new Integer(3);
        nodeInt.setValue(anInt);

        Integer value = nodeInt.getValue();
        int intValue = value.intValue();
        System.out.println(intValue);

    }
}
