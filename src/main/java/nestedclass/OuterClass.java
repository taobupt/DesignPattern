package nestedclass;

/**
 * Created by Tao on 12/29/2016.
 */
public class OuterClass {
    public int a;
    protected  int b;
    int c;
    private int d;
    public static int e=10;

    public OuterClass(){

    }
    public OuterClass(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static class InnerClass{
        public int getE(){
            return e+10;
        }

        public int getA(){
            return new OuterClass().a+4;
        }

        public int getB(){
            return new OuterClass().b+4;
        }

        public int getC(){
            return new OuterClass().c+4;
        }

        public int getD(){
            return new OuterClass().d+4;
        }
    }
}
