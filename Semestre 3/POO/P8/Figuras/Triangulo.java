public abstract class Triangulo extends Poligono implements RadianesGrados, GradosRadianes{
    private int alpha, beta, gamma; //Angulos en grados
    private double a, b, c; // Angulos en radianes
        protected double l1, l2, l3;
    private double base, altura;
        public void setBase(double base){
          this.base=base;
        }
        public void setAltura(double altura){
        this.altura=altura;
        }
        public void setAngulos(int alpha, int beta, int gamma){
        this.alpha=alpha;
        this.beta=beta;
        this.gamma=gamma;
        }
        public int getAlpha(){
            return alpha;
        }
        public int getBeta(){
            return beta;
        }
        public int getGamma(){
            return gamma;
        }
        public double getAltura(){
               return altura;
        }
        public double getBase(){
            return base;
        }
    public String toString(){
        return "Triangulo";
    }
        public void setAngsRad(double a, double b, double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
        public double getC(){
            return c;
        }
        abstract public void calcularLados();
        
}