import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("./hello.txt");
            int rv = 0;
            while ((rv = fin.read()) != -1) {
                System.out.print((char) rv);
            }
            fin.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
