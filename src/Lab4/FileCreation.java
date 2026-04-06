package Lab4;

import java.io.File;

public class FileCreation {
    public static void main(String[] args){
        try{
            File file = new File("file.txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else{
                System.out.println("File already exists:" + file.getName());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
