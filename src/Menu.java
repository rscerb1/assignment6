import java.util.ArrayList;

public class Menu {

    private final ArrayList<MenuItem> menuList; // arrayList of menuItems
    private int itemNumberIterator = 0;

    // singleton stuff
    private static final Menu singleton = new Menu();
    public static Menu getInstance(){return singleton;}

    // constructor
    private Menu() {
        menuList = new ArrayList<MenuItem>(); // initialize menuList
        fillMenu();
    }

    // getter for menu length
    public int getSize(){return itemNumberIterator;}

    // getter for a specific item based off its index
    public MenuItem getMenuItemFromItemNum(int itemNumber){return menuList.get(itemNumber); }

    // method to print out the formatted menu
    public void displayMenu(){
        System.out.printf("   %-25s%-12s%s\n", "Entree:", "Price:", "Description:");
        int i=0;
        for (MenuItem temp : menuList) {
            System.out.printf("%d) %-25s%2.2f\t\t%s\n", i, temp.getName(), temp.getPrice(), temp.getDescription());
            i++;
        }
    }

    // method to add an menuItem to the menu and iterate the item number variable (itemNumberIterator)
    private void addToMenu(String name, String description, double price){
        menuList.add(new MenuItem(name, description, price, this.itemNumberIterator));
        this.itemNumberIterator++ ;
    }

    // Method to fill the menu
    // Normally this would take inputs from a file but I didn't feel that was needed in this demo
    private void fillMenu(){
        addToMenu("Steak Dinner", "Porterhouse and Baked Potato", 20.99);
        addToMenu("Blackened Salmon", "Blackened Salmon and Wild Rice", 22.99);
        addToMenu("Ahi Tacos", "Four Ahi Tuna Tacos with a Pineapple and Lime Sauce", 16.99);
        addToMenu("Bacon Cheese Burger", "Angus Beef 1/4 Pounder with Fries", 17.99);
        addToMenu("Chefs Salad", "Arugula and Kale Salad with Egg and Tofu", 14.99);
    }
}
