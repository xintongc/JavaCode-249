package course.memory;

/**
 * Created by Zhaozhe on 11/11/2016.
 */
public class Rectangle {

    /*
     *  Constructors
     */

    public Rectangle() {

    }

    /*
     *  Basic - Properties
     */

    private Point origin;
    private int width;
    private int height;

    /*
     *  Basic - Constructors
     */

    public Rectangle(Point origin, int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*
     *  Shape - Methods
     */

    public double area(){
        return width * height;
    }

    public boolean hitTest(Point target) {
        boolean hTest = target.getX() > origin.getX() && target.getX() < (origin.getX() + width);
        boolean vTest = target.getY() > origin.getY() && target.getY() < (origin.getY() + height);
        return hTest && vTest;
    }
}
