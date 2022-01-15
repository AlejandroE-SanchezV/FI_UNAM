import java.util.Scanner;
import java.util.InputMismatchException;
/**
*Se importa a la librería InputMismatchException, la cual ayudará
*a que podamos "cachar" excepciones que tengan que ver con entradas
*de datos erróneas por parte de un usuario.
*/

public class TryCatchEnCiclo {
    public static void main(String[] args) {
        int x, y = 0;
        String continuar = "";
        Scanner teclado = new Scanner(System.in);

        do{
            /**
            *Se inicia una estructura de repetición do
            */
            try{
                x=0;
                /**
                *Se ejecutan todas las instrucciones que se encuentren dentro de este
                *try, que normalmente se utiliza para código que pudiera generar errores
                *lógicos
                */
                System.out.println("Proporcione el valor de x: ");
                x = teclado.nextInt();
                /**
                *Se pide al usuario que proporcione un valor entero a asignar a la variable
                *entera llamada x
                */
                continuar = "";
                y = 42/x;
                /**
                *Se hace una división del número 42 entre el valor que el usuario le haya dado a la
                *variable x, por tanto esta no puede ser 0, ya que su resultado es una
                *indeterminación
                */
            }
            catch(ArithmeticException ae){
                /**
                *Dentro del bloque catch, se captura una excepción de la clase ArithmeticException
                *llamada ae, en caso de que en el bloque try, se le diera a la variable x
                *el valor de 0, entonces se ejecutaría el siguiente bloque de código
                */
                System.out.println("Error: Division entre 0 " + ae);
                /**
                *Se imprime a pantalla el error que se cometió, y la clase de la excepción 
                *que ocurrió que en este caso sería ArithmeticException
                */
                System.out.println("Intente de nuevo...");
                continuar = "s";
                continue;
                /**
                *Se iguala la cadena continuar a s,y se ejecuta la sentencia continue
                * para indicar que se repetira de nuevo el ciclo do-while
                */
            }catch(InputMismatchException e){
                /**
                *Se captura una excepción de la clase InputMismatchException, esta se dará
                *si el valor que introduzca para el valor de la variable x no es un número,
                * ya sea que el usuario ingrese un caracter o una cadena para la variable x
                */
                e.printStackTrace();
                /**
                *Se imprime la pila de errores que se generaron con la excepción
                */
                continuar = "s";
                continue;
                /**
                *La variable continuar se iguala al caractér s, y se ejecuta la sentencia continue
                *para que se vuelva a repetir el ciclo do-while
                */
            }
            y += 7;
            System.out.println("y = " + y);
            System.out.println("Para continuar con la ejecución del programa presione s");
            continuar = teclado.next();
            /**
            *A la variable y, se le suma 7, y se imprime su valor a pantalla, y para que el ciclo do-while
            *se vuelva a repetir el usuario tiene que ingresar el caractér s
            */

        }while(continuar.equals("s") || continuar.equals("S"));
        /**
        *En caso de que el usuario ingrese un caracter S, ya sea minúscula o mayúscula se vuelve
        *a repetir el ciclo, si no es así acaba el programa.
        */
        teclado.close();
        /**
        *Cerramos el flujo de bytes del objeto de tipo Scanner teclado
        */
    }
}