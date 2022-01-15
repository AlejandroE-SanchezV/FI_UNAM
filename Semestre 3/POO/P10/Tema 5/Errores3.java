public class Errores3 {

    /**
    *Errores logicos: en la clase se lleva a cabo el calculo de la pension mensual, en el ejemplo anterior existia la excepcion arimetica por la division entre cero,
    *en esta version se soluciona cambiando el valor de la varible aniosRetirado, y tambien se soluciona la logica del programa, debido a que la funcion recalcular no 
    *devolvia valores y  no se hacia ninguna operacion.
    */
    public static void main(String[] args) {
        int edad = 30;
        double ahorroParaElRetiro = 10000;
        int aniosRetirado = 20; //Modificacion del valor de la excepcion
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            ahorroParaElRetiro = recalcular(ahorroParaElRetiro,0.1); //Asignacion del valor regresado por el metodo
            //recalcular(ahorroParaElRetiro,0.1);
        }

        double pensionMensual = ahorroParaElRetiro/aniosRetirado/12;
        System.out.println(nombre + " tendra $" + pensionMensual
        + " por mes para el retiro.");
    }
    public static double recalcular(double montoDelFondo, double tasa){
        return montoDelFondo*(1+tasa); //Retorno del valor calculado
    }
}