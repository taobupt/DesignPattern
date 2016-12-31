package adapter.simple.facade;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Tao on 12/31/2016.
 */
public class FileRead {
    public String read(String filenmae){
        String res="";
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(filenmae));
            String str;
            while((str=bufferedReader.readLine())!=null){
                res+=str;
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println(res);
        return res;
    }
}
