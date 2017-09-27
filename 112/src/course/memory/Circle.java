package course.memory;

/**
 * Created by Zhaozhe on 11/11/2016.
 */
public class Circle {

    /*
     *  Constructors
     */

    public Circle() {

    }

    /*
     *  Basic - Properties
     */

    private Point origin;
    private double radius;
    
    /*
     *  Basic - Constructors
     */ 

    public Circle(Point origin, double radius) {
        this.origin = origin;
        this.radius = radius;
    }
    
    /*
     *  Basic - Getters & Setters
     */

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

    /*
     *  Shape - Methods
     */

    public Point centerPoint(){
        Point centerPoint = new Point();
        centerPoint.setX(origin.getX() + radius);
        centerPoint.setY(origin.getY() + radius);
        return centerPoint;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public boolean hitTest(Point target) {
        return centerPoint().distanceTo(target) < radius;
    }

    
}
