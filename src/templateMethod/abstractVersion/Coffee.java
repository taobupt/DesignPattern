package templateMethod.abstractVersion;

/**
 * Created by Tao on 12/31/2016.
 */
public class Coffee extends CaffineBeverage {
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
}

