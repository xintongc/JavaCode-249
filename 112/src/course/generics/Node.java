package course.generics;

/**
 * Created by zncu on 2017-03-19.
 */
public class Node <T> {
    private T value;

    public  Node(){

    }

    public Node (T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
