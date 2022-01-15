class MiExcepcion extends Exception {
    /**
    *La clase MiExcepcion hereda de la clase Excepcion
    */
    
    private String detalle;
    /**
    *Se declara uno de sus atributos que es de tipo string y recibe como nombre detalle
    */

    MiExcepcion(String msg) {
        super(msg);
        //detalle = msg;
        /**
        *Se sobrecarga el método constructor de la clase MiExcepcion y se le pasa como
        *parámetro una cadena llamada msg, y dentro de este método se invoca ahora al 
        *constructor pero de la clase Excepción al cual se le pasa como parámetro la cadena
        *que obtuvimos anteriormente
        */
    }

    MiExcepcion(int a) {
        //this(String.valueOf(a));
        detalle = String.valueOf(a);
        /**
        *Se hace otra sobrecarga del método constructor, el cual recibe como parámetro un número entero llamado a
        *y al atributo detalle se le iguala al valor del entero a, pero para ello primero se cambia gracias 
        *al método valueOf
        *
        */
    }

    public String toString() {
        return "MiExcepcion[" + detalle + "]";
        /**
        *Se hace una sobrecarga del método toString, y dentro de este se devuelve la cadena 
        *"MiExcepcion junto con el contenido de la variable detalle
        */
    }
}
    
class DemoExcepcion {
    static void metodo(int a) throws MiExcepcion {
        /**
        *Se define un método ahora de la clase DemoExcepcion lalamdo metodo, que es estático y de tipo 
        *void, el cual recibe como parámetro un entero llamado a, y este método arrojará una excepción
        *de la clase MiExcepcion que creamos y definimos anteriormente
        */
        System.out.println("Ejecutando metodo(" + a + ")");
        /**
        *Se imprime a pantalla el valor de la variable a que se pasó como parámetro para conocer
        *como actuará este método
        */
        if(a > 10)
            //throw new MiExcepcion(String.valueOf(a));
            throw new MiExcepcion(a);
            /**
            *En una estructura de control de flujo if se verifica si el valor de a es mayor a 10, y en
            *caso afirmativo, se lanza una excepción de la clase MiExcepcion a la cual se le pasa como
            *parámetro el entero a
            */
        System.out.println("Salida normal");
        /**
        *Se imprime a pantalla un mensaje que indica que el método metodo acabó
        */
    }
    public static void main(String args[]) {
        try {
            metodo(1);
            metodo(20);
        /**
        *Dentro del bloque try del método main, se invocan dos veces el método metodo, el primero
        *recibirá como parámetro el número uno, y el segundo el número 20, esto querrá decir
        *que el método que recibe como parámetro el número 20, lanzará una excepción de la clase
        *MiExcepcion la cual deberá ser atrapada en el bloque catch
        */
        } catch (MiExcepcion e) {
            System.out.println("MiExcepcion atrapada " + e);
            /**
            *Dentro del bloque catch se atrapa la excepcion MiExcepcion y se imprime a pantalla
            *el objeto contenido dentro de ella, lo cual invocará al método toString contenido
            *en la clase MiExcepcion
            */
        }
    }
}