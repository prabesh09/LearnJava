public class MatchLength {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 567, 33 };

        // expected output: 011, 002, 567, 033

        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%03d", arr[i]) + " ");
        }
    }
}