
public class MultiCatch2 {
    public static void main(String[] args) {
        try {
            final int a = args.length;
            /**
            *Se obtiene la longitud entera de los parámetros que se pasan por consola de comandos
            */
            System.out.println("Valor de a = " + a);
            final int b = 42 / a;
            /**
            *En caso de que el usuario no pase parámetros por consola de comandos, entonces 
            *el tamaño de a será de 0, lo cual causará una indeterminación
            */
            final int c[] = { 1, 2, 3 };
            c[2] = 99;
            /**
            *Se crea un arreglo de 3 elementos enteros llamado c, y se modifica el valor del
            *tercer elemento del arreglo
            */
        }/*catch(Exception e){
            System.out.println("Se atrapo una excepcion generica");
        }*/
        //Todas las clausulas catch subsecuentes son ignoradas
        /**
        *Este bloque catch se comentó, debido a que si se ejecuta este generárá un error en el código
        *porque las excepciones deben seguir una jerarquía y las mas generales van al último
        *y las mas especializadas van primero
        */
        catch(RuntimeException re){
            //Ocurre un error de compilación, debido a la clausula
            //generica catch(Exception e)
            System.out.println("Se atrapo una excepcion generica");
            /**
            *Se atrapa una excepcion de la clase RuntimeException y esta se generaá cuando ocurra
            *algún error en tiempo de compilación, pero esta es una excepción genérica también, 
            *por lo tanto también se debería comentar o eliminar del código, ya que nos generará
            *unerror en tiempo de compilación
            */
        }catch (ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
            /**
            *En un bloque catch se captura una excepcion de la clase ArithmeticException y esta 
            *ocurrirá si hay una dicisión entre cero, esto quiere decir que el valor de a sea 0
            *y al ocurrir esta excepción se imprime a pantalla el mensaje
            */
            
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango oob: " + e);
            /**
            *En este bloque catch se captura una excepció de la clase ArrayIndexOutOfBoundsException
            *y esta se dará si se intenta modificar  u obtener del arreglo c alguna posición que 
            *no exista y si se da este error se imprime a pantalla el mensaje
            */
        }finally{
            System.out.println("Despues del bloque try/catch. Siempre se ejecuta");
            /**
            *Este bloque finally, se den o no errores en los bloques try-catch se ejecutará, e imprimirá
            *a pantalla este mensaje.
            */
        }   
    }
}