import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine"); trees.add("maple"); trees.add("frasier fir");

        System.out.println(trees);
        System.out.println(trees.size());
        System.out.println(trees.get(1));
        */

        /* ArrayList<String> names = new ArrayList<String>();
        names.add("Ben");
        names.add("Andy");
        names.add("David");
        String[] moreNames = {"Crystal", "Monica", "Toby", "Nancy"};
        int namesAmt = names.size();
        int moreNamesAmt = moreNames.length;
        int thirdNameLength = names.get(2).length();
        int secondNameLength = moreNames[1].length();
        int lengths = namesAmt + moreNamesAmt + thirdNameLength + secondNameLength;
        System.out.println(lengths);
        */

        /* Car car1 = new Car("Durango", 23000);
        System.out.println(car1);
        */ 

        UsedCarLot lot = new UsedCarLot();
        lot.addCar(new Car("Mustang", 12500));
        lot.addCar(new Car("Camry", 8400));
        lot.addCar(new Car("Ram", 17200));
        lot.addCar(new Car("Accent", 1980));
        lot.addCar(new Car("Cruiser", 10500));
        System.out.println("--original inventory--");
        System.out.println(lot.getInventory());
        boolean swapped = lot.swap(2, 4);
        System.out.println("--Ram and Cruiser swap successful--");
        System.out.println(swapped);
        System.out.println(lot.getInventory());
        System.out.println("--Mustang and Cruiser swap successful--");
        swapped = lot.swap(0, 2);
        System.out.println(swapped);
        System.out.println(lot.getInventory());
        System.out.println("--swap unsuccessful; 5 out of bounds --");
        swapped = lot.swap(1, 5);
        System.out.println(swapped);
        System.out.println(lot.getInventory());


    }
}