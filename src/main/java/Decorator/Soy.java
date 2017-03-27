package Decorator;

/**
 * Created by Tao on 12/22/2016.
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }

    public double cost(){
        double cost=beverage.cost();
        switch (beverage.getSize()){
            case LARGE:
                cost+=.20;
                break;
            case MEDIUM:
                cost+=.15;
                break;
            case SMALL:
                cost+=.10;
                break;
        }
        return cost;
    }
}
