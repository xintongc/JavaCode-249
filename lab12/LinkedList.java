package lab12;

/**
 * Created by zncu on 2017-04-10.
 */
public class LinkedList {
    public static class Node {
        private Car car;
        private Node next;

        public Node() {
        }

        public Node(Car car, Node next) {
            this.car = car;
            this.next = next;
        }

        public Node(Car car){
            this.car = car;
        }

        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "car=" + car +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;

//    public void insert(Car c){
//
//        for (int i = 0; i < this.size(); i++) {
//            if(getCar(i).getPrice() <= c.getPrice() && getCar(i+1).getPrice() >= c.getPrice()){
//                insert(i, c);
//            }
//        }
//    }
public void insert (Car c){

    if(head == null)
        head = new Node(c, head);
    else if(head.getCar().getPrice()>c.getPrice())
        head = new Node(c, head);
    else {
        Node t = head.next;
        while (t!=null){
            if(t.next.getCar().getPrice()<c.getPrice())
            {
                t=t.next;
            }
            else
                t.next = new Node (c, t.next);
        }
        if(t.next == null){
            t.next = new Node(c, t.next);
        }


    }

}


    private void insert(int index, Car c){
        if (index < 0) {
            return;
        }

        if(isEmpty()) {
            head = new Node(c);
            return;
        }
        if(index == size() -1 ) {
            remove(size() - 1);
            return;
        }
        if(index == 0){
            Node node = new Node(c);
            node.setNext(head);
            head = node;
        }else {
            Node previousNode = getNode(index - 1);
            if (previousNode == null) {
                return;
            }
            Node newNode = new Node(c);

            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }
    }

    public void remove(Car c){
        for (int i = 0; i < size(); i++) {
            if(getCar(i).equals(c)){
                remove(i);
            }
        }
    }

    private void remove(int index){
        if (index < 0) {
            return;
        }
        if(isEmpty()) {
            return;
        }
        if(index == 0) {
            Node node = head;
            head = head.getNext();
            return;
        }else {
            Node previousNode = getNode(index - 1);
            Node node = previousNode.getNext();
            if (node == null) {
                return;
            }
            previousNode.setNext(node.getNext());
        }
    }


    public boolean isEmpty(){
        return head == null;
    }

    private Node getNode(int index){
        Node node = head;
        for (int i = 0; i < size(); i++) {
            node = node.next;
            if (node == null) {
                break;
            }
        }
        return node;
    }

    public Car getCar(int index){
       if(head == null){
           return null;
       }
       Node node;
       node = getNode(i);
        return node.getCar();
    }

//    public void sort(){
//        for(int i = 0; i < size(); i++){
//            for(int j = i; j < size(); j++){
//                if(getNode(i).getCar().getPrice() > getNode(j).getCar().getPrice()){
//                    replace(getNode(i),getNode(j));
//                }
//            }
//        }
//    }
    public void replace(Node node1, Node node2){
        if(isEmpty()){
            System.out.println("It is empty");
            return;
        }
        Car temp = node1.car;
        node1.car = node2.car;
        node2.car = temp;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size() +
                '}';
    }

    public int size() {
        int size = 0;
        Node node = head;

        while (node != null){
            node = node.getNext();
            size++;
        }
        return size;
    }
}
