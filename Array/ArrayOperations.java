import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        Arrays.fill(arr1, 11);
        int[] arr2 = { 11, 22, 33 };

        // Compares two array
        System.out.println(Arrays.equals(arr1, arr2));

        String[] string = { "love", "is", "a", "hurricane" };
        System.out.println(Arrays.toString(string));
        Arrays.sort(string); // a hurricane is love
        System.out.println(Arrays.binarySearch(string, "love"));

        // Copy from other array
        int[] arr3 = Arrays.copyOf(arr2, 2);
        System.out.println(arr3.length);
    }
}