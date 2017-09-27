package assignments.q01_fraction;

/**
 * Created by zncu on 2017-03-03.
 */
public class Rectangle {

    private Point origin;
    private double width;
    private double height;

    public Rectangle(Point origin, double width, double height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        origin.setX(0);
        origin.setY(0);
    }

    public double area(){
        return width * height;
    }

    public boolean hitTest(Point target){
        boolean hTest = target.getX() > origin.getX() && target.getX() < origin.getX() + width;
        boolean vTest = target.getY() > origin.getY() && target.getY() < origin.getY() + height;
        return hTest && vTest;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
