package generic;

/**
 * Created by zncu on 2017-03-27.
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public Box() {
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
