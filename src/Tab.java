import java.util.ArrayList;

public class Tab {

    double totalPrice = 0; // the total price of all items in the order list
    private ArrayList<MenuItem> fullTab = new ArrayList<MenuItem>();


    private static final Tab singleton = new Tab();
    public static Tab getInstance(){return singleton;}

    // setter for tab array list of integers
    public void createTab(ArrayList<Integer> tab){
        this.fullTab = new ItemNumToItemAdapter().adapt(tab);
    }

    public void displayTab(){
        String[] finalTab = getTab();
        for(String string : finalTab){
            System.out.println(string);
        }
        System.out.printf("Total - - - - - - - - - - - - - %2.2f\n",totalPrice);
    }

    // I made the following class to send an array of strings to the user interface for them to print out.
    // However, the instructions also said to print the tab using the displayTab command. The array of
    // strings is instead sent to the displayTab function in this class
        public String[] getTab(){

        String[] tabStrings = new String[fullTab.size()];
        int i=0;
        for(MenuItem menuItem: fullTab){
            tabStrings[i] = menuItem.getName() + " - - - - - " + menuItem.getPrice();
            totalPrice += menuItem.getPrice();
            i++;
        }
        return tabStrings;
    }

}


