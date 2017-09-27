package course.inheritance;

//类名不能确定一个类，加上类路径才能确定
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by zncu on 2017-03-26.
 */
public class Zoo {
    public static void main(String[] args) throws Exception {

        Class<Zoo> zooClass = Zoo.class;//second layer,这个类绑定的类对象

        Zoo zoo = zooClass.newInstance();//zoo: third layer

        new Zoo().run();
    }

    public void run() throws Exception {
        String filePath = "src/course/inheritance/zoo.txt";
        Scanner scanner = new Scanner(new FileInputStream(filePath));
        String animalName = scanner.nextLine();

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal(animalName);
        animal.eat();
    }
}