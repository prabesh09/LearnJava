public class ArraySum {
    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 22, 33, 44, 55 };
        int[] arr2 = { 11, 3, 6, 9, 7 };
        System.out.println("Sum : " + sumOfArray(arr1));
        System.out.println("Sum : " + sumOfArray(arr2));
    }
}
