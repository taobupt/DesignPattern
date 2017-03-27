package StatePattern.gumballState;

/**
 * Created by Tao on 1/8/2017.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you haven't inserted a quartet");
    }

    public void turnCrank() {
        System.out.println("you turned, but there is no quarter");
    }

    public void dispense() {
        System.out.println("you need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
