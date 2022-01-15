import java.util.Properties;
import java.util.Enumeration;
/**
 * Clase que que obtiene las características del sistema, utiliza la clase Properties 
 * ya que esta contiene las propiedades del sistema de Java, en cualquier sistema.
 * Se utilizan los metodos de la clase Enumeration para poder recorrer la HashTable,
 * ya que Properties tiene esa forma de coleccion
 * 
 * Autores:
 * Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
 * Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
 * Pareja Avila Emiliano - No. Cuenta: 317081345
 * Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
 */

class Propiedades{
	public static void main(String [] args){
		String nombre;
		String propiedad;

		Properties propiedades = System.getProperties(); /**metodo que retorna tabla de propiedades, ya que la clase desciende de HashTable*/
		Enumeration nombres = propiedades.propertyNames(); /**Obtengo los nombres/claves de cada elementos de la tabla para conocer el valor asociado*/
		
		while(nombres.hasMoreElements()){  /**Cuenta las claves y cuando no haya mas termina el while*/
			nombre=(String)nombres.nextElement(); /**Va iterando de clave en clave y despues la manda a getProperty para obtener el valor*/
			propiedad=propiedades.getProperty(nombre);
			System.out.println("Nombre de la Propiedad:"+nombre+"\nSignificado:"+propiedad);
			System.out.println("\n");
		} 
	}
}