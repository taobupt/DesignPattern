package adapter.simple.facade;

/**
 * Created by Tao on 12/31/2016.
 */
public class NewEncryptFacade implements AbstractEncryptFacade {
    private FileRead reader;
    private FileWrite write;
    private NewCipherMachine machine;
    public NewEncryptFacade(){
        reader=new FileRead();
        write=new FileWrite();
        machine=new NewCipherMachine();
    }

    public void FileEncrypt(String filenameSrc,String fileNameDes){
        String plainText=reader.read(filenameSrc);
        String encryptStr=machine.Encrypt(plainText);
        System.out.println(encryptStr);
        write.write(encryptStr,fileNameDes);
    }
}
