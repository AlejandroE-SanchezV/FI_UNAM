
class ExcepcionesAnidadas2 {
    static void metodoConTry(int a) {
        /**
        *El método metodoConTry es de tipo void y recibirá como parámetro un entero llamado a
        */
        try {
            if(a==1) a = a/(a-a);
            /**
            *En el único bloque try de este método, se verifica si el valor de a es igual a 1 en una
            *estructura de control de flujo if, si es verdadera la condición, entonces el valor de a se 
            *divide entre la resta del valor de menos el valor de a, lo cual dará como resultado 0,
            *y entonces se genera un error ya que se hace una división entre 0, lo cual es una indeterminación
            */
            if(a==2) {
                int c[] = { 1 };
                c[42] = 99;
                /**
                *Se verifica el valor de a en otro if, y si este es igual a 2, entonces se crea una arreglo c
                *de tamaño 1, y después se trata de modificar el valor en la posición número 42 del arreglo
                *lo cual es un error ya que es una posición que no existe
                */
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango: " + e);
            /**
            *En el bloque catch se atrapa una excepción de la clase ArrayIndexOutOfBoundsException en caso
            *de que se intente acceder a una localidad del arreglo que no exista, y en caso de que se de este
            *error se imprime a pantalla el mensaje junto con el tipo de excepción generada.
            *
            */
        }
    }
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            /**
            *En dos variables enteras a y b se obtienen la longitud de cadenas que se pasa al método main
            *y la división de 42 entre a respectivamente, en caso de que no se pasen cadenas al método
            *main, entonces el valor de a será cero, y al dividir cualquier número entre cero el resultado
            *será una indeterminación
            */
            metodoConTry(a);
            /**
            *Se invoca al método metodoconTry, y se pasa como parámetro el valor de a
            *como este método tiene dentro de el un bloque try-catch que maneja una excepción
            *se cumple la condición de excepciones anidadas, aunque dentro del método main
            *solo tengamos como tal un bloque try-catch que maneja una excepción
            */
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
            /**
            *En el bloque catch que pertenece al primer bloque try, se captura una excepción de la clase
            *ArithmeticException, la cual se dará si se genera una división entre 0, entonces si esta se 
            *genera se imprime a pantalla el mensaje
            */
        }
    }
}