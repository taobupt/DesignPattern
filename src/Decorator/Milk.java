package Decorator;

/**
 * Created by Tao on 12/22/2016.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Milk";
    }

    public double cost(){
        return beverage.cost()+.10;
    }

}
