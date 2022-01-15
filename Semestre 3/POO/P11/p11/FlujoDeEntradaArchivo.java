import java.io.FileInputStream;
import java.io.IOException;

public class FlujoDeEntradaArchivo{
	public static void main(String[] args) {
		FileInputStream fis = null;
		byte[] buffer = new byte[81];
		int nBytes;
		try{
			fis = new FileInputStream("archivo.txt");
			nBytes = fis.read(buffer, 0, 81);
			String texto = new String(buffer, 0, nBytes);
			System.out.println(texto);
		}catch(IOException ioe){
			System.out.println("Error: " + ioe.toString());

		}finally{
			try{
				if(fis != null) fis.close();
			}catch(IOException ioe){
				System.out.println("Error al cerrar el archivo");
			}
		}
	}
}