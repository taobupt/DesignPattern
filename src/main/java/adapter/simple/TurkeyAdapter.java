package adapter.simple;

/**
 * Created by Tao on 12/31/2016.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    public void quack(){
        turkey.goggle();
    }

    public void fly(){
        for(int i=0;i<5;++i){
            turkey.fly();
        }
    }
}
