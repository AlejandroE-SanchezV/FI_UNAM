public class Rombo extends Cuadrilatero{
    private double pi=Math.PI;
    public void setDiagonales(double diagonalM, double diagonalm){
        this.diagonalM=diagonalM;
        this.diagonalm=diagonalm;
    }
    public double getDiagM(){
        return diagonalM;
    }
    public double getDiagm(){
        return diagonalm;
    }
    public double calcularLados(){
        setBase((diagonalm/2)*(Math.sin((90*pi)/180))/Math.sin(((getAlpha()/2)*pi)/180));
        return getBase();
    }
    public double area() {
        return (diagonalM*diagonalm)/2;
    }
    public double perimetro() {
        return getBase()*4;
    }
   public void radAGrad(){
        setAngsRad((getAlpha()*pi)/180, (getBeta()*pi)/180);
        System.out.println("Angulo Alpha= " +this.getAlpha() + " °, conversión a radianes= " +(this.getAlpha()*pi)/180+" rad");
        System.out.println("Angulo Beta= " +this.getBeta() + " °, conversión a radianes= " +(this.getBeta()*pi)/180+" rad");
     }
     public void gradARad(){
        System.out.println("Angulo a en radianes= " +super.getA()+" rad,conversión a grados= " +(super.getA()*180)/pi+" °");
        System.out.println("Angulo b en radianes= " +super.getB()+" rad, conversión a grados= " +(super.getB()*180)/pi+" °");
     }
}