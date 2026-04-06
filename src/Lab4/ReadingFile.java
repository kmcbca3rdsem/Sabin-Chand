package Lab4;
import java.io.FileReader;

public class ReadingFile {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
