import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i = 0; i <= prices.length-1; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i <= menuItems.size()-1; i++){
            String name = menuItems.get(i);
            System.out.println(i + " " + name);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}