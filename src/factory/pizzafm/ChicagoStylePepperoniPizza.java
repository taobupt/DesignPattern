package factory.pizzafm;



/**
 * Created by Tao on 12/22/2016.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name="Chicgo Style Pepperoni Pizza";
        dough="Extra Thick Crust Dough";
        sauce="plum tomato sacue";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
