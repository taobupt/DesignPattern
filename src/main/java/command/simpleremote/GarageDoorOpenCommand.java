package command.simpleremote;

/**
 * Created by Tao on 12/29/2016.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor=garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }
}
