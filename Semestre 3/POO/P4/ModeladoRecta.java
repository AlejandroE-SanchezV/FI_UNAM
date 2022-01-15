import java.util.Scanner;
public class  ModeladoRecta{
    public static void main(String args[]){
        int n, aux;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("\nEste programa modelara mediante un conjunto de puntos una recta y = mx + b por minimos cuadrados\nIngrese cuantos pares de puntos x,y tiene, solo se pueden ingresar máximo 10 pares\n n = ");
        n=sc.nextInt();
        aux=0;
        if(n>10 || n<=0){
            aux=1;
            System.out.println("Numero invalido");
        }
        }while(aux==1);
        float[][] xys = new float [2][n];
        for(int i=1; i<=n; i++){
            System.out.print("\nx"+i+" =");
            xys[0][i-1]=sc.nextFloat(); 
            System.out.print("\ny"+i+" =");
            xys[1][i-1]=sc.nextFloat();
        }
        RegLineal rl = new RegLineal(n);
        rl.modelado(xys);
    }
    
}

class RegLineal{
    float x=0, y=0,xy=0, x2=0, m, b;
    int n;
    RegLineal(int n){
        this.n=n;
    }
    void modelado(float arr[][]){
        for(int i=0; i<arr[0].length; i++){
            x=x+arr[0][i];
            y=y+arr[1][i];
            xy=xy+(arr[0][i]*arr[1][i]);
            x2=x2+(arr[0][i]*arr[0][i]);
        } 
        System.out.print("\nSuma de todas las x =  " + x + "  Suma de todas las y = "+y+"     Suma de todas las x*y = "+xy+"      Suma de todas las x cuadradas = "+x2);
        m=(xy-(x*y)/n)/(x2-((x*x)/n));
        System.out.println("\nValor de m(pendiente)=  "+m);
        b=(y/n)-(m*(x/n));
        System.out.println("Valor de b =   "+b);
        System.out.println("La recta es:  y = "+m+"x + " +b);
    }
}