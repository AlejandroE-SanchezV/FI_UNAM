public class ClaseSingleton{
	/**
	*Se crea la clase ClaseSingleton que nos ayudará a idear
	*un patrón de diseño singleton, el cual solo permite
	*que a lo largo del programa exista una sola instancia de dicha clase
	*/
	private static ClaseSingleton cs;
	/**
	*Se instancia un atributo de la misma clase ClaseSingleton
	*y se hacem privado para que no pueda ser accesado por cualquier otra clase
	*/
	private String info;
	/**
	*Se instancia el atributo info de la clase ClaseSingleton que también
	*es privado, y es de tipo String
	*/
	
	private ClaseSingleton(String nombre){
		info = "Hola " + nombre;
		/**
		*El método constructor de la clase ClaseSingleton se hace privado, así
		*podemos asegurar que no se puedan crear instancias de dicha clase
		*desde otra clase, en su método constructor se inicializa el atributo info
		*haciendo una concatenación de cadenas entre la palabra "Hola" y la cadena que se le pasa 
		*como parámetro al método que es el nombre de la persona
		*/
	}

	public static ClaseSingleton getInstance(String nombre){
		/**
		*Se sobrecarga el método getInstance y este recibirá como parámetro
		*una string
		*/
		if(cs == null) 
			cs = new ClaseSingleton(nombre);
		/**
		*Se verifica en una estructura de cntrol de flujo if, si el atributo cs
		*que es un objeto de la clase ClaseSingleton no existe, en caso de que no exista, entonces
		*se crea el objeto cs, llamando a su método constructor que recibirá como parámetro
		*la string nombre
		*/
		return cs;
		/**
		*En caso de que el objeto cs no sea nulo y que si exista, solo no se ejecuta la sentencia del if
		*y se regresa al objeto cs, asegurando así que solo existan una instancia de esta clase
		*/
	}

	public String getInfo(){
		return info;
		/**
		*el método getInfo, regresa el atributo info que será la palabra Hola seguido de un nombre
		*/
	}
}