package lab11;

import java.util.ArrayList;

/**
 * Created by zncu on 2017-04-05.
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair() {
    }

    public K getKey(){
        return key;
    }

    public void setKey(K key){
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static <K, V> boolean search(K key, ArrayList<Pair<K, V>> arr){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).key.equals(key))
                return true;
        }
        return false;
    }

}
