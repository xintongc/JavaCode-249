package course.iterator.LinkedList;

/**
 * Created by zncu on 2017-04-16.
 */
public class LinkedListIterator {
    private LinkedListNode node;

    public LinkedListIterator(LinkedListNode node){
        this.node = node;
    }

    public boolean exist(){
        return node != null;
    }

    public int getValue(){
        return node.getValue();
    }

    public void next(){
        node = node.getNextNode();
    }
}
