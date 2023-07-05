import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.printf("Your name is %s and your age is %d.", name, age);
        sc.close();
    }
}
