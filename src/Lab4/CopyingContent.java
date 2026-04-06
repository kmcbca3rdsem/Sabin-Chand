package Lab4;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyingContent {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("file.txt");
            FileOutputStream fos =new FileOutputStream("temp.txt")){
            int byteRead=0;
            while(byteRead!=-1){
                byteRead = fis.read();
                fos.write(byteRead);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
