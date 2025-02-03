package U7T2;
import java.util.ArrayList;

public class UsedCarLot {
    ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int index1, int index2) {
        if(index1 >= 0 && index2 >= 0 && index1 < inventory.size() && index2 < inventory.size()) {
            Car temp = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
            return true;
        } else return false;
    }

    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }
    
    public Car sellCarShift(int indexOfCarToSell) {
        return inventory.remove(indexOfCarToSell);
    }

    public Car sellCarNoShift(int indexOfCarToSell) {
        return inventory.set(indexOfCarToSell, null);
    }
    
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car x = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, x);
    }
    
    
}
