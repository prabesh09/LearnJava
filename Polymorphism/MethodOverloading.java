class OverloadThisClass {
    void sum(int a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("The sum is : " + (a + b + c));
    }
}

public class MethodOverloading extends OverloadThisClass {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(7, 11);
        obj.sum(3, 6, 9);
    }
}
