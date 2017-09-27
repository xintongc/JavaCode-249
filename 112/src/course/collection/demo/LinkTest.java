package course.collection.demo;

import assignments.q01_fraction.Point;
import course.collection.PointComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zncu on 2017-04-15.
 */
public class LinkTest {
    public static void main(String[] args) {
        new LinkTest().run();
    }

    public void run(){
        List<Point> list =  new ArrayList<Point>();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2, 4);
        Point p4 = new Point(1, 3);
        Point p5 = new Point(1, 1);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

//        Collections.sort(list, new PointComparator());
        PointComparator pointComparator = new PointComparator();
        Collections.sort(list, pointComparator);
        System.out.println(list);
    }
}
