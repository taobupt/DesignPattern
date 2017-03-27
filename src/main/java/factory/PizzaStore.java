package factory;

/**
 * Created by Tao on 12/22/2016.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza=factory.create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
