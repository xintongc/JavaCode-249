package linkedList;

public class IntList{

	/**
     * Inner Class ListNode
     */
     private class ListNode {

        private int item;
        private ListNode next;

        public ListNode() {
            item = 0;
            next = null;
        }

        public ListNode(int newItem, ListNode linkValue) {
            item = newItem;
            next = linkValue;
        }
    } //end of class ListNode
    
    /**
     * Begin of class IntList
     */
    private static ListNode head;

    public IntList(){
        head = null;
    }

    /**
     * Adds a node at the start of the list with the specified data. The added
     * node will be the first node in the list.
     */
    public void addToStart(int item) {
        head = new ListNode(item, head);
    }

    /**
     * Removes the head node and returns true if the list contains at least one
     * node. Returns false if the list is empty.
     */
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.next;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of nodes in the list.
     */
    public int size() {
        int count = 0;
        ListNode position = head;
        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }
    
    /**
     * Evaluates if a value is in the list.
     */
    public boolean contains(int item) {
        return (find(item) != null);
    }

    /**
     * Finds the first node containing the target item, and returns a reference
     * to that node. If target is not in the list, null is returned.
     */
    private ListNode find(int target) {
        ListNode position = head;
        int itemAtPosition;
        while (position != null) {
            itemAtPosition = position.item;
            if (itemAtPosition == target) {
                return position;
            }
            position = position.next;
        }
        return null;
    }
    
    /**
     * Outputs the values on the list.
     */
    public void outputList() {
        ListNode position = head;
        while (position != null) {
            System.out.print(position.item + " ");
            position = position.next;
        }
    }
    
    public ListNode getHeadNode() {
        return head;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    } 
    
    /**
     * For two lists to be equal they must contain the same data items in the
     * same order.
     */ 
     public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            IntList otherList = (IntList) otherObject;
            if (size() != otherList.size()) {
                return false;
            }
            ListNode position = head;
            ListNode otherPosition = otherList.head;
            while (position != null) {
                if (position.item != otherPosition.item) {
                    return false;
                }
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true;
        }
     }
    
    /** Iterative method to sum the items in the list
     */
    // Write your method here - sumIterativemethod
    public int sumIterative(){
        int sum = 0;
        ListNode node = head;
        while (node != null){
            sum += node.item;
            node = node.next;
        }
        return sum;
    }

    public int sumRecursive(ListNode node){
        ListNode temp = head;
        if(temp == null)
            return 0;
        else
            return temp.item + sumRecursive(temp.next);
    }
    
    
    /** Recursive method to sum the items in the list
    */
    //Write your method here - sumRecursive
    
    /** Copies the list to an array and outputs the ordered values.
     */
    //Write your method here - sortListmethod
    
    public static void populateList(IntList anIntList) {
        for (int i = 0; i < 10; i++) {
            anIntList.addToStart(new java.util.Random().nextInt(100));
        }
    }
   
	public static void main(String[] args) {
		IntList myList = new IntList();
		populateList(myList);
		myList.outputList();
		System.out.println();
		System.out.println("Sum iterative: " + myList.sumIterative());
		System.out.println("Sum recursive: " + myList.sumRecursive(myList.getHeadNode()));
		//sortList(myList);
		
	}

}