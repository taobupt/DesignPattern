package factory;

/**
 * Created by Tao on 12/22/2016.
 */


import java.util.ArrayList;


public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("Prepare "+name);
    }

    public void bake(){
        System.out.println("Baking "+name);
    }

    public void cut(){
        System.out.println("Cutting "+name);
    }

    public void box(){
        System.out.println("Boxing "+name);
    }

    public String toString(){
        StringBuffer display=new StringBuffer();
        display.append("---- "+name+" ----\n");
        display.append(dough+"\n");
        display.append(sauce+"\n");
        for(int i=0;i<toppings.size();++i){
            display.append((String)toppings.get(i)+"\n");
        }
        return display.toString();
    }
}
