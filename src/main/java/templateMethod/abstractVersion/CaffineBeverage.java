package templateMethod.abstractVersion;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tao on 12/31/2016.
 */
public abstract class CaffineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }

    String getUserInput(){
        String answer=null;
        System.out.println("would you like milk and sugar with your coffee (y/n)?");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        return answer==null?"no":answer;
    }

}
