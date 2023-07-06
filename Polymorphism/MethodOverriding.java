class OverrideThisClass {
    void overrideThis() {
        System.out.println("Override this class.");
    }
}

public class MethodOverriding extends OverrideThisClass {
    void overrideThis() {
        System.out.println("This method is overridden.");
    }

    public static void main(String[] args) {
        OverrideThisClass obj = new MethodOverriding();
        obj.overrideThis();
    }
}
