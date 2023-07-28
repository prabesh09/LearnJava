interface Sketch {
    void drawOutline();
}

interface Color {
    void fillColor();
}

public class MultipleInheritance implements Sketch, Color {
    public void fillColor() {
        System.out.println("Fill Color");
    }

    public void drawOutline() {
        System.out.println("Outline Completed");
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.drawOutline();
        mi.fillColor();
    }
}
