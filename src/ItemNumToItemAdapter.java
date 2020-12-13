import java.util.ArrayList;

// adapter to convert array of item numbers to array list of menu items
public class ItemNumToItemAdapter {
    private final ArrayList<MenuItem> menuItemArrayList;

    public ItemNumToItemAdapter(){
        this.menuItemArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
    }

    public ArrayList<MenuItem> adapt(ArrayList<Integer> ints){
        for(Integer itemNum : ints)
            this.menuItemArrayList.add(Menu.getInstance().getMenuItemFromItemNum(itemNum));
    return this.menuItemArrayList;
    }

}
