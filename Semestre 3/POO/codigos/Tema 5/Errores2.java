public class Errores2 {
    public static void main(String[] args) {
        int edad = 30;
        int ahorroParaElRetiro = 10000;
        int aniosRetirado = 0;
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            recalcular(ahorroParaElRetiro,0.1);
        }

        int pensionMensual = ahorroParaElRetiro/aniosRetirado/12;
        System.out.println(nombre + " tendra $" + pensionMensual
        + " por mes para el retiro.");
    }
    public static void recalcular(double montoDelFondo, double tasa){
        montoDelFondo = montoDelFondo*(1+tasa);
    }
}