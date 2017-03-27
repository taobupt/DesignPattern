package factory.abstractFactory;

/**
 * Created by Tao on 12/28/2016.
 */
public class FactoryBMW523 implements AbstractFactory {
    public Engine createEngine(){
        return new EngineB();
    }

    public Aircondition createAircondition(){
        return new AirconditionB();
    }
}
