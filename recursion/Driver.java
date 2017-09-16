package recursion;

/**
 * Created by zncu on 2017-03-13.
 */
public class Driver {

    public static double mod(int n, int m){
        if(n < m)
            return n;
        else
            return mod(n - m, m);
    }

    public static String reverse(String s){
        if (s.length() == 1)
            return s;
        else
            return  reverse(s.substring(1)) + s.charAt(0);
    }


    public static void main(String[] args) {

        System.out.println( mod(8,5));
        System.out.println(reverse("Happy"));

    }
}
