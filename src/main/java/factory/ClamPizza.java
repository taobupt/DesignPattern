package factory;

/**
 * Created by Tao on 12/22/2016.
 */
public class ClamPizza extends Pizza {
    public ClamPizza(){
        name="Clam Pizza";
        dough="Thin crust";
        sauce="White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
