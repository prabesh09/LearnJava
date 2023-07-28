import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }
}

public class ReflectionAPI {
    public static void main(String[] args)
            throws Exception {
        Human human = new Human("Zura", 22);
        System.out.println("Name:" + human.getName());

        Field field = Human.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(human, "Katsura");
        System.out.println("zura nai : " + human.getName());

        Method method = Human.class.getDeclaredMethod("getAge");
        method.setAccessible(true);
        int age = (int) method.invoke(human);
        System.out.println("Age: " + age);

    }
}