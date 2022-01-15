public class Cuadrado extends Cuadrilatero{
    private final double pi=Math.PI;
    public void setDiagonales(double diagm, double diagM){
        this.diagonalM=diagm;
        this.diagonalm=diagm;
    }
    public double getDiagm(){
        return this.diagonalm;
    }
    public double getDiagM(){
        return this.diagonalM;
    }
    public double calcularLados(){
        setBase(getDiagm()*Math.sin((45*pi)/180)/Math.sin((getAlpha()*pi)/180));
        return getBase();
    }
    public double area(){
        return getBase()*getBase();
    }
    public double perimetro(){
        return getBase()*4;
    }
    public void radAGrad(){
         setAngsRad((this.getAlpha()*pi)/180, (this.getAlpha()*pi)/180);
         System.out.println("Todos los angulos del cuadrado son de 90°, por tanto su conversion a radianes = " +(this.getAlpha()*pi)/180+" rad");
     }
     public void gradARad(){
         System.out.println("Todos los angulos en radianes del cuadrado son de " + getA()+" rad  y por tanto su conversión a grados= "+ (getA()*180)/pi+" °");
     }
   
}