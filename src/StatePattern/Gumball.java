package StatePattern;

/**
 * Created by Tao on 1/8/2017.
 */
public class Gumball {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;//the number of gumball;

    public Gumball(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("you can't insert another quarter");
        } else if (state == NO_QUARTER) {
            System.out.println("you inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("you haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't eject you haven't inserted a quarter yet");
        }
    }


    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there is no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you turned, but there is no quarter");
        } else if (state == HAS_QUARTER) {
            System.out.println("you turned ...");
            state = SOLD;
            dispense();
        }
    }

    //dispatch the gumball
    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("oops, out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("you need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("no gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

}
