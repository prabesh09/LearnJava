import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Try to enter string:");
            int num = sc.nextInt();
            System.out.println("Number: " + num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
