package compound;

/**
 * Created by Tao on 1/15/2017.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notitfyObservers();
}
