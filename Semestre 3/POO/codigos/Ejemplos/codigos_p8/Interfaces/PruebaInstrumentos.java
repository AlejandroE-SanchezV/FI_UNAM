public class PruebaInstrumentos{
	public static void main(String[] args) {
		InstrumentoMusical im = new InstrumentoDeViento();

		System.out.println("Soy un " + im.tipoInstrumento());

		//im.presionarClave(); //presionarClave() no esta definido dentro de la interfaz

		InstrumentoDeViento iv = new InstrumentoDeViento();

		iv.presionarClave();
		iv.tocar();

		Flauta miFlauta = new Flauta();

		im = miFlauta;

		im.tocar();
		System.out.println("Soy un(a) " + im.tipoInstrumento());

		System.out.println("El mes " + Meses.DOS + "es: ");
		System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
	}
}