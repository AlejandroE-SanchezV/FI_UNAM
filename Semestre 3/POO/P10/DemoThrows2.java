public class DemoThrows2 {
    static void metodoConThrow() throws IllegalAccessException{
    /**
    *Se crea el método estático de tipo void llamado metodoConThrow, el cual no recibe parámetros y
    *se agrega la palabra reservada throws, la cual indica que se lanzará una excepción de la clase
    *IllegalAccessException
    */
        throw new IllegalAccessException("Desde metodoConThrow");
        /**
        *Se crea una excepción de la clase IllegalAccessException y se pasa como parámetro el mensaje
        *"Desde metodoConThrow", y como antes de la creación de este objeto, aparece la palabra reservada
        *throw, esto signifca que se lanzará la excepción que creamos
        */
    }

    public static void main(String[] args) {
        try{
            metodoConThrow();
        /**
        *En el bloque try sel main se invoca al método metodoConThrow y n se le pasan parámetros, este 
        *método lanzará obligatoriamente una excepción de la clase IllegalAccessException, la cual debe
        *ser atrapada
        */
        }catch(IllegalAccessException i){
            System.out.println("Excepcion atrapada " + i);
            /**
            *Detro del bloque catch, se atrapa la excepción lanzada por el método metodoConThrow y esto
            *ya no generará errores en tiempo de compilación, ya que se atrapó en un bloque catch
            *y luego de ser capturada, se imprime a pantalla el objeto almacenado en la excepción
            */
        }
    }
}
    