public class Errores4 {
    public static void main(String[] args) {
        int edad = 30;
        int ahorroParaElRetiro = 10000;
        int aniosRetirado = 0;
        String nombre = "Juanito Perez";
        for (int i = edad; i <= 65; i++){
            ahorroParaElRetiro = recalcular(ahorroParaElRetiro,1);
        }
        try{
            int pensionMensual = ahorroParaElRetiro/aniosRetirado/12;
            System.out.println(nombre + " tendra $" + pensionMensual
            + " por mes para el retiro.");
        }catch(ArithmeticException ae){
            System.out.println("Division entre cero");
            ae.printStackTrace();
        }catch(Exception e){
            //ae.printStackTrace();
        }
        
    }
    public static int recalcular(int montoDelFondo, int tasa){
        return montoDelFondo*(1+tasa);
    }
}