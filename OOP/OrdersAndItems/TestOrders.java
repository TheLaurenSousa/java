import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item mocha = new Item();
        mocha.name = "mocha";
        mocha.price = 4.5;

        Item latte = new Item();
        latte.name = "latte";
        latte.price = 3.5;

        Item drip = new Item();
        drip.name = "drip coffee";
        drip.price = 5.0;

        Item capuccino = new Item();
        capuccino.name = "capuccino";
        capuccino.price = 7.5;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2. name = "Jimmy";
        order1.items.add(mocha);
        order1.total += mocha.price;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(capuccino);
        order3.total += capuccino.price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(drip);
        order4.total =+ drip.price;

        order1.ready = true;
        order4.items.add(latte);
        order4.items.add(latte);
        order4.total += latte.price *2;
        order2.ready = true;
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Items: %s \n", order1.items);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
