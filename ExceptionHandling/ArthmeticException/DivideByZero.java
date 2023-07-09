public class DivideByZero {
    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error ! " + e.getMessage());
        }
    }
}
