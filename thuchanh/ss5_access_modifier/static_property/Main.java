package module2.thuchanh.ss5_access_modifier.static_property;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

        Car car3 = new Car("Mazda 9","Skyactiv 9");

        System.out.println(Car.numberOfCars);


    }
}
