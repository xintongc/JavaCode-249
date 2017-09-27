package course.inheritance;

/**
 * Created by zncu on 2017-03-26.
 */
public class Animal {

    public int age;
    public void eat() {
        System.out.println("Animal eat()");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//类的类对象 o.getClass().getName();返回类名

        Animal animal = (Animal) o;

        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}