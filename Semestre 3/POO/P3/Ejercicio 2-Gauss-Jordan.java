/**
 * Clase que implementa el método de Gauss-Jordan
 * para la resolución de sistemas de ecuaciones con máximo 3 incognitas
 * Autores:
 * Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
 * Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
 * Pareja Avila Emiliano - No. Cuenta: 317081345
 * Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
 */
import java.util.Scanner;
class Gauss1{
    /**
     * Método para la resolución de un sistema de ecuaciones de 1 variable por medio del método de Gauss Jordan
     * recibiendo y leyendo inicialmente los coeficientes del sistema de ecuaciones para posteriormente formar la matriz Gaussiana
     * seguida de la matriz diagonalizada, comprobando si el sistema tiene solución para imprimirla en pantalla
     * dicha solución esta contenida en el segundo elemento del primer renglón de la matriz diagonal.
     */
    void Gauss1var(){
        float dv;
        Scanner sc= new Scanner(System.in); 
        float[][] mg = new float[1][2];
        System.out.println("Este programa calculará por medio del método de Gauss Jordan la resolución de un sistema de ecuaciones de 1 variable\nTal que la ecuación es de la siguiente forma: a1x = a2");
        for(int i=1; i<=1; i++){
            for(int j=1;j<=2; j++){
                System.out.println("Coeficiente  a" + j + "  de la ecuación " + i +" ");
                mg[i-1][j-1]=sc.nextFloat();
            }
        }
        System.out.println("Matriz Gaussiana: ");
        for(int i=0; i<1;i++){
            for(int j=0; j<2; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        if(mg[0][0]!=1){
            dv=1/mg[0][0];
            for(int i=0; i<2; i++){
                mg[0][i]=mg[0][i]*dv;
            }
        }
        System.out.println("Matriz Diagonalizada: ");
        for(int i=0; i<1;i++){
            for(int j=0; j<2; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        if(mg[0][0]!=1)
            System.out.println("No hay solución al sistema");
        else
            System.out.println("Solución del sistema: \n x=  "+ mg[0][1]);
    }
}
/**
 * Método que por medio del método de Gauss Jordan, calcula la resolución de un sistema de ecuaciones de 2 variables
 * recibiendo y leyendo inicialmente los coeficientes del sistema de ecuaciones para posteriormente formar la matriz Gaussiana
 * seguida de la matriz diagonalizada, comprobando si el sistema tiene solución para imprimirla en pantalla,
 * donde la primer incógnita del sistema de ecuaciones tomará el valor del tercer elemento del primer renglón de la matriz 
 * y la segunda incógnita tomará el valor del tercer elemento del segundo renglón, imprimiendo en pantalla sus valores.
 */
class Gauss2{
    void Gauss2var(){
        float dv, divm;
        Scanner sc= new Scanner(System.in); 
        float[][] mg = new float[2][3];
        System.out.println("Este programa calculará por medio del método de Gauss Jordan la resolución de un sistema de ecuaciones de 2 variables\nTal que la ecuación es de la siguiente forma: a1x +a2y = a3"); 
        for(int i=1; i<=2; i++){
            for(int j=1;j<=3; j++){
                System.out.println("Coeficiente  a" + j + "  de la ecuación " + i +" ");
                mg[i-1][j-1]=sc.nextFloat();
            }
        }
        System.out.println("Matriz Gaussiana: ");
        for(int i=0; i<2;i++){
            for(int j=0; j<3; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        if(mg[0][0]!=1){
            dv=1/mg[0][0];
            for(int i=0; i<3; i++){
                mg[0][i]=mg[0][i]*dv;
            }
        }
        divm=(mg[1][0]/mg[0][0])*(-1);
        for(int i=0; i<3; i++){
            mg[1][i]=(mg[0][i]*divm)+mg[1][i];
        }
        if(mg[1][1]!=1){
            dv=1/mg[1][1];
            for(int i=0; i<3; i++){
                mg[1][i]=mg[1][i]*dv;
            }
        }
        divm=(mg[0][1]/mg[1][1])*(-1);
        for(int i=0; i<3; i++){
            mg[0][i]=(mg[1][i]*divm)+mg[0][i];
        }
        System.out.println("Matriz Diagonalizada: ");
        for(int i=0; i<2;i++){
            for(int j=0; j<3; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        if(mg[0][0]!=1 && mg[1][1]!=1)
            System.out.println("No hay solución al sistema de ecuaciones");
        else
            System.out.println("Solución del sistema de ecuaciones: \n x= " + mg[0][2]+ "\n y= " + mg[1][2]);
    }
}
/**
 * Método para la resolución de un sistema de ecuaciones de 3 variables por medio del método de Gauss Jordan
 * recibiendo y leyendo inicialmente los coeficientes del sistema de ecuaciones gracias a dos ciclos anidados
 * para posteriormente formar la matriz Gaussiana seguida de la matriz diagonalizada, comprobando si el sistema 
 * tiene solucion para poder imprimirla, en donde el cuarto elemento del primer renglón es el valor de la primera incógnita,
 * el cuarto elemento del segundo renglón es el valor de la segunda incógnita y el cuarto valor del tercer renglón 
 * es el valor de la tercera incógnita del sistema de ecuaciones.
 */
class Gauss3{
     void Gauss3var(){
        float dv, divm;
        Scanner sc= new Scanner(System.in); 
        float[][] mg = new float[3][4];
        System.out.println("Este programa calculará por medio del método de Gauss Jordan la resolución de un sistema de ecuaciones de tres variables\nTal que la ecuación es de la siguiente forma: a1x +a2y +a3z = a4");
        for(int i=1; i<=3; i++){
            for(int j=1;j<=4; j++){
                System.out.println("Coeficiente  a" + j + "  de la ecuación " + i +" ");
                mg[i-1][j-1]=sc.nextFloat();
            }
        }
        System.out.println("Matriz Gaussiana: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        
        if(mg[0][0]!=1){
            dv=1/mg[0][0];
            for(int i=0; i<4; i++){
                mg[0][i]=mg[0][i]*dv;
            }
        }
        for(int i =1; i<3; i++){
            divm=(mg[i][0]/mg[0][0])*(-1);
            for(int j=0; j<4; j++){
                mg[i][j]=((mg[0][j])*divm)+mg[i][j];
            }
        }
        if(mg[1][1]!=0){
           dv=1/mg[1][1];
           for(int i =0; i<4; i++){
               mg[1][i]=mg[1][i]*dv;
           }
        }
        divm=(mg[0][1]/mg[1][1])*(-1);
        for(int i=0; i<4; i++){
            mg[0][i]=(mg[1][i]*divm)+mg[0][i];
        }
        divm=(mg[2][1]/mg[1][1])*(-1);
        for(int i=0; i<4; i++){
            mg[2][i]=(mg[1][i]*divm)+mg[2][i];
        }
        if(mg[2][2]!=0){
           dv=1/mg[2][2];
           for(int i =0; i<4; i++){
               mg[2][i]=mg[2][i]*dv;
           }
        }
        for(int i =1; i>=0; i--){
            divm=(mg[i][2]/mg[2][2])*(-1);
            for(int j=0; j<4; j++){
                mg[i][j]=((mg[2][j])*divm)+mg[i][j];
            }
        }
        System.out.println("Matriz Diagonalizada: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
              System.out.print(mg[i][j] + " ");}
            System.out.print("\n");
        }
        
        if(mg[0][0]!=1 && mg[1][1]!=1 && mg[2][2]!=1)
            System.out.println("No hay solución al sistema de ecuaciones");
        else
            System.out.println("Solución del sistema de ecuaciones: \n x= " + mg[0][3]+ "\n y= " + mg[1][3] + "\n z=  " + mg[2][3]);
}}
/**
 * Clase que contine y ejecuta al metodo main, el cual despliega un menu para calcular 
 * la solucion de sistemas de ecuaciones con máximo 3 incognitas, 
 * dependiendo de la opcion seleccionada y el número de variables, con opción 1 para 
 * la resolución de 1 variable, 2 para 2 variables, 3 para la resolución de 3 variables, 
 * y 4 o cualquier otra opción se abandona el menú y termina el programa.
 */
class Principal{
    public static void main(String args[]){
    Gauss1 g1 = new Gauss1();
    Gauss2 g2 = new Gauss2();
    Gauss3 g3 =new Gauss3();
    int opc;
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("1)Sistema de Guass-Jordan para 1 variable\n2)Sistema de Gauss-Jordan para 2 variables\n3)Sistema de Guass-Jordan paea 3 variables\n4)Salir");
      opc=sc.nextInt();
      if(opc==1)
        g1.Gauss1var();
      if(opc==2)
        g2.Gauss2var();
      if(opc==3)
        g3.Gauss3var();
    }while(opc>0&&opc<4);    
}}