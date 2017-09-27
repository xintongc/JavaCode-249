package assignments.q01_fraction;

/**
 * Created by zncu on 2017-03-03.
 */
public class Graph {


    public static void main(String[] args) {
        new Graph().run();
    }

    public void run(){

        Fraction f1 = new Fraction();
        f1.denominator = 6;
        f1.numerator = 4;

        System.out.println(f1.simplify().description());

        Point p1 = new Point(3, 4);
        System.out.println(p1.distanceToOrigin());
        System.out.println(p1.description());

        Point p2 = new Point(4, 5);
        Point p3 = new Point(1, 1);
        System.out.println(p2.distanceTo(p3));

        p2.cross();
        System.out.println(p2.description());

        p2.flip();
        System.out.println(p2.description());


        System.out.println(f1.description());
        System.out.println((double) f1.numerator/f1.denominator);
        Point p4 = new Point(1,1);
        Point p5 = new Point(4, 5);
        LineSegment lineSegment = new LineSegment(new Point(1,1), new Point(4, 5));

        System.out.println(lineSegment.getVector().description());
        System.out.println(lineSegment.getSlope());
        System.out.println(lineSegment.getSlopeFraction().description());

        Point p6 = new Point(9,2);
        System.out.println(p6.distanceTo(p4));
        System.out.println(p6.crossedPoint().description());
        System.out.println(p6.flippedPoint().description());
        System.out.println(p6.unitizedPoint().description());


        Point p10 = new Point(3, 4);
        Point p20 = new Point(3,4);
        Point p30 = p20;
        System.out.println(p10.equalsTo(p20));
        System.out.println(p20.equalsTo(p30));



    }

}