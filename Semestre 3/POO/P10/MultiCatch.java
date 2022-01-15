
public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            /**
            *Se obtiene la longitud entera de los parámetros que se pasan por consola de comandos
            */
            System.out.println("Valor de a = " + a);
            int b = 42 / a;
            /**
            *En caso de que el usuario no pase parámetros por consola de comandos, entonces 
            *el tamaño de a será de 0, lo cual causará una indeterminación
            */
            int c[] = { 1, 2, 3 };
            c[2] = 99;
            /**
            *Se crea un arreglo de 3 elementos enteros llamado c, y se modifica el valor del
            *tercer elemento del arreglo
            */
        } catch (ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
            /**
            *El bloque catch, captura una excepción de la clase ArithmeticException y esta
            *se dará si el valor de a en el bloque try es igual a 0, entonces si la excepción
            *ocurre se imprime a pantalla el error que se generó
            */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango oob: " + e);
            /*En otro bloque catch, ahora se captura una excepción de la clase ArrayIndexOutOfBoundsException
            *y esta se dará ei en el arreglo c, se trata de modificar una posición en el arreglo que no
            *exista, o que también se trate de extraer un elemento del arreglo c en una posición que no exista
            *entonces se imprime a pantalla el error generado.
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