import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjScanner{
	public static void main(String[] args) {
		File archivo = new File("archivo.txt");
		Scanner lector;

		try{
			lector = new Scanner(archivo);
			//lector.useDelimiter("/");

			while(lector.hasNext()){
				System.out.println(lector.next());
			}
			lector.close();
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
	}
}