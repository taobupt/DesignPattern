package Collection;


/**
 * Created by Tao on 1/1/2017.
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.name=name;
        this.description=description;
        this.vegetarian=vegetarian;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
}
