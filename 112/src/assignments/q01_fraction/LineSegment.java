package assignments.q01_fraction;

/**
 * Created by zncu on 2017-02-26.
 */
public class LineSegment {

    private Point endPoint1;
    private Point endPoint2;

    public LineSegment(Point endPoint1, Point endPoint2) {
        this.endPoint1 = endPoint1;
        this.endPoint2 = endPoint2;
    }

    public LineSegment(){
    }

    public Point getVector(){
        /*
        this:
        + endPoint1: Point
            + x double
            + y double
        + endPoint2: Point
            + x double
            + y double
        */

        Point point = new Point();
        point.setX(endPoint2.getX() - endPoint1.getX());
        point.setY(endPoint2.getY() - endPoint1.getY());
        return point;
    }

    public double getSlope(){
        /*
        this:
        endPoint1:
            + x double
            + y double
        endPoint2:
            + x double
            + y double
        */
        return (endPoint2.getY() - endPoint1.getY())/(endPoint2.getX() - endPoint1.getX());
    }

    public Fraction getSlopeFraction(){
         /*
        this:
        endPoint1:
            + x double
            + y double
        endPoint2:
            + x double
            + y double
        faction:
            + numerator int
            + denominator int
        */
        Fraction fraction = new Fraction();
        fraction.setDenominator((int)(endPoint2.getX() - endPoint1.getX()));
        fraction.setNumerator((int)(endPoint2.getY() - endPoint1.getY()));
        return fraction;
    }

//    public boolean isPerpendicularTo(LineSegment l){
//        return getSlope() * l.getSlope() == -1;
//    }

//    public boolean isParallelTo(LineSegment l){
//        return (getSlope() == l.getSlope());
//    }

    public boolean isPerpendicularTo(LineSegment target) {
        Point vectorA = this.getVector();
        Point vectorB = target.getVector();
        return vectorA.getX() * vectorB.getY() == vectorA.getY() * vectorB.getX() * -1;
    }


    public boolean isParallelTo(LineSegment target) {
        Point vectorA = this.getVector();
        Point vectorB = target.getVector();
        return vectorA.getX() * vectorB.getY() == vectorA.getY() * vectorB.getX();
    }

    public Point getEndPoint1() {
        return endPoint1;
    }

    public void setEndPoint1(Point endPoint1) {
        this.endPoint1 = endPoint1;
    }

    public Point getEndPoint2() {
        return endPoint2;
    }

    public void setEndPoint2(Point endPoint2) {
        this.endPoint2 = endPoint2;
    }

    public String toSting(){
        return null;
    }
}
