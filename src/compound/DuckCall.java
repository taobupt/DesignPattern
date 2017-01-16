package compound;

/**
 * Created by Tao on 1/15/2017.
 */
public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck call";
    }
}
