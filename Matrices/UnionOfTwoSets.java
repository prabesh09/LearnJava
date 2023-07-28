public class UnionOfTwoSets {
    public static void main(String[] args) {
        int[] a = { 3, 2, 5, 6, 7 };
        int[] b = { 2, 6, 7, 9, 8 };
        int size = a.length + b.length;

        int[] intersection = new int[size];
        int count = 0;
        int[] union = new int[size];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    intersection[count++] = a[i];
                }
            }
        }

        for (int i = 0; i < count; i++) {
            union[i] = intersection[i];
        }

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (a[i] == intersection[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                union[count++] = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (b[i] == intersection[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                union[count++] = b[i];
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(union[i]);
        }

    }
}
