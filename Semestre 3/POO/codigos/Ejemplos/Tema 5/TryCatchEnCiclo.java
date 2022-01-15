import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchEnCiclo {
    public static void main(String[] args) {
        int x, y = 0;
        String continuar = "";
        Scanner teclado = new Scanner(System.in);

        do{
            try{
                System.out.println("Proporcione el valor de x: ");
                x = teclado.nextInt();
                continuar = "";
                y = 42/x;
            }
            catch(ArithmeticException ae){
                System.out.println("Error: Division entre 0 " + ae);
                System.out.println("Intente de nuevo...");
                continuar = "s";
                continue;
            }catch(InputMismatchException e){
                e.printStackTrace();
                continuar = "s";
                continue;
            }
            y += 7;
            System.out.println("y = " + y);
            System.out.println("Para continuar con la ejecución del programa presione s");
            continuar = teclado.next();

        }while(continuar.equals("s") || continuar.equals("S"));
        teclado.close();
    }
}