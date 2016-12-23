package factory.pizzafm;

/**
 * Created by Tao on 12/22/2016.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarlla Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
