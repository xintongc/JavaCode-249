package course.inheritance;

/**
 * Created by zncu on 2017-04-02.
 */
public class AnimalFactory {

    public Animal createAnimal(String type){
        if(type.equals("Person")){
            return new Person();
        } else if(type.equals("Dog")){
            return new Dog();
        }
        return null;

    }
}
