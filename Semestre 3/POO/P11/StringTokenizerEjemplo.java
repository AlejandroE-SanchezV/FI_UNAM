import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerEjemplo{
	public static void main(String[] args) {
		String texto="";
		try{
			BufferedReader br;
			br= new BufferedReader(new InputStreamReader(System.in)); //Se crea un buffer estandar para la entrada del Input
			System.out.println("Escribir texto");
			texto = br.readLine(); //Se lee el teclado

			System.out.println("\n\n El texto separado por espacios es:");
			StringTokenizer st = new StringTokenizer(texto); //Se crean los tokens del texto que se haya introducido
			while(st.hasMoreTokens()){ //Se verifica la existencia de elementos dentro del objeto token
				System.out.println(st.nextToken()); //Se imprimen los tokens
			}
		}catch(Exception e){
			System.out.println("\n\n Error al leer de teclado:");
			e.printStackTrace();
		}
	}
}