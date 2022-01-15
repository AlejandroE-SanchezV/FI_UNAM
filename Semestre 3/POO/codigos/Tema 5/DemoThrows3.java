
public class DemoThrows3 {
    static void metodoConThrow() throws IllegalAccessException{
        throw new IllegalAccessException("Desde metodoConThrow");
    }

    public static void main(String[] args) throws IllegalAccessException{
        metodoConThrow();
    }
}