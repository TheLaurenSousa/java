import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item mocha = new Item("mocha", 4.5);
        Item latte = new Item("latte", 3.5);
        Item drip = new Item("drip coffee", 5.0);
        Item capuccino = new Item("capuccino", 7.5);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Lauren");
        Order order4 = new Order("Kristina");
        Order order5 = new Order("Artemis");

        order1.addItem(mocha);
        order1.addItem(drip);

        order2.addItem(latte);
        order2.addItem(capuccino);

        order3.addItem(mocha);
        order3.addItem(latte);

        order4.addItem(drip);
        order4.addItem(capuccino);

        order5.addItem(mocha);
        order5.addItem(capuccino);

        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        order1.display();

        // Application Simulations
    }
}
