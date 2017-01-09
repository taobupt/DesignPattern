package StatePattern.gumballState;

/**
 * Created by Tao on 1/8/2017.
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
