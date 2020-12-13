public class MenuItem {
    private String name;
    private String description;
    private double price;
    private int itemNumber;

    // constructor with no parameters
    public MenuItem(){}

    // constructor with parameters to initialize instance variables
    public MenuItem(String name, String description, double price, int itemNumber){
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemNumber = itemNumber;
    }

    // getters
    public String getName(){return name; }
    public String getDescription(){return description; }
    public double getPrice(){return price; }
    public int getItemNumber(){return itemNumber; }


    // setters
    public void setName(String name){this.name = name; }
    public void setDescription(String description){this.description = description; }
    public void setPrice(double price){this.price = price; }
    public void setItemNumber(int itemNumber){this.itemNumber = itemNumber; }
}
