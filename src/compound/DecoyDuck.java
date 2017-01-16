package compound;

/**
 * Created by Tao on 1/15/2017.
 */
public class DecoyDuck implements Quackable {
    public void quack() {
        System.out.println("<<Silence>>");
    }

    public String toString() {
        return "Decoy Duck";
    }
}
