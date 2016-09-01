import java.lang.reflect.*;

public class Reflection {
    private int x;

    public Reflection() {
        x = 20;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Reflection reflection = new Reflection();
        Field field = Reflection.class.getDeclaredField("x");
        field.setAccessible(true);
        int k = (int) field.get(reflection);
        System.out.println(k);
    }
}
