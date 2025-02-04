package U7T3;
import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double sum = 0;
        for (MenuItem menuItem : check) {
            sum += menuItem.getPrice();
        }
        return sum;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        if (totalPrices() < 40) {
            return false;
        }
        for (MenuItem menuItem : check) {
            if (menuItem.isDailySpecial()) {
                return false;
            }
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        int entrees = 0; double tip = 0; double discount = 0; double price = totalPrices();

        for (MenuItem menuItem : check) {
            if (menuItem.isEntree()) {
                entrees++;
            }
        }
        if (entrees >= 6) {
            tip = price * 0.2;
        }
        if (couponApplies()) {
            discount = price * 0.25;
        }

        return price + tip - discount;
    }
}
