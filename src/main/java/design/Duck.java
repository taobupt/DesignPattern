package design;

/**
 * Created by taobupt on 12/21/2016.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck()
    {


    }
    public void performQuack()
    {
        quackBehavior.quack();
    }
    public void performFly()
    {
        flyBehavior.fly();
    }
    public void swim()
    {
        System.out.println("I am flying");
    }
    public abstract void display();

}
