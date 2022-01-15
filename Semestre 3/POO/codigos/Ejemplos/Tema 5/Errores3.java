public class Errores3 {
    public static void main(String[] args) {
        int edad = 30;
        double ahorroParaElRetiro = 10000;
        int aniosRetirado = 20;
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            ahorroParaElRetiro = recalcular(ahorroParaElRetiro,0.1);
            //recalcular(ahorroParaElRetiro,0.1);
        }

        double pensionMensual = ahorroParaElRetiro/aniosRetirado/12;
        System.out.println(nombre + " tendra $" + pensionMensual
        + " por mes para el retiro.");
    }
    public static double recalcular(double montoDelFondo, double tasa){
        return montoDelFondo*(1+tasa);
    }

    /*public static double recalcular(double montoDelFondo, double tasa){
        return montoDelFondo*(1+tasa);
    }*/
}