import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        DinnerOrder dinnerOrder = new DinnerOrder();
        Order order = new Order();

        Scanner scanner = new Scanner(System.in); // make a scanner to read user selection
        String selection; // string to store user selection
        boolean loop = true; // bool to control loop

        while(loop) {
            System.out.println("""
                To select an option, enter the number to the left of the option.
                0) Exit Program
                1) Display Menu
                2) Add Entrees to Order
                3) Submit Order
                4) Display Tab
                """);
            selection = scanner.nextLine();
            switch (selection) {
                case "0": // set loop boolean to false to escape method
                    loop = false;
                    System.out.println("Goodbye");
                    break;
                case "1":
                    dinnerOrder.setCommand(new DisplayMenuCommand());
                    dinnerOrder.submitCommand();
                    System.out.println("\nPress enter to return to options.");
                    scanner.nextLine();
                    break;
                case "2":
                    dinnerOrder.setCommand(new DisplayMenuCommand());
                    dinnerOrder.submitCommand();
                    System.out.println("Enter the numbers to the left of items you would like to add to your order in a comma separated list");
                    Scanner orderScanner = new Scanner(System.in);
                    order.addToOrder(orderScanner.next());
                    orderScanner.nextLine();
                    break;
                case "3":
                    dinnerOrder.setCommand(new SubmitOrderCommand(order));
                    dinnerOrder.submitCommand();
                    System.out.println("You order has been sent to the kitchen.");
                    break;
                case "4":
                    System.out.println("Thank you for choosing our restaurant!");
                    System.out.println(" - - - - - - - - - - - - - - - - - - ");
                    dinnerOrder.setCommand(new DisplayTabCommand(Tab.getInstance()));
                    dinnerOrder.submitCommand();
                    System.out.println(" - - - - - - - - - - - - - - - - - - \n");
                    break;
                default:
                    System.out.println("You entered an incorrect option, try again.");
            }
        }
    }


}
