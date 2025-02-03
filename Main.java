import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] carArray = {new Car("Mustang", 12500), new Car("Camry", 8400), new Car("Ram", 17200)};

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}