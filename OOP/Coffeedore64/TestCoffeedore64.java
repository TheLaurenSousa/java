import java.util.ArrayList;

public class TestCoffeedore64 {
    public static void main(String[] args){
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("Banana", 2.00);
        coffeeKiosk.addMenuItem("Coffee", 1.50);
        coffeeKiosk.addMenuItem("Latte", 4.50);
        coffeeKiosk.addMenuItem("Capuccino", 3.00);
        coffeeKiosk.addMenuItem("Muffin", 4.00);

        coffeeKiosk.newOrder();
    }
}