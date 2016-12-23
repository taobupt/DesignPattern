package Decorator;

/**
 * Created by Tao on 12/22/2016.
 */
public abstract class Beverage {
    public enum Size{LARGE,MEDIUM,SMALL};
    Size size=Size.LARGE;
    String description="Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
