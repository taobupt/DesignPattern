package command.simpleremote;

/**
 * Created by Tao on 12/29/2016.
 */
public class SimpleRemoteControl {
    Command slot;

    public Command getSlot() {
        return slot;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public SimpleRemoteControl(){

    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
