package test2;

/**
 * Created by zncu on 2017-03-10.
 */
public class Driver {

    static boolean Marathon (int a) {
        try{
            if (a<0) throw new NegativeException();
            else if (a==0) throw new ZeroException();
            else if (a>=42) return true;
            else return false;
        }
        catch (ZeroException e){
            System.out.println("Use natural number");}
        finally{
            System.out.println("One last thing");}
        System.out.println("All done.");
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Marathon(100));
        System.out.println(Marathon(0));
        System.out.println(Marathon(-5));
    }
}
