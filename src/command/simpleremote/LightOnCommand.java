package command.simpleremote;

/**
 * Created by Tao on 12/29/2016.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    public void execute(){
        light.on();
    }
}
