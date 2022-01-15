class ExcepcionesAnidadas {
    public static void main(String args[]) {
        try {
        /**
        *Se crea un primer bloque try-catch
        */
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            /**
            *En dos variables enteras a y b se obtienen la longitud de cadenas que se pasa al método main
            *y la división de 42 entre a respectivamente, en caso de que no se pasen cadenas al método
            *main, entonces el valor de a será cero, y al dividir cualquier número entre cero el resultado
            *será una indeterminación
            */
            try {
            /**
            *Este bloque try-catch está anidado con el primero
            */ 
                if(a==1) a = a/(a-a); 
                /**
                *Se verifica el valor de a, y si es igual a 1, entonces se hace una reasignación de 
                *valor a la variable a, dividiendola entre la resta del valor de a menos el valor de a
                *lo cual dará como resultado 0, generando así una indeterminación
                */
                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99;
                    /**
                    *Se verifica en un if si el valor de a es igual a 2, y si es así, se crea un arreglo
                    *de solo un valor, y después se genera un error, ya que se trata de modificar una posición
                    *inexistente en el arreglo como lo es la posición 42
                    *
                    */
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice de arreglo fuera de rango: " + e);
                /**
                *Esta será el bloque catch del primer bloque try, y en este se captura una excepción de la clase
                *ArrayIndexOutOfBoundsException y esta se dará cuando en el arreglo se intente modificar
                *una posición inexistente y al generarse este error, se imprime el mensaje subsecuente
                */
            }
        } catch(ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
            /**
            *En el bloque catch que pertenece al primer bloque try, se captura una excepción de la clase
            *ArithmeticException, la cual se dará si se genera una división entre 0, entonces si esta se 
            *genera se imprime a pantalla el mensaje
            */
        }
    }
}