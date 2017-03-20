package singleton;

/**
 * Created by tao on 3/20/17.
 */

//initialization with demand holder
//add a static inner class
public class Singleton {
    private Singleton() {
        System.out.println("constructor has been called");
    }

    public static class Holder {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        System.out.println("get instance hass been called");
        return Holder.instance;
    }

    public static void main(String[] args) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
