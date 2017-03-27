package Decorator;

/**
 * Created by Tao on 12/22/2016.
 */
public class Decaf extends Beverage {
    public Decaf(){
        description="Decaf";
    }

    public double cost(){
        return 1.05;
    }
}
