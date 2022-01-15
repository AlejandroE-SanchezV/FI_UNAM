public class TrianguloEscaleno extends Triangulo{
    private final double pi= Math.PI;
    public void calcularLados(){
        l1=getBase();
        l2= (l1*Math.sin((getBeta()*pi)/180))/Math.sin((getAlpha()*pi)/180);
        l3= (l1*Math.sin((getGamma()*pi)/180))/Math.sin((getAlpha()*pi)/180);
        System.out.println("Lado a= "+l1+" u\nLado b= "+l2+" u\nLado c= "+l3+" u");
        setAltura((l2*l3)/l1);
    }
    public double area(){
        return (getBase()*getAltura())/2;
    }
    public double perimetro(){
        return l1+l2+l3;
    }
     public void radAGrad(){
        setAngsRad((getAlpha()*pi)/180, (getBeta()*pi)/180, (getGamma()*pi)/180);
        System.out.println("Angulo Alpha= " +getAlpha() + " °, conversión a radianes= " +(getAlpha()*pi)/180+" rad");
        System.out.println("Angulo Beta= " +getBeta() + " °, conversión a radianes= " +(getBeta()*pi)/180+" rad");
        System.out.println("Angulo Gamma= " +getGamma() + " °, conversión a radianes= " +(getGamma()*pi)/180+" rad");
    }
    public void gradARad(){
        System.out.println("Angulo a en radianes= " +getA()+" rad,conversión a grados= " +(getA()*180)/pi+" °");
        System.out.println("Angulo b en radianes= " +getB()+" rad, conversión a grados= " +(getB()*180)/pi+" °");
        System.out.println("Angulo c en radianes= " +getC()+" rad, conversión a grados= " +(getC()*180)/pi+" °");
    }
   
}