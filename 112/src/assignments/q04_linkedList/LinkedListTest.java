package assignments.q04_linkedList;

/**
 * Created by zncu on 2017-03-12.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        new LinkedListTest().run();
    }

    public void run(){
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();

        linkedList.buildDemo();
        linkedList2.buildDemo2();
        linkedList3.buildDemo3();


//
//        LinkedListNode node2 = new LinkedListNode(3);
//        LinkedListNode node3 = new LinkedListNode(3);
//
//        node2.setNextNode(node3);
//        node3.setNextNode(null);
//
//
//        LinkedListNode node4 = node3.copy();
//        System.out.println(node4.equals(node3));
//        System.out.println(node4.getValue() == node3.getValue());
//        LinkedListNode node5 = new LinkedListNode(node3);
//        System.out.println(node5.equals(node3));
//        System.out.println(linkedList.size());
//
//        System.out.println(linkedList.isEmpty());
//
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.lastValue());
//        System.out.println(linkedList.indexOf(2));
//        System.out.println(linkedList.contains(2));
//
//        linkedList.add(5);
//        System.out.println(linkedList.lastValue());
//
//        System.out.println(linkedList.pop());
//        linkedList.remove(3);
//        linkedList.insert(2,9);

//        linkedList.replace(2,9);
//        System.out.println(linkedList.pop());

//        int[] values = {3,8};
//        linkedList.subList(2,4);
//        linkedList.removeAll(2,4);
//        linkedList.insert(2,linkedList);
//        LinkedListNode node1 = new LinkedListNode(1);
 //       linkedList.add(node1);
 //       LinkedList newList = linkedList.subList(2,4);
//        linkedList.insert(2,linkedList2);
//        linkedList.replace(0,8);
//        LinkedList newList = linkedList.subList(0,4);
//        linkedList.insert(2,linkedList2);//       linkedList.replace(1,2,linkedList2);
//        linkedList.sort();
//        LinkedList list = linkedList3.filteredListPositive();
        LinkedList linkedListnew = linkedList3.filteredListRemoveDuplication();
        System.out.println(linkedListnew.description());




    }
}
