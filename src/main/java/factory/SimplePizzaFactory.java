package factory;

/**
 * Created by Tao on 12/22/2016.
 */
public class SimplePizzaFactory {

    public Pizza create(String type){
        Pizza pizza=null;

        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza=new ClamPizza();
        }else if(type.equals("veggie")){
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}
