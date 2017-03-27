package StatePattern.gumballState;

/**
 * Created by Tao on 1/8/2017.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println(" you can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void dispense() {
        System.out.println("No gumabll dispense");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
