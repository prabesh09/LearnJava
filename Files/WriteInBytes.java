import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInBytes {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("./hello.txt");
            String str = "Sky is blue.";
            fout.write(str.getBytes());
            fout.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
