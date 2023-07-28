import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class NumberContainer implements Serializable {
    int number;

    NumberContainer(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }
}

public class Serialization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        NumberContainer nc = new NumberContainer(num);

        sc.close();

        try {
            FileOutputStream file = new FileOutputStream("number.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(nc);
            output.close();

            FileInputStream fileStream = new FileInputStream("number.txt");
            ObjectInputStream input = new ObjectInputStream(fileStream);

            NumberContainer dc = (NumberContainer) input.readObject();

            System.out.println("Number read from serialization: " + dc.getNumber());

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
