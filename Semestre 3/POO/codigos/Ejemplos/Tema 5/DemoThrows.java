
public class DemoThrows {
    static void metodoConThrow(){
        throw new IllegalAccessException("Desde metodoConThrow");
    }

    public static void main(String[] args) {
        metodoConThrow();
    }
}