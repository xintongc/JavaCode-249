package generic;

/**
 * Created by zncu on 2017-03-27.
 */
public class OrderedPair <T, S> {
    private T first;
    private S second;

    public OrderedPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public OrderedPair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
