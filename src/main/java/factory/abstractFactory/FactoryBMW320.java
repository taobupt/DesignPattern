package factory.abstractFactory;

/**
 * Created by Tao on 12/28/2016.
 */
public class FactoryBMW320 implements AbstractFactory {

    public Engine createEngine(){
        return new EngineA();
    }


    public Aircondition createAircondition(){
        return new AirconditionA();
    }
}
