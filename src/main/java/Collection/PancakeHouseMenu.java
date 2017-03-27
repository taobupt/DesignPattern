package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Tao on 1/1/2017.
 */

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems=new ArrayList();
        addItem("K&B's Pancake Breakfast","Pancakes with scrabled egges, and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried egges, sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancakes with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name,String description,boolean vegetarian, double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }


}
