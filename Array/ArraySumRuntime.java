import java.util.Scanner;

public class ArraySumRuntime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sum: " + sumOfArray(arr));
        sc.close();
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
