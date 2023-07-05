import java.util.Scanner;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        separateArray(arr);
        sc.close();
    }

    static void separateArray(int[] arr) {
        int evenSize = 0, oddSize = 0;
        int[] evenArray = new int[arr.length];
        int[] oddArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenSize] = arr[i];
                evenSize++;
            } else {
                oddArray[oddSize] = arr[i];
                oddSize++;
            }
        }
        System.out.print("Even Array: ");
        for (int i = 0; i < evenSize; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("Odd Array: ");
        for (int i = 0; i < oddSize; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
