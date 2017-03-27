package factory;

/**
 * Created by Tao on 12/22/2016.
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name="Pepperoni Pizza";
        dough="Crust";
        sauce="Marinara sacue";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
