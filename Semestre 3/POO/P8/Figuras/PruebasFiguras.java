
import java.util.Scanner;
public class PruebasFiguras{
    public static void main(String[] args) {
            int opc;
            Scanner sc= new Scanner(System.in);
            do{
                System.out.println("Seleccione la figura sobre la cual quiere ejecutar los métodos: \n1)Cuadrado\n2)Rombo\n3)Triángulo Escaleno\n4)Salir");
                opc=sc.nextInt();
                switch(opc){
                    case 1:
                        Cuadrado cuadrado = new Cuadrado();
                        Cuadrilatero c= cuadrado;
                        System.out.println("Introduzca la longitud  de la diagonal del cuadrado: ");
                        double d=sc.nextDouble();
                        c.setDiagonales(d, d);
                        c.setAngulos(90, 90);
                        System.out.println("Longitud de los lados del rombo a partir de los angulos proporcionados= "+c.calcularLados()+" u");
                        System.out.println("Angulos del cuadrado= "+c.getAlpha()+" °\n Diagonal del cuadrado= "+c.getDiagm()+" u\nArea del cuadrado= " + c.area()+" u^2\nPerímetro del cuadrado= "+c.perimetro());
                        Cuadrado cuadrado2 = cuadrado;
                        RadianesGrados radgradc=cuadrado2;
                        GradosRadianes gradradc=cuadrado2;
                        radgradc.radAGrad();
                        gradradc.gradARad();
                        System.out.println("Instancia de la referencia: ");
                        getPoligono(c);
                        break;

                    case 2:
                        Rombo rombo = new Rombo();
                        Cuadrilatero r = rombo; 
                        int alphar, betar;
                        System.out.println("Introduzca la longitud de la diagonal mayor del rombo: ");
                        double dM=sc.nextDouble();
                        System.out.println("Introduzca la longitud de la diagonal menor del rombo: ");
                        double dm=sc.nextDouble();
                        r.setDiagonales(dM, dm);

                        do{
                            System.out.println("Introduzca el ángulo menor del rombo en grados: ");
                            alphar=sc.nextInt();
                            System.out.println("Introduzca el angulo menor del rombo en grados: ");
                            betar=sc.nextInt();
                            if(alphar+betar!=180)
                                System.out.println("Angulos incorrectos, su suma debe de dar 180");
                        }while(alphar+betar!=180);

                        r.setAngulos(alphar, betar);
                        System.out.println("Longitud de los lados del rombo a partir de los angulos proporcionados= "+r.calcularLados()+" u");
                        System.out.println("Angulo alpha del rombo en grados= "+r.getAlpha()+" °\nAngulo Beta del rombo en grados= " + r.getBeta()+" °\nDiagonal Mayor del rombo= "+r.getDiagM()+" u\nDiagonal Menor del rombo= "+r.getDiagm()+" u\nArea del rombo= " + r.area()+" u^2\nPerímetro del rombo= "+r.perimetro());
                        Rombo rombo2 = rombo;
                        RadianesGrados radgradr = rombo2;
                        GradosRadianes gradradr = rombo2;
                        radgradr.radAGrad();
                        gradradr.gradARad();
                        System.out.println("Instancia de la referencia: ");
                        getPoligono(r);
                        break;

                    case 3:
                        TrianguloEscaleno t = new TrianguloEscaleno();
                        Triangulo te = t;
                        int alphat, betat, gammat;
                        double baset;
                        System.out.println("Introduzca la longitud base del triángulo escaleno: ");
                        baset=sc.nextDouble();
                        te.setBase(baset);
                        do{
                            System.out.println("Introduzca el ángulo opuesto a la base del triángulo escaleno en grados: ");
                            alphat=sc.nextInt();
                            System.out.println("Introduzca el ángulo opuesto del lado adyacente de la base del triángulo escaleno en grados: ");
                            betat=sc.nextInt();
                            System.out.println("Introduzca el ángulo opuesto del lado opuesto de la base del triángulo escaleno en grados: ");
                            gammat=sc.nextInt();
                            if(alphat+betat+gammat!=180)
                                System.out.println("Angulos incorrectos, su suma debe de dar 180");
                        }while(alphat+betat+gammat!=180);

                        te.setAngulos(alphat, betat, gammat);
                        System.out.println("Longitud de los lados  del triángulo escaleno a partir de los ángulos: ");
                        te.calcularLados();
                        System.out.println("Angulo alpha del triángulo escaleno en grados= "+te.getAlpha()+" °\nAngulo Beta del triángulo escaleno en grados= " + te.getBeta()+" °\nAngulo Gamma del triángulo escaleno en grados= "+te.getGamma()+" °\nArea del triángulo escaleno= " + te.area()+" u^2\nPerímetro del triángulo escaleno= "+te.perimetro());
                        TrianguloEscaleno t2 = t; 
                        RadianesGrados radgradt = t2;
                        GradosRadianes gradradt = t2;
                        radgradt.radAGrad();
                        gradradt.gradARad();
                        System.out.println("Instancia de la referencia: ");
                        getPoligono(te);
                        break;   
                } 
            }while(0<opc&&opc<4);
        }
   

    public static void getPoligono(Object p){
        if(p instanceof Triangulo){
            System.out.println("Es un triangulo");
        }else if(p instanceof Cuadrilatero) System.out.println("Es un cuadrilatero");
        else System.out.println("Es un poligono");
        }
}