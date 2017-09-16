package generic;

/**
 * Created by zncu on 2017-03-27.
 */
public class NumberBox <T extends Integer> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public NumberBox() {
    }

    public T get(){
        return value;
    }
     public void set(T value){
        this.value = value;
     }

    @Override
    public String toString() {
        return "NumberBox{" +
                "value=" + value +
                '}';
    }
}
