import java.io.FileInputStream;
import java.io.IOException;
public class Ex10_9 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/Users/data25/Documents/test/test.txt");
        int ch;

        while ((ch = fis.read())!= -1){
            System.out.println((char) ch);

        }
        fis.close();
    }
}
