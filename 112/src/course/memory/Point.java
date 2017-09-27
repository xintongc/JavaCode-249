package course.memory;

/**
 * Created by Zhaozhe on 06/11/2016.
 */
public class Point {
    
    /*
     *  Constructors
     */

    public Point() {

    }

    /*
     *  Basic - Properties
     */
    
    private double x;
    private double y;

    /*
     *  Basic - Constructors
     */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
     *  Basic - Methods
     */

    public String description(){
        return "(" + x + "," + y + ")";
    }
    
    /*
     *  Basic - Getters & Setters
     */ 
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*
     *  Distance - Methods
     */ 

    public double distanceToOrigin(){
        return distanceTo(0, 0);
    }

    public double distanceTo(double x, double y) {
        double dx = x - this.x;
        double dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceTo(Point target){
        return distanceTo(target.x, target.y);
    }

    /*
     *  Manipulation - Methods
     */

    public void cross(){
        double temp = x;
        x = y;
        y = temp;
    }

    public Point crossedPoint(){
        Point point = new Point(x, y);
        point.cross();
        return point;
    }

    public void flip(){
        x *= -1;
        y *= -1;
    }

    public Point flippedPoint(){
        Point point = new Point(x, y);
        point.flip();
        return point;
    }

    public void unitize(){
        x = unitizeValue(x);
        y = unitizeValue(y);
    }

    public Point unitizePoint(){
        Point point = new Point(x, y);
        point.unitize();
        return point;
    }

    public double unitizeValue(double value){
        if (value > 0) {
            return 1;
        } else if (value < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
