package Decorator;

/**
 * Created by Tao on 12/22/2016.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
