package course.collection;

import assignments.q01_fraction.Point;

import java.util.Comparator;

/**
 * Created by zncu on 2017-04-15.
 */
public class PointComparator implements Comparator<Point> {

    public int compare(Point o1, Point o2){
        double value = o1.getX() - o2.getX();
        if(value > 0){
            return 1;
        } else if(value < 0){
            return -1;
        } else {
            value = o1.getY() - o2.getY();
            if(value > 0){
                return 1;
            } else if(value < 0){
                return -1;
            } else {
                return 0;
            }
        }

    }
}
