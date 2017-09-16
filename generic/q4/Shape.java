package generic.q4;

/**
 * Created by zncu on 2017-03-27.
 */
abstract class Shape {
    private int height,width;

    public Shape() {
        this.height = 0; this.width = 0;
    }
    public Shape(int h, int w) { this.height = h; this.width = w; }

    public void setHeigth(int i) { this.height = i; }

    public void setWidth(int i) { this.width = i; }

    public int getHeigth() { return this.height; }

    public int getWidth() { return this.width; }
}
