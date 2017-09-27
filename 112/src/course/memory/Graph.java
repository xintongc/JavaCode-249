package course.memory;

/**
 * Created by Zhaozhe on 11/11/2016.
 */
public class Graph {

    public static void main(String[] args) {
        new Graph().run();
    }

    public void run(){
        Point p1 = new Point(3, 4); //7540
        Point p2 = new Point(6, 5); //2800
        Point p3 = new Point(8, 2); //3694
        Point p4 = new Point(12, 4); //5720
        Point p5 = new Point(14, 6);//8896

        Circle c = new Circle(p1, 2);//4116
        Rectangle r = new Rectangle(p4, 10, 4);

        System.out.println(c.area());
        System.out.println(r.area());

        System.out.println(r.hitTest(p2));
        System.out.println(r.hitTest(p3));
        System.out.println(r.hitTest(p5));

        System.out.println(c.hitTest(p2));
        System.out.println(c.hitTest(p3));
        System.out.println(c.hitTest(p5));

    }
}
