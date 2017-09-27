package course.iterator.LinkedList;

/**
 * Created by zncu on 2017-04-16.
 */
public class Demo {

    public static void main(String[] args) {
        new Demo().run();
    }

    public void run(){
        LinkedList list = new LinkedList();
        list.buildDemo();

        LinkedListNode node = list.getHeadNode();
//        while (node != null){
//            System.out.println(node.getValue());
//            node = node.getNextNode();
//        }

        LinkedListIterator iterator = list.iterator();

        while (iterator.exist()){
            System.out.println(iterator.getValue());
            iterator.next();
        }
    }
}
