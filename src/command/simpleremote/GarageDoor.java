package command.simpleremote;

/**
 * Created by Tao on 12/28/2016.
 */
public class GarageDoor {
    public GarageDoor(){

    }

    public void up(){
        System.out.println("Garage door is Open");
    }

    public void down(){
        System.out.println("Garage Door is closed");
    }

    public void stop(){
        System.out.println("Garage Door is stopped");
    }

    public void lighOn(){
        System.out.println("Garage ligh is on");
    }

    public void lighOff(){
        System.out.println("Garage light is off");
    }
}
