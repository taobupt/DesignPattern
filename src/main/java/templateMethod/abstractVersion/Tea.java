package templateMethod.abstractVersion;

/**
 * Created by Tao on 12/31/2016.
 */
public class Tea extends CaffineBeverage {
    public void brew(){
        System.out.println("steeping the tea");
    }

    public void addCondiments(){
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

}
