package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Tao on 1/1/2017.
 */
public class Waitress {

    ArrayList menus;

    public Waitress(ArrayList menus){
        this.menus=menus;
    }

    public void printMenu(){
        Iterator menuIterator=menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu=(Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator myIterator){
        while(myIterator.hasNext()){
            MenuItem menuItem=(MenuItem) myIterator.next();
            System.out.println(menuItem.getName()+" ,");
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
