public class InstrumentoDeViento implements InstrumentoMusical, Meses{
	public void tocar(){
		System.out.println("Tocando instrumento de viento");
	}

	public void afinar(){
		System.out.println("Afinando instrumento de viento");
	}

	public String tipoInstrumento(){
		return "Instrumento de viento";
	}

	public void presionarClave(){
		System.out.println("Tocando una nota especifica");
	}
}