package adapter.simple.facade;

/**
 * Created by Tao on 12/31/2016.
 */
public class EncryptFacade implements AbstractEncryptFacade{
    private FileRead reader;
    private FileWrite write;
    private CipherMachine machine;
    public EncryptFacade(){
        reader=new FileRead();
        write=new FileWrite();
        machine=new CipherMachine();
    }

    public void FileEncrypt(String filenameSrc,String fileNameDes){
        String plainText=reader.read(filenameSrc);
        String encryptStr=machine.Encrypt(plainText);
        System.out.println(encryptStr);
        write.write(encryptStr,fileNameDes);
    }
}
