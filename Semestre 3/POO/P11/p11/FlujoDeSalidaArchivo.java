import java.io.FileOutputStream;
import java.io.IOException;

public class FlujoDeSalidaArchivo{
	public static void main(String[] args) {
		FileOutputStream fos = null;
		byte[] buffer = new byte[81];
		int nBytes = 0;
		try{
			System.out.println("Escribir el texto a guardar en el archivo:");
			nBytes = System.in.read(buffer);
			System.out.println("Numero de bytes obtenidos: " + nBytes);
			fos = new FileOutputStream("archivo.txt");
			fos.write(buffer, 0, nBytes);
		}catch(IOException ioe){
			System.out.println("Error: " + ioe.toString());

		}finally{
			try{
				if(fos != null) fos.close();
			}catch(IOException ioe){
				System.out.println("Error al cerrar el archivo");
			}
		}
	}
}