package lab12;

/**
 * Created by zncu on 2017-04-10.
 */
public class Car implements Comparable<Car>{
    private double price;

    public Car() {
    }

    public Car(double price) {
        this.price = price;
    }

    public Car(Car c){
        price = c.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    public int compareTo(Car car){
        if(this.price == car.price){
            return 0;
        } else {
            return (this.price > car.price) ? 1 : -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return Double.compare(car.price, price) == 0;
    }


}
