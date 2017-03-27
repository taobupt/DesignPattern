package Collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Tao on 1/1/2017.
 */
public class CafeMenu implements Menu {
    HashMap menuItems;
    public CafeMenu(){
        menuItems=new HashMap();
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
}
