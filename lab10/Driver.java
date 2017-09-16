package lab10;

import java.util.ArrayList;

/**
 * Created by zncu on 2017-03-27.
 */
public class Driver {

    public static <T> void printArray (T[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> int search(T[] array, T item){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

//    public static <T extends Integer> T findMax (T[] array){
//        T max = array[0];
//        for (int i = 0; i < array.length ; i++) {
//            if(array[i]>max){
//                max = array[i];
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {

    }
}
