package adapter.simple.facade;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Created by Tao on 12/31/2016.
 */
public class FileWrite {
    public void write(String encryptStr,String filenameDes){
        //if it is character steam
        //BufferWriter writer=new BufferedWriter(new FileWriter());
        //writer.write(str)
        //writer.newLine();

        try{
            OutputStream out=new FileOutputStream(filenameDes);
            out.write(encryptStr.getBytes(Charset.forName("UTF-8")));
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
