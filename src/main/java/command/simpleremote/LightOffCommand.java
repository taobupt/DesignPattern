package command.simpleremote;

/**
 * Created by Tao on 12/28/2016.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }

    public void execute(){
        light.off();
    }
}
