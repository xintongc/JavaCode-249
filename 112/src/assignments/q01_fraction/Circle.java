package assignments.q01_fraction;

/**
 * Created by zncu on 2017-03-03.
 */
public class Circle {
    private Point origin;
    private double radius;

    public Circle(Point origin, double radius) {
        this.origin = origin;
        this.radius = radius;
    }

    public Circle() {
        origin.setX(0);
        origin.setY(0);
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean hitTest(Point p){
        return origin.distanceTo(p) < radius;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
