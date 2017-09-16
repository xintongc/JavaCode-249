package lab11;

import java.util.ArrayList;

/**
 * Created by zncu on 2017-04-05.
 */
public class Driver {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer, String>(249, "Comp249");
        Pair<Integer, String> pair2 = new Pair<Integer, String>(248, "Comp248");
        Pair<Integer, String> pair3 = new Pair<Integer, String>(287, "SOEN287");
        Pair<Integer, String> pair4 = new Pair<Integer, String>(213, "ENGR213");

        ArrayList<Pair<Integer, String>> arrayList = new ArrayList<Pair<Integer, String>>();
        arrayList.add(pair1);
        arrayList.add(pair2);
        arrayList.add(pair3);
        arrayList.add(pair4);

        for(Pair pair : arrayList){
            System.out.println(pair);
        }

        System.out.println(Pair.search(249, arrayList));
        System.out.println(Pair.search(243, arrayList));



        System.out.println(pair1);
        int courseNum = pair1.getKey();
        String courseName = pair1.getValue();
        System.out.println(courseName);
        System.out.println(courseNum);



    }
}
