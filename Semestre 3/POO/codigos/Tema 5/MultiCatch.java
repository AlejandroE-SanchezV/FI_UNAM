
public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("Valor de a = " + a);
            int b = 42 / a;
            int c[] = { 1, 2, 3 };
            c[20] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango oob: " + e);
        }finally{
            System.out.println("Despues del bloque try/catch. Siempre se ejecuta");
        }   
    }
}