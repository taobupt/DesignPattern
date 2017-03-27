package observer;

/**
 * Created by Tao on 12/21/2016.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();//the method will be called when the theme changes

}
