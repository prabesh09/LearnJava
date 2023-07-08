public class Constructor {
    int value;

    Constructor(int value) {
        this.value = value;
    }

    int sendValue() {
        return value;
    }

    public static void main(String[] args) {
        Constructor vc = new Constructor(11);
        System.out.println(vc.sendValue());
    }
}