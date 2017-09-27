package assignments.q04_linkedList;

/**
 * Created by zncu on 2017-03-12.
 */
public class LinkedListNode {
    private int value;
    private LinkedListNode nextNode;

    public LinkedListNode() {
    }

    public LinkedListNode(int value) {
        this.value = value;
        //nextNode = null;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || this.getClass()!=o.getClass())
            return false;

        LinkedListNode node = (LinkedListNode)o;
        return (nextNode != null ? nextNode.equals(node.nextNode) : node.nextNode == null) && (value == node.value);
    }

    public LinkedListNode copy(){
        return new LinkedListNode(this.value);
    }

    public LinkedListNode(LinkedListNode node){
        value = node.value;
    }






}



