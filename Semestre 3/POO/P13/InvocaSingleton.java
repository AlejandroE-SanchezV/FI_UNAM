public class InvocaSingleton{
	public static void main(String[] args) {
		ClaseSingleton cs1 = ClaseSingleton.getInstance("Liz");
		/**
		*Se crea un objeto de la clase ClaseSingleton, sin embargo no se invoca a su método
		*constructor debido a que este es privado y solo puede ser accesado
		*y ejecutado desde la misma clase de la instancia. Y como parámetro se pasa una 
		*cadena que corresponderá a un nombre
		*/

		System.out.println(cs1.getInfo());
		/**
		*Se invoca al método getInfo del objeto cs1, y este imprimirá el nombre
		*que se asignó como parámetro en la primera instancia
		*/

		ClaseSingleton cs2 = ClaseSingleton.getInstance("Lupita");
		/**
		*Se crea otro objeto de la clase ClaseSingleton, y se invoca su método getInstance al
		*cual se le pasa como parámetro otra cadena, sin embargo este objeto ya no se creará
		*debido a que solo puede existir una instancia de esta clase, y todos los demás objetos de la clase
		*ClaseSingleton que se creen, en realidad serán el primer objeto de esta clase que se creó
		*/

		System.out.println(cs2.getInfo());
		/**
		*Se invoca al método getInfo del objeto cs2, sin embargo se ejecutará el método getInfo del primer
		*objeto de la clase ClaseSingleton que se creo, entonces podría decirse que esta invocación del 
		*método será a partir del objeto cs1
		*/

		ClaseSingleton cs3 = ClaseSingleton.getInstance("Parrales");
		/**
		*Se vuelve a crear otro objeto de la clase ClaseSingleton, y otra vez se invoca al método getInstance
		*pero como ya se mencionó este objeto cs3 en realidad será el objeto cs1 ya que es el valor de retorno
		*del método getInstance en caso de que ya se haya creado una instancia de esta clase.
		*/

		System.out.println(cs3.getInfo());
		/**
		*Nuevamente se invoca al método getInfo, pero esta invocación será en realidad del 
		*objeto cs1, que imprimirá a pantalla su atributo info que es la primera cadena
		*que se pasó como parámetro que en este caso es "Liz"
		*/
	}
}