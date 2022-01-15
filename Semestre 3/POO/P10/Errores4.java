public class Errores4 {
    /**
    *Manejo de excepciones: en este ejemplo se utiliza el bloque try - catch por el cual se puede contener a la excepcion.
    *El try se utiliza para definir un bloque del codigo donde se pueda contener una excepcion, para este caso se utiliza en la division entre aniosretirado,
    *y el catch se encarga de definir un bloque de codigo que maneja este excepcion.
    */
    public static void main(String[] args) {
        int edad = 30;
        int ahorroParaElRetiro = 10000;
        int aniosRetirado = 0;
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            ahorroParaElRetiro = recalcular(ahorroParaElRetiro,1);
        }
        try{ //Se comienza a manejar el bloque de codigo donde se puede presentar una excepcion
            int pensionMensual = ahorroParaElRetiro/aniosRetirado/12;
            System.out.println(nombre + " tendra $" + pensionMensual
            + " por mes para el retiro.");
        }catch(ArithmeticException ae){ //Se define la instancia de la excepcion que permite manejar la excepcion.
            System.out.println("Division entre cero");
            ae.printStackTrace(); //Muestra todo el registro donde se presento la excepcion
        }catch(Exception e){
            //ae.printStackTrace();
        }
        
    }
    public static int recalcular(int montoDelFondo, int tasa){
        return montoDelFondo*(1+tasa);
    }
}