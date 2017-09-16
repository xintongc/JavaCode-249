package generic.q4;

/**
 * Created by zncu on 2017-03-27.
 */
public class Rectangle extends Shape implements ShapeInterface {

    public String printShape(){

        return "height is " + getHeigth() + "width is " + getWidth();

    }
}
