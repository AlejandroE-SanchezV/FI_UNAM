
public class DemoThrows {
    static void metodoConThrow(){
    /**
    *Se crea el método estático de tipo void llamado metodoConThrow, el cual no recibe parámetros
    */
        throw new IllegalAccessException("Desde metodoConThrow");
        /**
        *Se crea una excepción de la clase IllegalAccessException y se pasa como parámetro el mensaje
        *"Desde metodoConThrow", y como antes de la creación de este objeto, aparece la palabra reservada
        *throw, esto signifca que se lanzará la excepción que creamos
        */
    }

    public static void main(String[] args) {
        metodoConThrow();
        /**
        *Dentro del main, solo invocamos al método metodoConThrow, el cual obligatoriamente
        *lanzará una excepción de la clase IllegalAccessException, sin embargo como esta no es
        *capturada ni en el método metodoConThrow ni en el main, entonces esto generará un error ya que
        *todas las excepciones lanzadas en un código deben ser atrapadas por un bloque catch.
        */
    }
}