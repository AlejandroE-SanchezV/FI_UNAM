/**
 * Clase que modela a los números complejos
 * Autores:
 * Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
 * Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
 * Pareja Avila Emiliano - No. Cuenta: 317081345
 * Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
 */
import java.util.Scanner;

class Complejo{

	double real;
	double imaginaria;
	public Complejo(double a, double b){
		real = a;
		imaginaria = b;
	}
	/**
	 *Se realiza la multiplicación de los números complejos 
	 para esto primero se verifica si es multiplicación de numeros conjugados
	 para lo cual se realiza la multiplicación en forma conjugada
	 en caso contrario se realiza la multiplicación en forma binomica,
	 en ambos casos se retorna un número complejo igual al resultado.
	 */
	public Complejo Multiplicacion(Complejo a, Complejo b){
		if(((a.real==b.real)&&(a.imaginaria==-1*b.imaginaria))||((a.real==-b.real)&&(a.imaginaria==-1*b.imaginaria))){
			Complejo aux;
			double resultR=0,resultI=0;
			resultR = Math.pow(a.real,2) + Math.pow(b.imaginaria,2);
			aux = new Complejo(resultR,resultI);
			return aux;
		}
		else{
			Complejo aux;
			double resultR=0,resultI=0;
			resultR = (a.real*b.real)+((-1)*(a.imaginaria*b.imaginaria));
			resultI = (a.imaginaria*b.real)+(a.real*b.imaginaria);
			aux = new Complejo(resultR,resultI);
			return aux;
		}
	}
	/**
	 * Se realiza la división de números complejos
	 * primero se verifica si los números son iguales, cuya division es 1
	 * en caso contrario se realiza división multiplicando por el conjugado del segundo número ingresado,
	 * en ambos casos se retorna un número complejo igual al resultado.
	 */
	public Complejo Division(Complejo a, Complejo b){
		if(a.real==b.real && a.imaginaria==b.imaginaria){
			Complejo aux = new Complejo(1,0);
			return aux;
		}
		else{
			Complejo aux, aux2, aux3, c;
			aux = new Complejo(0,0);
			aux2 = new Complejo(0,0);
			c = new Complejo(b.real,b.imaginaria*-1);
			aux = aux.Multiplicacion(a,c);
			aux2 = aux2.Multiplicacion(b,c);
			double j = aux.real/aux2.real;
			double k = aux.imaginaria/aux2.real;
			aux3 = new Complejo(j,k);
			return aux3;
		}
	}
	/**
	 * Se encarga de realizar la suma de dos números complejos,
	 * sumando por un lado las partes reales
	 * y por otro las partes imaginarias, 
	 * para retornar otro número complejo que es el resultado
	 */
	public Complejo Suma(Complejo a, Complejo b){
		Complejo aux;
		double result1 = a.real + b.real;
		double result2 = a.imaginaria + b.imaginaria;
		aux = new Complejo(result1,result2);
		return aux;
	}
	/**
	 * Se encarga de realizar la resta de dos números complejos
	 * restando por un lado las partes reales
	 * y por otro las partes imaginarias,
	 * para retornar otro número complejo que es el resultado
	 */
	public Complejo Resta(Complejo a, Complejo b){
		Complejo aux;
		double result1 = a.real - b.real;
		double result2 = a.imaginaria - b.imaginaria;
		aux =new Complejo((result1),(result2));
		return aux;
	}
	/**
	 * Se encarga de representar en forma polar a un número complejo
	 * calculando primero el módulo del numero complejo
	 * y posteriormente su ángulo o argumento positivo. 
	 */
	public void FormaPolar(Complejo a){
		double aux, aux2;
		aux = Math.pow(a.real,2);
		aux += Math.pow(a.imaginaria,2);
		aux = Math.sqrt(aux);
		aux2 = Math.atan((a.imaginaria/a.real));
		aux2 = Math.toDegrees(aux2);
		if(aux2<0) aux2+=360;
		System.out.println("La forma polar del numero ingresado es " + aux +" * Cis ( "+aux2+" )");
	}
	/**
	 * Se encarga de imprimir un número complejo dependiendo del signo de sus valores.
	 */
	public void ImprimirComplejo(Complejo a){
		if (a.imaginaria>=0)
		System.out.println("El resultado es: "+a.real+" + "+a.imaginaria+"i");
		else
		System.out.println("El resultado es: "+a.real+" - "+Math.abs(a.imaginaria)+"i");	
	}
	/**
	 * Método main el cual recibe cuatro argumentos por linea de comandos, que son el valor real y el valor imaginario del primer número complejo (en ese orden), 
	 * seguidos del valor real y el valor imaginario del segundo número complejo (en ese orden), posteriormente se despliega un menu pra seleccionar entre la 
	 * suma, resta, multiplicacion, division y representacion polar de los números complejos ingresados.
	 */
	public static void main(String [] args){
		Complejo C1,C2;
		Scanner sc = new Scanner(System.in);
		Double a=new Double(args[0]);
		Double b=new Double(args[1]);
		C1=new Complejo(a,b);
		a=new Double(args[2]);
		b=new Double(args[3]);
		C2=new Complejo(a,b);
		Complejo aux = new Complejo(0,0);
		System.out.print("El Primer numero complejo ingresado es: ");
		if (C1.imaginaria>=0) System.out.println(C1.real+" + "+C1.imaginaria+"i");
		else System.out.println(C1.real+" - "+Math.abs(C1.imaginaria)+"i");
		System.out.print("El Segundo numero complejo ingresado es: ");
		if (C2.imaginaria>=0) System.out.println(C2.real+" + "+C2.imaginaria+"i");
		else System.out.println(C2.real+" - "+Math.abs(C2.imaginaria)+"i");
		int i=0;
		while(i==0){
			System.out.println("\nOpciones");
			System.out.println("1) Multiplicar los dos numeros complejos");
			System.out.println("2) Dividir el primer numero entre el segundo ingresado");
			System.out.println("3) Sumar los dos numero complejos");
			System.out.println("4) Restar los dos numeros complejos");
			System.out.println("5) Ver la forma polar de un numero complejo");
			System.out.println("6) Salir");
			int op = sc.nextInt();
			switch(op){
				case 1:
					aux = C1.Multiplicacion(C1,C2);
					C1.ImprimirComplejo(aux);
					break;
				case 2:
					aux = C1.Division(C1,C2);
					C1.ImprimirComplejo(aux);
					break;
				case 3:
					aux = C1.Suma(C1,C2);
					C1.ImprimirComplejo(aux);
					break;
				case 4:
					aux = C1.Resta(C1,C2);
					C1.ImprimirComplejo(aux);
					break;
				case 5:
					System.out.println("Que numero complejo desea utilizar 1 o 2");
					int op2 = sc.nextInt();
					if(op2==1)
						C1.FormaPolar(C1);
					else
						C2.FormaPolar(C2);
					break;
				case 6:
					i=1;
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
		}

	}
}