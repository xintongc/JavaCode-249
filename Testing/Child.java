package Testing;

/**
 * Created by zncu on 2017-03-10.
 */
public class Child extends Parent {
    public Child(){
        this.hello();
    }

    public static void hello(){
        System.out.println("Salute");
    }
    public  void hello2(){
        System.out.println("Bonjour");
    }
    public void hello3() {System.out.println("Hello");}
}
