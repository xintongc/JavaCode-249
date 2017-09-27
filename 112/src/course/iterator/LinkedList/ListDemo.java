package course.iterator.LinkedList;

import assignments.q01_fraction.Point;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by zncu on 2017-04-16.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Point> list =  new LinkedList<>();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2, 4);
        Point p4 = new Point(1, 3);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

//        Iterator<Point> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Point point = iterator.next();
//            System.out.println(point);
//        }

        for(Point point:list){
            System.out.println(point);
        }
    }

}
