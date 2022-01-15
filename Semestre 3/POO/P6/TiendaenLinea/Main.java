package elementosEnVenta;

/**
*Se crea el paquete que contiene los elementos en venta, y que tendra
*los distintos elementos: alimentos, electronicos y prendas de vestir.
*Autores: 
*Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
*Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
*Pareja Avila Emiliano - No. Cuenta: 317081345
*Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
*/

import elementosEnVenta.electronicos.*;
import elementosEnVenta.alimentos.*;
import elementosEnVenta.prendasDeVestir.*;
import formasDeEntrega.*;
import usuarios.*;
import java.util.Scanner;

/**
*Se crea el metodo principal para la ejecucion del programa, en donde se plantea tener dos tipos de usuarios en la tienda, donde la primer opcion es usuario
*normal y la segunda un administrador, en cada caso se definen acciones concretas, en el caso del usuario normal, se permite navegar en el catalogo de los
*productos de acuerdo a la opcion de compra, donde se ejecuta la creacion de objeto de la clase usuarioNormal, se invoca el constructor y se asignan los datos
*por teclado, despues se invoca el metodo de impresion de los productos desde la clase catalogo, disponibles en base a la opcion.Y al concretar la compra
*se crea un objeto de la clase a domicilio o en sucursal del paquete FormasDeEntrega.
*En la opcion de administrador, se crea el objeto de tipo administrador y se ejecuta el constructor, despues se ve el listado de productos y se elige uno para
*su modificacion en cuanto al precio.
*/

public class Main{
    public static void main(String[] args){
    int op1,op2,op3,op4;
    Scanner teclado = new Scanner(System.in);
    Catalogo catalogo = new Catalogo();
    System.out.println("\nBievenido a la Tienda");
    do{
        System.out.println("\nIngrese una opcion: \n1)Usuario normal \n2)Administrador \n3)Salir");
        op1=teclado.nextInt();
        
        switch(op1){
            case 1:
                UsuarioNormal usuario = new UsuarioNormal();
                do{
                    System.out.println("\nIngrese una opcion: \n-Electronicos \n1)Celulares \n2)Computadoras \n3)TV \n\n-Alimentos \n4)Carne \n5)Fruta \n6)Bebidas \n\n-Prendas de Vestir \n7)Playeras \n8)Pantalones \n9)Calzado\n\n10)Regresar");
                    op2=teclado.nextInt();
                    
                    switch(op2){
                        case 1:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.celularesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }  
                            break;
                        
                        case 2:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.cortesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break; 

                        case 3:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.televisionesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break; 

                        case 4:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.computadorasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break;

                        case 5:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.frutasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break;
                            
                        case 6:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.bebidasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break;
                        
                        case 7:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.playerasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break; 

                        case 8:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.pantalonesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break; 

                        case 9:
                            System.out.println("\nSeleccione el producto que desea comprar: ");
                            catalogo.calzadosDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("\nForma de entrega: \n1)Domicilio \n2)Tienda\nPulse otra tecla para cancelar");
                                op4=teclado.nextInt();
                                if(op4==1){
                                    Domicilio datos = new Domicilio();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                                if(op4==2){
                                    EnTienda datos = new EnTienda();
                                    System.out.println("\nGRACIAS POR SU COMPRA");
                                }
                            }
                            break;

                        default:
                            System.out.println("\nOpcion no valida intente de nuevo");
                    }
                }while(op2!=10);
                break;

            case 2:
                Administrador admin = new Administrador();
                do{
                    System.out.println("\nCambiar el precio de un producto: \n-Electronicos \n1)Celulares \n2)Computadoras \n3)TV \n\n-Alimentos \n4)Carne \n5)Fruta \n6)Bebidas \n\n-Prendas de Vestir \n7)Playeras \n8)Pantalones \n9)Calzado\n\n10)Regresar");
                    op2=teclado.nextInt();
                    
                    switch(op2){
                        case 1:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.celularesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("Ingrese el nuevo precio: ");
                                op4=teclado.nextInt();
                            }
                            break;
                        
                        case 2:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.cortesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break; 

                        case 3:
                            System.out.println("\nSeleccione a modificar: ");
                            catalogo.televisionesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break; 

                        case 4:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.computadorasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break;

                        case 5:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.frutasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break;
                            
                        case 6:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.bebidasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("Ingrese el nuevo precio: ");
                                op4=teclado.nextInt();
                            }
                            break;
                        
                        case 7:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.playerasDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                            else{
                                System.out.println("Ingrese el nuevo precio: ");
                                op4=teclado.nextInt();
                            }
                            break; 

                        case 8:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.pantalonesDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break; 

                        case 9:
                            System.out.println("\nSeleccione el producto a modificar: ");
                            catalogo.calzadosDisponibles();
                            System.out.println("\n4) Cancelar");
                            op3=teclado.nextInt();
                            if (op3<0 || op3>3)
                                System.out.println("Opcion no valida");
                                else{
                                    System.out.println("Ingrese el nuevo precio: ");
                                    op4=teclado.nextInt();
                                }
                                break;

                        default:
                            System.out.println("\nOpcion no valida intente de nuevo");
                    }
                }while(op2!=10);

                break;

            case 3:
                break;
            
            default:
                System.out.println("\nOpcion no valida intente de nuevo");
        }

    }while(op1!=3);
    }   
}