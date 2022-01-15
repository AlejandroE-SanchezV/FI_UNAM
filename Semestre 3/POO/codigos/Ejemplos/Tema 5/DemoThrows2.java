public class DemoThrows2 {
    static void metodoConThrow() throws IllegalAccessException{
        throw new IllegalAccessException("Desde metodoConThrow");
    }

    public static void main(String[] args) {
        try{
            metodoConThrow();
        }catch(IllegalAccessException i){
            System.out.println("Excepcion atrapada " + i);
        }
    }
}
    