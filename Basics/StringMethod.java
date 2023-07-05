public class StringMethod {
    public static void main(String[] args) {
        String firstName = "Nico";
        String lastName = "Robin";
        System.out.println(firstName + " " + lastName);
        char[] status = { 'q', 'u', 'e', 'e', 'n' };

        // Character array to string
        System.out.println(new String(status));

        // String to character array
        System.out.println(firstName.toCharArray()[0]);

        // Find the length of string
        System.out.println(firstName.length());

        // Get character located at specific index
        System.out.println(firstName.charAt(3));

        // Typecasting
        int num = 11;
        System.out.println(String.valueOf(num));
    }
}
