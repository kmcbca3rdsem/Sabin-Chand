package Lab4;

import java.io.FileWriter;

public class WritingInFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("file.txt");
            writer.write("This is a sentence.");
            writer.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
