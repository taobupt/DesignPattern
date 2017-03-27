package templateMethod.simpleversion;

/**
 * Created by Tao on 12/31/2016.
 */
public class Coffee {
    void prepareRecipe(){
        boildWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boildWater(){
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk(){
        System.out.println("Addind Sugar and Milk");
    }
}
