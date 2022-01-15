public class DemoThrow {
    static void demo(){
        /**
        *Se crea el método demo, el cual es de tipo void y no recibe parámetros
        */
        try{
            throw new NullPointerException("demo");
            /**
            *Se crea una instancia de la clase NullPointerException a la cual se le pasa como
            *parámetro la cadena demo y antes de la creación de la instancia se encuentra
            *la palabra reservada throw, esto lo que hará es lanzar la excepción que creamos
            */
        }catch(NullPointerException npe){
            System.out.println("Excepcion atrapada en el metodo demo()");
            throw npe;
            /**
            *Como en el bloque catch se lanza la excepción NullPointerException, esta se atrapa
            *en el bloque catch, que lo que hace es imprimir a pantalla el mensaje de que la excepción
            *se atrapo en el método demo y se vuelve a lanzar la excepción
            */
        }
    }
    public static void main(String[] args) {
      try{
        demo();
        /**
        *Se invoca al método demo, al cual no se le pasan parámetros, y este lanzará obligatoriamente
        *una excepción de la clase NullPointerException
        */
      }catch(NullPointerException npe){
        System.out.println("Excepcion atrapada de nuevo en main()");
        System.out.println("\t" + npe);
        System.out.println("Mensaje pasado como parametro a la excepción" + npe.getMessage());
        /**
        *La excepción que lanzó el método demo, se atrapa ahora en el bloque catch del método main
        *y dentro de este se imprime a pantalla que la excepción ahora fue atrapada en el main, luego
        *se imprime a pantalla el objeto almacenado en la excepción atrapada y después de imprime el
        *mensaje pasado como parámetro a la excepción demo, esto quiere decir que esta excepción
        *se creo en el método demo y se paso al método main
        */
      }
    }
}