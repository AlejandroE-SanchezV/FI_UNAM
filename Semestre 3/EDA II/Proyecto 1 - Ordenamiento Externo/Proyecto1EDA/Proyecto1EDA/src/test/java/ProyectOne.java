
package proyectone;

import java.io.*;
import java.util.*;


public class ProyectOne {
    static Map<String,String> miTablita=new HashMap<>();
    static Map<String,String> miTablita2=new HashMap<>();
    
   static void polifaseNombre(String direccionL,String direccionE1,String direccionE2,String direccionE0,String direccionE3){
		String acumulador;
		String guarda;
		int numeroArchivo=0;
		int cantidadElementos=0;
                int contador=0;
                List<String> apoyo = new LinkedList<>();
                List<String> apoyoA = new LinkedList<>();
                List<String> apoyoC = new LinkedList<>();
		try{
                    BufferedWriter escribir1= crearArchivo(0,direccionE1,direccionE2,direccionE0,direccionE3);
                    BufferedWriter escribir2= crearArchivo(1,direccionE1,direccionE2,direccionE0,direccionE3);
                    BufferedReader lecturaB = leerArchivo(4,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    while((guarda=lecturaB.readLine())!=null){
                            StringTokenizer secciones= new StringTokenizer(guarda,",");
                            while(secciones.hasMoreTokens()){
                                apoyo.add(secciones.nextToken());
                                apoyoA.add(secciones.nextToken());
                                apoyoC.add(secciones.nextToken());
                                miTablita.put(apoyo.get(contador),apoyoA.get(contador)+","+apoyoC.get(contador));
                                cantidadElementos+=1;
                                contador+=1;
                                if(contador==10){
                                    contador=0;
                                }
                                if(cantidadElementos==10){
                                    numeroArchivo+=1;
                                    cantidadElementos=0;
                                    
                                    if(numeroArchivo%2==0){
                                        acumulador="";
                                        for(String x: apoyo){
                                            acumulador=acumulador+x+",";
                                        }
                                        System.out.println("Archivo 2");
                                        escribir2.write(ordenar(acumulador));
                                        escribir2.write("/");
                                        
                                        
                                    }else{
                                        acumulador="";
                                        for(String x: apoyo){
                                            acumulador=acumulador+x+",";
                                        }
                                        System.out.println("Archivo 1");
                                        escribir1.write(ordenar(acumulador));
                                        escribir1.write("/");
                                    }
                                    apoyo.clear();
                                } 
                            }
			}  
                    if(!apoyo.isEmpty()){
                        numeroArchivo+=1;
                        if(numeroArchivo%2==0){
                            acumulador="";
                            for(String x: apoyo){
                                acumulador=acumulador+x+",";
                            }
                            System.out.println("Archivo 2");
                            escribir2.write(ordenar(acumulador));
                            escribir2.write("/");
                            
                        }else{
                            acumulador="";
                            for(String x: apoyo){
                                acumulador=acumulador+x+",";
                            }
                            System.out.println("Archivo 1");
                            escribir1.write(ordenar(acumulador));
                            escribir1.write("/");
                        }
                        apoyo.clear();
                    }
                    escribir1.write("\n");
                    escribir2.write("\n");
                    lecturaB.close();
                    escribir1.close();
                    escribir2.close();
                }catch(IOException e){}
                
	}
   
   static void polifaseApellido(String direccionL,String direccionE1,String direccionE2,String direccionE0,String direccionE3){
		String acumulador;
		String guarda;
		int numeroArchivo=0;
		int cantidadElementos=0;
                int contador=0;
                List<String> apoyoN = new LinkedList<>();
                List<String> apoyo = new LinkedList<>();
                List<String> apoyoC = new LinkedList<>();
		try{
                    BufferedWriter escribir1= crearArchivo(0,direccionE1,direccionE2,direccionE0,direccionE3);
                    BufferedWriter escribir2= crearArchivo(1,direccionE1,direccionE2,direccionE0,direccionE3);
                    BufferedReader lecturaB = leerArchivo(4,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    while((guarda=lecturaB.readLine())!=null){
                            StringTokenizer secciones= new StringTokenizer(guarda,",");
                            while(secciones.hasMoreTokens()){
                                apoyoN.add(secciones.nextToken());
                                apoyo.add(secciones.nextToken());
                                apoyoC.add(secciones.nextToken());
                                miTablita.put(apoyo.get(contador),apoyoN.get(contador));
                                miTablita2.put(apoyo.get(contador),apoyoC.get(contador));
                                cantidadElementos+=1;
                                contador+=1;
                                if(contador==10){
                                    contador=0;
                                }
                                if(cantidadElementos==10){
                                    numeroArchivo+=1;
                                    cantidadElementos=0;
                                    
                                    if(numeroArchivo%2==0){
                                        acumulador="";
                                        for(String x: apoyo){
                                            acumulador=acumulador+x+",";
                                        }
                                        System.out.println("Archivo 2");
                                        escribir2.write(ordenar(acumulador));
                                        escribir2.write("/");
                                        
                                        
                                    }else{
                                        acumulador="";
                                        for(String x: apoyo){
                                            acumulador=acumulador+x+",";
                                        }
                                        System.out.println("Archivo 1");
                                        escribir1.write(ordenar(acumulador));
                                        escribir1.write("/");
                                    }
                                    apoyo.clear();
                                } 
                            }
			}  
                    if(!apoyo.isEmpty()){
                        numeroArchivo+=1;
                        if(numeroArchivo%2==0){
                            acumulador="";
                            for(String x: apoyo){
                                acumulador=acumulador+x+",";
                            }
                            System.out.println("Archivo 2");
                            escribir2.write(ordenar(acumulador));
                            escribir2.write("/");
                            
                        }else{
                            acumulador="";
                            for(String x: apoyo){
                                acumulador=acumulador+x+",";
                            }
                            System.out.println("Archivo 1");
                            escribir1.write(ordenar(acumulador));
                            escribir1.write("/");
                        }
                        apoyo.clear();
                    }
                    escribir1.write("\n");
                    escribir2.write("\n");
                    lecturaB.close();
                    escribir1.close();
                    escribir2.close();
                }catch(IOException e){}
                
	}
   
    static void polifaseParteDos(String direccionL,String direccionE1,String direccionE2,String direccionE0,String direccionE3,int opcion){
        System.out.println("Ordenar archivos");
        String aux1,aux2; 
        int linea=1,w=-1,contador=0; 
        Scanner dir= new Scanner(System.in);
        try{
            BufferedReader lecturaB1 = leerArchivo(0,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
            BufferedReader lecturaB2 = leerArchivo(1,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    
            BufferedWriter escritoArchivoF0=crearArchivo(2,direccionE1,direccionE2,direccionE0,direccionE3);
            BufferedWriter escritoArchivoF3=crearArchivo(3,direccionE1,direccionE2,direccionE0,direccionE3);
            while(true){
                w++;
                        
                aux1=leerLinea(linea,lecturaB1);
                aux2=leerLinea(linea,lecturaB2);
                
                String[] archivo1=aux1.split("/");
                String[] archivo2=aux2.split("/");
                
                if(archivo1.length<archivo2.length){
                    aux1=aux1+"A/";
                    archivo1=aux1.split("/");
                }
                if(archivo1.length>archivo2.length){
                    aux2=aux2+"A/";
                    archivo2=aux2.split("/");
                }
                
                if(aux1.equals("") || aux2.equals("")|| aux1.equals(aux2)){
                    break;
                }
                if(aux2==null){
                    break;
                }
                if(aux1==null){
                    break;
                }
                
                contador++;
                for(int i=0;i<archivo1.length || i<archivo2.length;i++){
                    if(i%2==0){
                        String valor=archivo1[i]+archivo2[i];
                        escritoArchivoF0.write(ordenar(valor)+"/");
                        if(contador%2==0){
                            System.out.println("Iteración:"+contador+"Se escribe en F1");
                        }else{
                            System.out.println("Iteración:"+contador+"Se escribe en F0");
                        }
                    }
                    else{
                        String valor=archivo1[i]+archivo2[i];
                        escritoArchivoF3.write(ordenar(valor)+"/");
                        if(contador%2==0){
                            System.out.println("Iteración:"+contador+"Se escribe en F2");
                        }else{
                            System.out.println("Iteración:"+contador+"Se escribe en F3");
                        }
                    }
                }
                escritoArchivoF0.write("\n");
                escritoArchivoF3.write("\n");
                escritoArchivoF0.close();
                escritoArchivoF3.close();
                if(aux1.equals("") || aux2.equals("")|| aux1.equals(aux2)){
                    break;
                }
                
                if(w%2==0){
                    escritoArchivoF0=crearArchivo(0,direccionE1,direccionE2,direccionE0,direccionE3);
                    escritoArchivoF3=crearArchivo(1,direccionE1,direccionE2,direccionE0,direccionE3);
                    lecturaB1 = leerArchivo(2,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    lecturaB2 = leerArchivo(3,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                }
                else{
                    escritoArchivoF0=crearArchivo(2,direccionE1,direccionE2,direccionE0,direccionE3);
                    escritoArchivoF3=crearArchivo(3,direccionE1,direccionE2,direccionE0,direccionE3);
                    lecturaB1 = leerArchivo(0,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    lecturaB2 = leerArchivo(1,direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                    linea+=1;
                }
            }
            escritoArchivoF0.close();
            escritoArchivoF3.close();
            lecturaB1.close();
            lecturaB2.close();
        }catch(IOException e){
            System.out.println("Valio");
        }
        
        System.out.println("Inserta el nombre del ultimo archivo");
        String direccionF2=dir.next();
        System.out.println("Inserta el nombre del usuario");
        String usuario=dir.next();
        String direccionF1="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\"+direccionF2+".txt";
        
        ordenFinal(linea,direccionF1,direccionL,opcion);
   }
   
    static void ordenFinal(int linea,String direccionF,String direccionL,int opcion){
        String aux;
        if(opcion==1){
            try{
                File archivoF= new File(direccionF);
                FileReader archivoR= new FileReader(archivoF);
                BufferedReader archivoRB= new BufferedReader(archivoR);

                File archivoL= new File(direccionL);
                FileWriter archivoLW= new FileWriter(archivoL,true);
                BufferedWriter archivoWB= new BufferedWriter(archivoLW); 

                aux=leerLinea(linea,archivoRB);
                String[] archivo=aux.split(",");
                archivoWB.write("\n");
                for(int i=0;i<archivo.length;i++){
                    if(miTablita.get(archivo[i])==null){
                        i++;
                    }else{
                        archivoWB.write(archivo[i]+","+miTablita.get(archivo[i])+"\n");
                    }    
                }
               archivoRB.close();
               archivoWB.close();
            }catch(IOException e){}
        }else{
            try{
                File archivoF= new File(direccionF);
                FileReader archivoR= new FileReader(archivoF);
                BufferedReader archivoRB= new BufferedReader(archivoR);

                File archivoL= new File(direccionL);
                FileWriter archivoLW= new FileWriter(archivoL,true);
                BufferedWriter archivoWB= new BufferedWriter(archivoLW); 

                aux=leerLinea(linea,archivoRB);
                String[] archivo=aux.split(",");
                archivoWB.write("\n");
                for(int i=0;i<archivo.length;i++){
                    if(miTablita.get(archivo[i])==null){
                        i++;
                    }else{
                        archivoWB.write(miTablita.get(archivo[i])+","+archivo[i]+","+miTablita2.get(archivo[i])+"\n");
                    }    
                }
               archivoRB.close();
               archivoWB.close();
            }catch(IOException e){}
        }
    }
    
   static BufferedWriter crearArchivo(int opcion,String direccionE1,String direccionE2,String direccionE0,String direccionE3){
       File archivo1=new File(direccionE1);
       File archivo2=new File(direccionE2);
       File archivo3=new File(direccionE0);
       File archivo4=new File(direccionE3);
       FileWriter escritor;
       try{
           switch(opcion){
               case 0:
                   escritor=new FileWriter(archivo1,true);
                   BufferedWriter escritoArchivo1=new BufferedWriter(escritor);
                   return escritoArchivo1;
               
               case 1:
                   escritor=new FileWriter(archivo2,true);
                   BufferedWriter escritoArchivo2=new BufferedWriter(escritor);
                   return escritoArchivo2;
                   
               case 2:
                   escritor=new FileWriter(archivo3,true);
                   BufferedWriter escritoArchivo3=new BufferedWriter(escritor);
                   return escritoArchivo3;  
                   
               case 3:
                   escritor=new FileWriter(archivo4,true);
                   BufferedWriter escritoArchivo4=new BufferedWriter(escritor);
                   return escritoArchivo4;
                   
               default:
                   break;
           }
       }catch(IOException a){}
       return null;
   }
   
   static BufferedReader leerArchivo(int opcion,String direccionL,String direccionE1, String direccionE2,String direccionE0,String direccionE3){
       File archivo=new File(direccionL);
       File archivo1=new File(direccionE1);
       File archivo2=new File(direccionE2);
       File archivo3=new File(direccionE0);
       File archivo4=new File(direccionE3);
       FileReader lector;
       try{
           switch(opcion){
               case 0:
                   lector=new FileReader(archivo1);
                   BufferedReader leerArchivo1=new BufferedReader(lector);
                   return leerArchivo1;
               
               case 1:
                   lector=new FileReader(archivo2);
                   BufferedReader leerArchivo2=new BufferedReader(lector);
                   return leerArchivo2;
                   
               case 2:
                   lector=new FileReader(archivo3);
                   BufferedReader leerArchivo3=new BufferedReader(lector);
                   return leerArchivo3;  
                   
               case 3:
                   lector=new FileReader(archivo4);
                   BufferedReader leerArchivo4=new BufferedReader(lector);
                   return leerArchivo4;
               
               case 4:
                   lector=new FileReader(archivo);
                   BufferedReader leerArchivo=new BufferedReader(lector);
                   return leerArchivo;
                   
               default:
                   break;
           }
       }catch(IOException a){}
       return null;
   }
    
   static String leerLinea(int numLinea,BufferedReader lista){
        try {
            for(int i=1;i<numLinea;i++){
                lista.readLine();
            }
            return lista.readLine(); 
        } catch (IOException e) {}
        return null;
    }
   
   static String ordenar(String cadena){
       String [] auxiliar = cadena.split(",");
       ArrayList<String> regreso=insertionSort(auxiliar,auxiliar.length);
       cadena="";
       for(String x:regreso){
           cadena=cadena+x+",";
       }
       return cadena;
   }
   
   static ArrayList insertionSort(String[] arr, int n){
	int i,j;
	String aux;
	for(i=1; i<n; i++){
		j=i;
		aux=arr[i];
		while ((j>0 && aux.charAt(0) < arr[j-1].charAt(0))){
			arr[j] = arr[j-1];
			j--;
		}
		arr[j]=aux;
        }
        
        ArrayList<String> auxiliarF = new ArrayList<String>();
        for(int k =0;k<arr.length;k++){
           if(!arr[k].equals(" ")){
               auxiliarF.add(arr[k]);
           }
        }
    return auxiliarF;
}
           
    public static void main(String[] args){
        Scanner nombre= new Scanner (System.in);
        System.out.println("Inserta el nombre de tu carpeta usuario");
        String usuario=nombre.next();
        System.out.println("Inserta el nombre de tu archivo:");
        String archivoNombre=nombre.next();
        String direccionL="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\"+archivoNombre+".txt";
        String direccionE1="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F1.txt";
        String direccionE2="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F2.txt";
        String direccionE0="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F0.txt";
        String direccionE3="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F3.txt";
        System.out.println("Inserta la opcion 1)Nombre\n 2)Apellidos");
        int opcion=nombre.nextInt();
        switch(opcion){
            case 1:
                polifaseNombre(direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                polifaseParteDos(direccionL,direccionE1,direccionE2,direccionE0,direccionE3,1);
                break;
                
            case 2:
                polifaseApellido(direccionL,direccionE1,direccionE2,direccionE0,direccionE3);
                polifaseParteDos(direccionL,direccionE1,direccionE2,direccionE0,direccionE3,2);
                break;
                
            default:
                break;
        }   
    }
}
