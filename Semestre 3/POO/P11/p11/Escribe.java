import java.io.File;
import java.io.IOException;

class Escribe{
	public static void main(String[] args) {
		try{
			File archivo = new File("archivo.txt");
			System.out.println("Existe el archivo?" + archivo.exists());
			boolean creado = archivo.createNewFile();
			System.out.println("Se ha creado el archivo?: " + creado);
			System.out.println("Existe el archivo?" + archivo.exists());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}