package Collection;

import Collection.JavaIterator.DinnerMenuJavaIterator;

import java.util.Iterator;

/**
 * Created by Tao on 1/1/2017.
 */
public class DinnerMenu implements Menu{
    static final int MAX_VALUE=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinnerMenu(){

        menuItems=new MenuItem[MAX_VALUE];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name,String description, boolean vegetarian, double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        if(numberOfItems>=MAX_VALUE){
            System.err.println("Sorry, menu is full. Can't add item to menu");
        }else{
            menuItems[numberOfItems++]=menuItem;
        }
    }

    public Iterator createIterator(){
        return new DinnerMenuJavaIterator(menuItems);
    }
}
