public class UsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        str.append("World");
        System.out.println(str);

        StringBuilder st = new StringBuilder(16);
        System.out.println(st.length());

        char[] str2 = { 'm', 'o', 'o', 'n' };
        StringBuilder sb = new StringBuilder();
        for (char c : str2) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
