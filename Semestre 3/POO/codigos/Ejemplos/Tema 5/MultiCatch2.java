
public class MultiCatch2 {
    public static void main(String[] args) {
        try {
            final int a = args.length;
            System.out.println("Valor de a = " + a);
            final int b = 42 / a;
            final int c[] = { 1, 2, 3 };
            c[2] = 99;
        }/*catch(Exception e){
            System.out.println("Se atrapo una excepcion generica");
        }*/
        //Todas las clausulas catch subsecuentes son ignoradas
        catch(RuntimeException re){
            //Ocurre un error de compilación, debido a la clausula
            //generica catch(Exception e)
            System.out.println("Se atrapo una excepcion generica");
        }catch (ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango oob: " + e);
        }finally{
            System.out.println("Despues del bloque try/catch. Siempre se ejecuta");
        }   
    }
}