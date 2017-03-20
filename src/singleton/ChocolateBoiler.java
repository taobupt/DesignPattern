package singleton;

/**
 * Created by Tao on 12/28/2016.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }

    //double check, lazy load, initial it when you need it .
    //this is lazy man method.
    public static ChocolateBoiler getUniqueInstance(){
        if(uniqueInstance==null){
            synchronized (ChocolateBoiler.class){
                if (uniqueInstance == null) {//why we need this? when two thread A,B come into this, A visit first, and create the instance, when B'turn, it doesn't know instance
                    //has been created.
                    uniqueInstance=new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }


    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty=true;
        }
    }

    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled=true;
        }
    }
}


