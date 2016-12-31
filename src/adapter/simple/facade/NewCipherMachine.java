package adapter.simple.facade;

/**
 * Created by Tao on 12/31/2016.
 */
public class NewCipherMachine {
    public String Encrypt(String palinText){
        char []chars=palinText.toCharArray();
        String res="";
        for(char c:chars){
            res+=String.valueOf(c%17);
        }
        //System.out.println(res);
        return res;
    }
}
