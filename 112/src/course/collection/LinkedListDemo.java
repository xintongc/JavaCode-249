package course.collection;

import java.util.LinkedList;

/**
 * Created by zncu on 2017-03-26.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        new LinkedListDemo().run();
    }

    public void run(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(6);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(4);

        for(int value :list){
            System.out.println(value);
        }
        for (Integer integer : list) {  //iter

        }



    }
}
