package assignments.q01_fraction;

/**
 * Created by zncu on 2017-02-26.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public String description(){
        return "(" + x + ", " + y + ")";
    }


    public double distanceToOrigin(){
        return distanceTo(new Point(0,0));
    }

    public double distanceTo(Point p){
        return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
    }

    public void cross(){
        double temp = x;
        x = y;
        y = temp;
    }

    public void flip(){
        x = -x;
        y = -y;
    }

    public Point crossedPoint(){
        Point p = new Point(x, y);
        p.cross();
        return p;
    }

    public Point flippedPoint(){
        Point p = new Point(y, x);
        p.flip();
        return p;
    }

    public Point unitizedPoint(){
        Point p = new Point(x, y);
        if(x < 0){
            p.x = -1;
        }
        else if (x > 0) {
            p.x = 1;
        }

        if(y < 0) {
            p.y = -1;
        }
        else if(y > 0) {
            p.y = 1;
        }
        return p;
    }

    public boolean equalsTo(Point point){
        if(point == null){
            return false;
        }
        if(this == point){
            return true;
        }
        return x == point.x && y == point.y;

    }

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
    public String toString(){
        return description();
    }
}


