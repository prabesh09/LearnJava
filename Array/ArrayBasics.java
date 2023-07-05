public class ArrayBasics {
    public static void main(String[] args) {
        // Declaring array
        int[] arr1 = { 11, 22, 33 };
        int[] arr2 = new int[3];
        arr2[0] = 3;
        arr2[1] = 6;
        arr2[2] = 9;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Enhanced for loop
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
