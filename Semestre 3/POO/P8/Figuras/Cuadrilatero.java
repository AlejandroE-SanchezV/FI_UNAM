public abstract class Cuadrilatero extends Poligono implements RadianesGrados, GradosRadianes{
    private int alpha, beta; //Angulos en grados
    protected double a, b; //Angulos en radianes
    private double base, altura;
        protected double diagonalM, diagonalm;

    public void setBase(double base){
            this.base=base;
        }

    public void setAltura(double altura){
            this.altura=altura;
        }
        public double getBase(){
            return base;
        }
        public double getAltura(){
            return altura;
        }
        public void setAngulos(int alpha, int beta){
            this.alpha=alpha;
            this.beta=beta;
        }
        public int getAlpha(){
            return alpha;
        }
        public int getBeta(){
            return beta;
        }
        public void setAngsRad(double a, double b){
            this.a=a;
            this.b=b;
        }
        public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
        
    abstract public double area();
    abstract public double perimetro();
        abstract public double calcularLados();
        abstract public void setDiagonales(double diagonalM, double diagonalm);
        abstract public double getDiagm();
        abstract public double getDiagM();
    public String toString(){
        return "Cuadrilatero";
    }

    
}