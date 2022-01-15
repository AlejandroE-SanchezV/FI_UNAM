 import java.util.Scanner;

 /**
 *Se crea la clase Mascota que contendra los metodos y los atributos de nuestra mascota, por medio de esta se llevara a cabo la definicion
 *de nuestro objeto mascota y se utilizara cada uno de los atributos con el fin de modificar los atributos.
 *Cada uno de estos atributos es privado ya que no es necesario que otra clase los utilice.
 *Los metodos son publicos poeque cualquier clase los puede ver, pero no utilizar ya se necesita una instancia.
 *Autores:
 * Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
 * Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
 * Pareja Avila Emiliano - No. Cuenta: 317081345
 * Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
 */

 public class MascotaDigital{
 	private String nombre;
 	private int energia;
 	private int diversion;
 	private int salud;
 	private int edad;
 	private int hambre;
 	private int sed;


 	/**Constructor de la clase MascotaDigital que inicializa los valores de los atributos, el cual recibe una cadena
 	para la inicializacion del nombre de la mascota*/

 	public MascotaDigital(String nombre){
 		this.nombre=nombre;
 		energia=100;
 		diversion=100;
 		salud=100;
 		edad=0;
 		hambre=0;
 		sed=0;
 	}

 	/**Metodo que imprime los atributos de la mascota, esto en caso de querer revisar el estado de nuestra mascota despues de realizar
 	una actividad*/
 	private void estadoDeMascota(){
 		System.out.println("Nombre de tu mascota:"+nombre);
 		System.out.println("Energia de tu mascota:"+energia);
 		System.out.println("Estado de diversion de tu mascota:"+diversion);
 		System.out.println("Salud de tu mascota:"+salud);
 		System.out.println("Edad de tu mascota:"+edad+" años");
 		System.out.println("Hambre de tu mascota:"+hambre);
 		System.out.println("Sed de tu mascota:"+sed);
 	}

 	/**Este metodo pone a jugar a nuestra mascota, recibe dos cadenas que indican el juguete y el lugar donde se va a jugar, ademas
 	este metodo incrementa los atributos hambre y sed y disminuye los valores de energia*/

 	public void ponerseAJugar(String juguete,String lugar){

 		System.out.println("Esta jugando con:"+juguete+" en:"+lugar);
 		energia=energia-10;
 		hambre=hambre+10;
 		sed=sed+10;

 		if (diversion==100){
 			System.out.println("Exceso de juego, peligro, la diversion esta al 100");
 			System.out.println("Disminuye la energia...");
 			System.out.println("Incrementa el hambre...");
 			System.out.println("Incrementa la sed...");
 		}
 		else if(diversion<91){
 			diversion=diversion+10;
 			System.out.println("Incrementando la diversion");
 			System.out.println("Disminuye la energia...");
 			System.out.println("Incrementa el hambre...");
 			System.out.println("Incrementa la sed...");
 		}

 		/**En caso de que el hambre este en un rango de [50,100], la mascota necesitara comer y tomar agua, por lo que se llamara al
 		metodo alimentarMascota*/

 		if(hambre>49 && sed>49){
 			System.out.println("Tu mascota tiene hambre, fue a buscar algo que comer");
 			System.out.println("Tu mascota tiene sed, va a tomar agua");
 			alimentarMascota();
 		}

 		/**En caso de que el nivel de energía sea muy bajo la mascota ya no podra jugar y tendra que ir a dormir para recuperar energia,
 		para esto es necesario el invocar el metodo irADormir*/

 		if(energia<31){
 			System.out.println("Su mascota ya no puede jugar mas :(");
 			System.out.println("Necesita descansar, no puede jugar");
 			irADormir();
 		}
 	}

 	/**Este metodo funciona para la actividad salir a pasear, recibe dos cadenas que indican el lugar al que se va a ir, el carnet en
 	caso de una emergencia, y bolsas virtuales para limpiar los desechos de la mascota*/

 	public void salirAPasear(String lugar,String carnet,int bolsas){
 		System.out.println("Tu mascota esta muy feliz de salir, ya necesitaba un paseo a:"+lugar);

 		energia=energia-30;
 		hambre=hambre+30;
 		salud=salud-20;
 		sed=sed+30;

 		if (diversion==100){
 			System.out.println("Exceso de juego, peligro, la diversion esta al 100");
 			System.out.println("Disminuye la energia...");
 			System.out.println("Incrementa el hambre...");
 			System.out.println("Incrementa la sed...");
 		}

 		if (diversion==100){
 			System.out.println("Exceso de juego, peligro, la diversion esta al 100");
 			System.out.println("Disminuye la energia...");
 			System.out.println("Incrementa el hambre...");
 			System.out.println("Incrementa la sed...");
 		}
 		else if(diversion<91){
 			diversion=diversion+10;
 			System.out.println("Incrementando la diversion");
 			System.out.println("Disminuye la energia...");
 			System.out.println("Incrementa el hambre...");
 			System.out.println("Incrementa la sed...");
 		}

 		/**Al igual que en el metodo anterior se reducen ya aumentan los atributos, por lo que si llegan a estar debajo de un nivel
 		sera necesario llenarlos de nuevo, como es el caso de que tenga que comer o tomar agua*/

 		if(hambre>49 && sed>49){
 			System.out.println("Tu mascota tiene hambre, necesita comer");
 			System.out.println("Tu mascota tiene sed, va a tomar agua");
 			alimentarMascota();
 		}


 		if(energia<31){
 			System.out.println("Su mascota ya no puede pasear mas :(");
 			System.out.println("Necesita descansar, no puede seguir caminando");
 			irADormir();
 		}

 		/**Esta condicion se agrega a modo de interaccion con el ambiente, ya que en caso de salir a pasear el perro pierde salud
 		por estar expuesto y por interactuar con otros perros, y si el nivel de slaud baja mucho se enferma y se manda a llamar al 
 		metodo llevarAlVeterinario, que recibe el carnet, y se coloca el int 1, porque es la primer opcion dentro de llevar al 
 		veterinario*/

 		if(salud<31){
 			System.out.println("Su mascota se encuentra con problemas de salud por el contacto con otros perros");
 			System.out.println("Es necesario llevarla al veterinario");
 			llevarAlVeterinario(carnet,1);
 		}

 		//Normalmente cuando los sacas a pasar se hacen del baño así que tienes que limpiar
 		System.out.println("Tu mascota hizo sus necesidades");
 		limpiarHeces(bolsas);

 	}

 	/**En este metodo se tiene el metodo de estado que aumenta los niveles de energia de nuestra mascota, en caso de que la energia este
 	entre [0,30], es necesario poner a dormir a la mascota y este metodo rellena el valor de la energia, en caso de que no este en esos
 	niveles de energia, la mascota no duerme*/
 	public void irADormir(){

 		System.out.println("Es hora de descansar");
 		int horasDormidas=0;

 		if(energia<31){
	 		for(int i=0;i<10;i++){
	 			if(energia==100){
	 				System.out.println("Ya esta llena de energia");
	 				break;
	 			}
	 			System.out.println("Recobrando energia...");
	 			energia=energia+10;
	 			horasDormidas+=1;
	 		}
	 	}else{
	 		System.out.println("Todavia no esta cansada tu mascota, no puede dormir");
	 	}
 		System.out.println("Tomo una siesta de:"+horasDormidas+" horas");

  	}

  	/**En este metodo se tiene el metodo de estado que disminuye los niveles de hambre y sed de nuestra mascota, en caso de que estos esten
 	entre [50,100], es necesario poner a comer y tomar agua a la mascota, en caso de que no este en esos niveles la mascota no come ni toma*/

 	public void alimentarMascota(){

		if(hambre>49){
 			for(int i=0;i<10;i++){
 				if(hambre==0){
 					System.out.println("Ya se lleno tu mascota");
 					break;
 				}
 				System.out.println("Tu mascota se esta alimentando...");
 				hambre=hambre-10;
 			}
 		}else{
 			System.out.println("Todavia no tiene hambre tu mascota");
 		}

 		/**Ambas partes del metodo tiene un limite igual a cero, y esto es que las necesidades de agua o hambre se han logrado disminuir
 		*/

 		if(sed>49){
 			for(int i=0;i<10;i++){
 				if(sed==0){
 					System.out.println("Ya tomo suficiente agua");
 					break;
 				}
 				System.out.println("Tu mascota se esta hidratando...");
 				sed=sed-10;
 			}
 		}else{
 			System.out.println("Todavia no tiene sed tu mascota");
 		}

 	}

 	/**El metodo pide el carnet y la parte a utilizar, este tiene dos partes porque la primera es en caso de que la mascota se sienta
 	mal o tenga un accidente, es decir que el nivel de salud este bajo y  la segunda es en caso de que se requiera un arreglo estetico
 	como el corte del pelaje de la mascota*/

 	public void llevarAlVeterinario(String carnet,int parte){

 		System.out.println("Buenas tardes, bienvenido al veterinario");
 		System.out.println("Muestre su carnet, por favor");
 		System.out.println("Revisaremos a su mascota con carnet:"+carnet+" y haremos lo posible para que se sienta mejor");

 		/**Esta primer parte solo regenera la salud, ya que simula la consulta y tiene un limite con respecto el nivel de salud que 
 		puede tener la mascota*/

 		if(parte==1){
 			if(salud<31){
 			System.out.println("Su mascota se encuentra enferma, le administraremos el medicamento necesario");
 			for(int i=0;i<10;i++){
 				if(salud==100){
	 				System.out.println("Ya esta recuperada su mascota, recuerde traerla a sus revisiones");
	 				break;
	 			}
	 			System.out.println("Recobrando salud...");
	 			salud=salud+10;
 			}
 			}else{
 				System.out.println("Tu mascota esta sana, no necesita de ningun medicamento");
 	 		}
 	 	}

 	 	/**Esta segunda se invoca en caso de que vayamos a cortar el cabello a la mascota, y modifica el valor de la salud, unicamente
 	 	si se encuentra bajo y no se ha llevado a consulta a la mascota*/

 	 	if(parte==2){
 	 		System.out.println("Por favor espere mientras atendemos a su mascota");
 	 		System.out.println("Cortando el pelaje...");
 	 		if(salud>39){
 	 			System.out.println("Tu mascota tiene una salud buena");
 	 		}else{
 	 			while(salud<31){
 	 				salud=salud+10;
 	 			}
 	 		}
 	 	}
 	}

 	/**Para este metodo se utilizan se modifican los atributos de hambre y energia, en caso de que el atributo de diversion, sea menor a 90
 	se aumenta hasta que llegue a 100, y si los atributos de hambre o energia disminuyan se mandan a llamar a los metodos que disminuiran o
 	aumentara los valores de cada atributo*/

 	public void darUnaDucha(){
 		System.out.println("Tu mascota esta sucia, es tiempo de que le des una limpiadita");
 		hambre=hambre+10;
 		energia=energia-20;

 		int suciedad=10;
 		for(int i=0;i<suciedad;i++){
 			suciedad=suciedad-1;
 			System.out.println("Limpiando al perro...");
 		}

 		while(diversion<91){
 			diversion=diversion+10;
 		}

 		if(hambre>49){
 			System.out.println("La ducha le dio hambre a tu perro");
 			alimentarMascota();
 		}

 		if(energia<31){
 			System.out.println("La limpieza le dio sueño");
 			irADormir();
 		}
 	}

 	/**Este metodo es sencillo ya que solo consiste en limpieza de heces de la mascota en caso de que se encuentren en el paseo
 	y por eso recibe el valor de a, que indica la cantidad de bolsas de plastico*/
 	public void limpiarHeces(int a){

 		System.out.println("Es necesario limpiar, se un amo responsable");
 		a=a-1;
 		System.out.println("Listo, ya recogiste las heces");
 		if(a==0){
 			System.out.println("Lleva mas bolsas para la proxima");
 		}

 	}

 	/**Este segundo metodo es sobrecargado, ya que tiene el mismo identificador pero no recibe metodos, ya que se utliza en caso de que
 	la mascota se haya hecho del baño dentro de la casa*/

	public void limpiarHeces(){

		System.out.println("Tu mascota hizo sus necesidades, es necesario que limpies");
		System.out.println("Solo tu puedes limpiarle porque se hizo en su cama");
		System.out.println("Gracias por limpiarle, ya olia muy feo");

 	}

 	/**Este ultimo metodo modifica el atributo de la edad, porque la mascota cumple años o se hace mas grande, por ello se hace una 
 	modificacion de ciertos atributos como la salud, la diversion que en el caso de la salud disminuye por ser mas grande la mascota
 	y si cumple una condicion la mascota muere de, aunque se puedan hacer operaciones todavia con el objeto*/

 	public void diaDelSanto(){

 		if(edad>7){
 			System.out.println("Todo llega a un final, y lamentablemente tu mascota no pudo sobrevivir :(");
 		}else{
 			System.out.println("Felicides, tu mascota ha sobrevivido 365 contigo, celebralo");
 			System.out.println("Invita a tus ciberamigos, sera algo sorprendente");
 			diversion=100;
 			salud=salud-10;
 			edad=edad+1;
 		}

 		if(salud<31){
 			System.out.println("Su mascota se encuentra con problemas de salud por su edad :(");
 			System.out.println("Es necesario llevarla al veterinario");
 		}

 	}

 	/**El metodo principal es donde se llama a cada uno de los metodos en base a un menu que el usuario tiene disponible para poder
 	interactuar con su mascota, de esta forma se pueden simular situaciones como que la mascota este enferma o se tenga que cortar el
 	pelaje, para poder tener una mayor interaccion y no sea algo sencillo sino que se vea como se relacionan los metodos y que pueden 
 	funcionar de manera independiente*/

 	public static void main(String [] args){

 		System.out.println("Hola, soy tu mascota virtual, espero cuides de mi muy bien");
 		Scanner entrada = new Scanner(System.in);
 		System.out.println("Inserta el nombre de tu mascota:");
 		String nombre = entrada.next();
 		MascotaDigital mascota = new MascotaDigital(nombre);
 		int opcion;
 		do{
 			System.out.println("\nSelecciona lo que quieras hacer con tu MascotaDigital:"+nombre);
 			System.out.println("Dale de comer cuando el nivel de hambre es de 50 \nTiene que descansar cuando el nivel sea menor a 30 \nLlevalo al veterinario cuando el nivel de salud sea menor a 30");
 			System.out.println("1)Estado de tu mascota\n2)Jugar \n3)Mandarla a Dormir \n4)Llevar  a Pasear \n5)Llevar al veterinario");
 			System.out.println("6)Alimenta a tu mascota \n7)limpiarHeces \n8)Dia de su santo \n9)Cortar pelaje \n10)Dar una ducha");
 			opcion = entrada.nextInt();

 			switch(opcion){
 				case 1:
	 			System.out.println("\nEl estado de tu mascota es");
	 			mascota.estadoDeMascota();
	 			break;

	 			case 2:
	 			System.out.println("\nVamos a jugar");
	 			System.out.println("Inserta el juguete con el que va a jugar:");
	 			String juguete = entrada.next();
	 			System.out.println("Inserta el lugar de la casa donde van a jugar:");
	 			String lugar = entrada.next();

	 			mascota.ponerseAJugar(juguete,lugar);
	 			break;

	 			case 3:

	 			mascota.irADormir();
	 			break;

	 			case 4:
	 			System.out.println("\nA donde vas a llevar a tu mascota a pasear");
	 			String lugar1 = entrada.next();
	 			System.out.println("Anota su carnet en caso de emergencias");
	 			String carnet = entrada.next();
	 			System.out.println("Cuantas bolsas vas a llevar en caso de que haga sus necesidades");
	 			int bolsas = entrada.nextInt();

	 			mascota.salirAPasear(lugar1,carnet,bolsas);
	 			break;

	 			case 5:
	 			System.out.println("Anota su carnet, sera necesario para poder tomar consulta");
	 			String carnet1 = entrada.next();

	 			mascota.llevarAlVeterinario(carnet1,1);
	 			break;

	 			case 6:

	 			mascota.alimentarMascota();
	 			break;

	 			case 7:

	 			mascota.limpiarHeces();
	 			break;

	 			case 8:
	 			System.out.println("Es el santo de tu mascota, ¡celebralo!");

	 			mascota.diaDelSanto();
	 			break;

	 			case 9:
	 			System.out.println("Vamos a cortarle el pelaje a su mascota, pero hay que llevarlo con un profesional");
	 			System.out.println("Anota su carnet, sera necesario para poder cortar el pelaje");
	 			String carnet2 = entrada.next();

	 			mascota.llevarAlVeterinario(carnet2,2);
	 			break;

	 			case 10:
	 			mascota.darUnaDucha();
	 			break;

	 			default:
	 			opcion=11;
	 			break;
 			}
 		}
 		while(opcion!=11);
 	}
 }