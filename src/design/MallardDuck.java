package design;

/**
 * Created by taobupt on 12/21/2016.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display()
    {
        System.out.println("I am a real mallard duck");
    }
}
