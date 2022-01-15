
public class Prueba{
    //Instanciando a los tipos de empleados
    LiderDeProyecto lider = new LiderDeProyecto("Luis","Java",10000,8,"Lider","Aplicaciones Web",8);
    Desarrollador desarrollador = new Desarrollador("Ana","Java",10000,8,"Desarrollador","Media","Estructurado");
    Disenador dise = new Disenador("Juan","Java",8000,8,"Diseñador","86","23");
    Administrador admin = new Administrador("Rosa","Java",12000,10,"Administrador");
    Empleados emp;

    void prueba(){
        emp = lider;
        emp.getNombre();
        }
    }

class PruebaMain{
    public static void main(String[] args) {
        Prueba P = new Prueba();
        P.prueba();
    }
}