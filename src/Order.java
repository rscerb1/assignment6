import java.util.ArrayList;

public class Order {

    private final ArrayList<Integer> orderedItems; // array list of the item numbers picked from the menu

    // constructor
    public Order(){orderedItems = new ArrayList<Integer>(); }

    // getter for array list of ordered items
    public ArrayList<Integer> getOrder(){return this.orderedItems; }

    //  method to add an item to the ordered items array list
    private void addToArray(int itemNumber){orderedItems.add(itemNumber);}

    // method for adding a string of itemNums to the orderedItems array list
    public void addToOrder(String input){
        String[] items = input.split(",");
        int temp = 0;
        // check if the numbers match items on the menu
        for (String item : items){
            temp = Integer.parseInt(item);
            // if the selection isn't on the menu, give error message and cancel
            if(temp < 0 || temp > Menu.getInstance().getSize()) {
                System.out.println("I'm sorry, we couldn't find a entree with the number: " + temp);
                return;
            }
        }
        // if no errors, add items to the order
        for (String item : items)
                addToArray(Integer.parseInt(item));
        System.out.println("The entrees have been added to your order");
        System.out.println("\nPress enter to return to options.");
    }

    // method to submit the ordered items to Tab singleton
    public void submitOrder(){Tab.getInstance().createTab(orderedItems); }

}
