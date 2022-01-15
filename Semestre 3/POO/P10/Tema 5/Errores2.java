public class Errores2 {
    /**
    *Errores en tiempo de ejecucion: el ejemplo realiza una division entre cero en la linea 14
    *de esta forma se delega el control de la excepcion al compilador. 
    */
    public static void main(String[] args) {
        int edad = 30;
        int ahorroParaElRetiro = 10000;
        int aniosRetirado = 0; //Variable causante de la excepcion
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            recalcular(ahorroParaElRetiro,0.1);
        }

        int pensionMensual = ahorroParaElRetiro/aniosRetirado/12;//Causa una excepcion aritmetica por la division entre cero
        System.out.println(nombre + " tendra $" + pensionMensual
        + " por mes para el retiro.");
    }
    public static void recalcular(double montoDelFondo, double tasa){
        montoDelFondo = montoDelFondo*(1+tasa); //No retorno de datos
    }
}