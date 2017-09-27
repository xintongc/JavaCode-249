package assignments.q04_linkedList;

/**
 * Created by zncu on 2017-03-12.
 */
public class LinkedList {

    private LinkedListNode headNode;
    private int size;

    private LinkedListNode lastNode(){
//        if(isEmpty()){
//            return null;
//        }
//        return getNode(size - 1);

        LinkedListNode node = headNode;
        LinkedListNode nextNode = node.getNextNode();

        while (nextNode != null) {
            node = nextNode;
            nextNode = node.getNextNode();
        }

        return node;
    }

    private LinkedListNode getNode(int index){
        LinkedListNode node = headNode;
        for(int i = 0; i < index; i++){
            node = node.getNextNode();
            if (node == null) {
                break;
            }
        }
        return node;
    }


    public void buildDemo(){
        //6 7 3 8 4

        LinkedListNode node1 = new LinkedListNode(6);
        headNode = node1;

        LinkedListNode node2 = new LinkedListNode(7);
        node1.setNextNode(node2);

        LinkedListNode node3 = new LinkedListNode(3);
        node2.setNextNode(node3);

        LinkedListNode node4 = new LinkedListNode(8);
        node3.setNextNode(node4);

        LinkedListNode node5 = new LinkedListNode(4);
        node4.setNextNode(node5);

        size = 5;
    }

    public void buildDemo2(){

        LinkedListNode node1 = new LinkedListNode(1);
        headNode = node1;

        LinkedListNode node2 = new LinkedListNode(2);
        node1.setNextNode(node2);

        size = 2;

    }

    public void buildDemo3(){
        //6 7 3 8 4

        LinkedListNode node1 = new LinkedListNode(1);
        headNode = node1;

        LinkedListNode node2 = new LinkedListNode(0);
        node1.setNextNode(node2);

        LinkedListNode node3 = new LinkedListNode(3);
        node2.setNextNode(node3);

        LinkedListNode node4 = new LinkedListNode(0);
        node3.setNextNode(node4);

        LinkedListNode node5 = new LinkedListNode(4);
        node4.setNextNode(node5);

        size = 5;
    }

    public LinkedList(){
    }

    public LinkedList(int[] values){
        if(values.length == 0){
            return;
        }
        this.headNode = new LinkedListNode(values[0]);

        for(int i = 0; i < values.length - 1; i++){
            this.add(values[i]);
        }
        size = values.length;
    }

    public String description(){
        String content = "[";

        LinkedListNode node = headNode;

        while(node != null) {          //change to headnode, second description has no result
            content += node.getValue();

            if(node.getNextNode()!=null){
                content +=", ";
            }
            node = node.getNextNode();
        }
        content += "]";
        return content;
    }



    public int size(){
        int size = 0;
        LinkedListNode node = headNode;

        while (node != null){
            node = node.getNextNode();
            size++;
        }
        return size;
    }

    public boolean isEmpty(){
//        return size == 0;
        return headNode == null;
    }

    public int get(int i){
        if(headNode == null){
            return -1;
        }
        LinkedListNode node;
        node = getNode(i);
        return node.getValue();
    }



    public int lastValue() {
        if (headNode == null) {
            return -1;
        }
//        LinkedListNode node = headNode;
//        while(node.getNextNode() != null) {
//            node = node.getNextNode();
//        }

//        for (int i = 1; i < size(); i++) {
//            node = node.getNextNode();
//        }
        return lastNode().getValue();
    }


    public int indexOf(int value){
        if(isEmpty()) {
            return -1;
        }

        int index = -1;
//
//        LinkedListNode node = headNode;
//        for(int i = 0; i < size; i++){
//            if(value == node.getValue()){
//                return i;
//            }
//            node = node.getNextNode();
//        }
        for (int i = 0; i < size; i++) {
            if(value == getNode(i).getValue()){
                return i;
            }
        }
        return index;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public void add(int value){
        if (isEmpty()) {
            headNode = new LinkedListNode(value);
        } else {
            LinkedListNode node = new LinkedListNode(value);
            lastNode().setNextNode(node);
        }
    }

    public void push(int value){
        this.add(value);
    }

    public int pop(){
        if (headNode == null) {
            return -1;
        }else if (size == 1) {
            int value = headNode.getValue();
            headNode = null;
            size--;
            return value;

        } else {
            size--;
            int value = getNode(size - 2).getValue();
            getNode(size - 1).setNextNode(null);
            return value;
        }


//        int value = 0;
//        LinkedListNode node = headNode;
//        for(int i = 1; i < size; i++){
//            node = node.getNextNode();
//        }
//        value = node.getValue();
//
//        node = headNode;
//        for(int i = 1; i < size - 1; i++){
//            node = node.getNextNode();
//        }
//        node.setNextNode(null);
//        for (int i = 0; i < size - 2; i++) {
//            node = node.getNextNode();
//        }
//        value = node.getNextNode().getValue();
//        node.setNextNode(null);

    }

    public int remove(int index){
        if (index < 0) {
            return -1;
        }

        if(isEmpty()) {
            return -1;
        }
        if(index == 0) {
            LinkedListNode node = headNode;
            headNode = headNode.getNextNode();
            size--;
            return node.getValue();
//        }
//        if(index == size - 1) {
//            this.pop();
//            size--;
//            return;
        }else {
            LinkedListNode previousNode = getNode(index - 1);
            LinkedListNode node = previousNode.getNextNode();
            if (node == null) {
                return -1;
            }
            previousNode.setNextNode(node.getNextNode());
            size--;
            return node.getValue();
        }

     //   LinkedListNode node1 = headNode;
//        LinkedListNode node2 = headNode;
////        for(int j = 0; j < index + 1; j++){
////            node1 = node1.getNextNode();
////        }
//        for(int j = 0; j < index - 1; j++){
//            node2 = node2.getNextNode();
//        }
//        node2.setNextNode(node2.getNextNode().getNextNode());
    }

    public void insert(int index, int value){
        if (index < 0) {
            return;
        }

        if(isEmpty()) {
            size++;
            add(value);
            return;
        }
        if(index == size() -1 ) {
            pop();
            size++;
            return;
        }
        if(index == 0){
            size++;
            LinkedListNode node = new LinkedListNode(value);
            node.setNextNode(headNode);
            headNode = node;
        }else {
            LinkedListNode previousNode = getNode(index - 1);
            if (previousNode == null) {
                return;
            }
            LinkedListNode newNode = new LinkedListNode(value);

            newNode.setNextNode(previousNode.getNextNode());
            previousNode.setNextNode(newNode);
            size++;
        }
    }

    public void replace(int index, int value){
        if (index < 0) {
            return;
        }
        if(isEmpty()){
            System.out.println("It is empty");
            return;
        }
//        remove(index);
//        insert(index, value);
        LinkedListNode node = getNode(index);
        if (node == null) {
            return;
        }

        node.setValue(value);
    }

//    public LinkedList subList(int fromIndex,int toIndex){
//
//        LinkedList newLinkedList = new LinkedList();
//        LinkedListNode node = headNode;
//        for(int i = 0; i < fromIndex; i++){
//            node = node.getNextNode();
//        }
//        headNode = node;
//        node.getNextNode().setNextNode(null);
//    }



    public void add(LinkedListNode node){
        if(isEmpty()){
            headNode = node;
        }
        this.getNode(size()-1).setNextNode(node);
        node.setNextNode(null);
    }

    public LinkedList copy(){
        LinkedList list = new LinkedList();
        list.headNode = new LinkedListNode(this.headNode.getValue());

        LinkedListNode node = headNode.getNextNode();
        while (node != null) {
            LinkedListNode newNode = new LinkedListNode(node);
            list.add(newNode);
            node = node.getNextNode();
        }

        return list;
    }





    public LinkedList subList(int fromIndex, int toIndex) {
        if(fromIndex > toIndex){
            int temp = fromIndex;
            fromIndex = toIndex;
            toIndex = temp;
        }
        LinkedList list = this.copy();
        list.headNode = list.getNode(fromIndex);
        list.getNode(toIndex - fromIndex - 1).setNextNode(null);
        return list;
    }

    public void removeAll(int fromIndex,int toIndex){
        if(fromIndex > toIndex){
            int temp = fromIndex;
            fromIndex = toIndex;
            toIndex = temp;
        }
        LinkedListNode node1 = headNode;
        for(int i = 0; i < fromIndex - 1; i++){
            node1 = node1.getNextNode();
        }
        LinkedListNode node2 = headNode;
        for(int i = 0; i < toIndex; i++){
            node2 = node2.getNextNode();
        }
        node1.setNextNode(node2);
    }

    public void insert(int index, LinkedList list){
        if(this.isEmpty()){
            this.headNode = list.headNode;
            return;
        }
        if(list.isEmpty()){
            return;
        }
        if(index == 0){
            LinkedListNode node2 = list.headNode;
            for (int i = 0; i < list.size() - 1; i++) {
                node2 = node2.getNextNode();
            }
            node2.setNextNode(this.headNode);
            this.headNode = list.headNode;
            return;
        }
        if(index == this.size() - 1){
            this.getNode(index).setNextNode(list.headNode);
            return;
        }
        LinkedList newlist = list.copy();
        newlist.getNode(newlist.size()-1).setNextNode(this.getNode(index));
        this.getNode(index - 1).setNextNode(newlist.headNode);
    }

    public void replace(int fromIndex,int toIndex, LinkedList list){
        if(fromIndex > toIndex){
//            int temp = fromIndex;
//            fromIndex = toIndex;
//            toIndex = temp;
            System.out.println("invalid input");
            return;
        }
        if(list.isEmpty()){
            return;
        }
        if(fromIndex == 0){
            LinkedList newList = list.copy();
            newList.getNode(newList.size()-1).setNextNode(getNode(toIndex));
            headNode = newList.headNode;
        }else{
            LinkedList newList = list.copy();
            newList.getNode(newList.size()-1).setNextNode(this.getNode(toIndex));
            getNode(fromIndex).setNextNode(newList.headNode);
        }
    }

    public void sort(){
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                if(getNode(i).getValue() > getNode(j).getValue()){
                    int temp = getNode(i).getValue();
                    replace(i,getNode(j).getValue());
                    replace(j,temp);
                }
            }
        }
    }


    public LinkedList filteredListNoneZero(){

        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++){
            if(getNode(i).getValue() != 0){
                list.add(getNode(i).getValue());
            }
        }
        return list;
    }

    public LinkedList filteredListPositive(){
        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++){
            if(getNode(i).getValue() > 0){
                list.add(getNode(i).getValue());
            }
        }
        return list;
    }

    public LinkedList filteredListGreaterThan(int value){

        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++){
            if(getNode(i).getValue() > value){
                list.add(getNode(i).getValue());
            }
        }
        return list;
    }

    public LinkedList filteredListRemoveDuplication(){

        LinkedList list = new LinkedList();
        list.add(getNode(0));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < list.size(); j++) {
                boolean repeat = list.contains(getNode(i).getValue());
                 if(repeat){
                     continue;
                 }
                    list.add(getNode(i).getValue());
            }
        }
        return list;
    }



















}















