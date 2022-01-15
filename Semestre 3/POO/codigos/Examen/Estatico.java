public class Estatico{
	static int numObj;


	public static void main(String [] args){
		Estatico e1 = new Estatico();
		numObj=0;
		Estatico.numObj=3;
		e1.numObj=20;
		System.out.println("Valor obj:"+Estatico.numObj);
		
		int a=5;
		int b=10;
		int c=0;

		c=a|b;
		c=c<<3;
		System.out.println("Valor de c:"+c);

		float x=3f;
		float y=2.6f;
		for(int i=0;i<=3;i++){
			float z=0;
			z-=(x*1)+(y/i);
		}
		
		//System.out.println("Valor:"+z);
		
		boolean opcion=true;
		uno:{
			dos:{
				tres:{
					System.out.println("Inicio del bloque tres");
					if(opcion) break dos;
					System.out.println("Despues de break");
				}
				System.out.println("Despues del bloque tres");
			}
			System.out.println("Dentro del bloque uno");
			return;
		}
	}	
}
