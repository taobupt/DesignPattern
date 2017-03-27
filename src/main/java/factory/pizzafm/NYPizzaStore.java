package factory.pizzafm;

/**
 * Created by Tao on 12/22/2016.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String name){
        if(name.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(name.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(name.equals("clam")){
            return new NYStyleClamPizza();
        }else if(name.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else return null;
    }
}
