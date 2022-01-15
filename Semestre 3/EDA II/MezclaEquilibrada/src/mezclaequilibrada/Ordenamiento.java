/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mezclaequilibrada;

import java.io.*;
 
public class Ordenamiento {
    /*
    *@param aux, r, r2 obte
    */
    
	public char ObLetra(String a){
                return a.charAt(0);//variable para odernar los datos
	}
 
	public void partiendo(File F0, String direccion){
		boolean b;
		char aux,r,r2; //variables que ayudan a comparar las cadenas 
                String aux3; //variable para no perder la primer linea del archivo original
                
                File F1=new File(direccion, "F1.txt");
                File F2=new File(direccion, "F2.txt");
                
                
		try{
                        
			FileReader Fr=new FileReader(F0);//leer el el archivo dado por el usuario
			BufferedReader F=new BufferedReader(Fr); //al leer los caracteres los almacenan en en el buffer
                        
                        
                        F1.createNewFile(); //creacion del fichero F1 aux en la misma direccion del archivo original 
			FileWriter FwF1=new FileWriter(F1);// se abre el archivo para laescritura del archivo F1 auxiliar
			BufferedWriter BwF1=new BufferedWriter(FwF1); // se encarga de almacenar los caracteres para la escritura en el archivo
			PrintWriter Ff1=new PrintWriter(BwF1);//escribe en el archivo auxiliar F1
                        //mismas funciones para el el archivo auxiliar F2
                         
                        F2.createNewFile(); //creacion del fichero F1 aux en la misma direccion del archivo original 
			FileWriter FwF2=new FileWriter(F2);
			BufferedWriter BwF2=new BufferedWriter(FwF2);
			PrintWriter Ff2=new PrintWriter(BwF2);
                        
                        aux3=F.readLine();
			r2=ObLetra(aux3);//se agrega la letra de la primera linea 
			Ff1.println(aux3);//se escribe la primer linea en el archivo auxiliar 1
			Ff1.flush();//se limpia el buffer
 
			b=true;
			aux=r2;
 
			String aux2;
			while((aux2=F.readLine())!=null){
				r=ObLetra(aux2);
				if(r>=aux){ //comoparacion para determinar cual nombre va en el archivo F1 y F2 de acuerdo a su primer letra
					aux=r;
					if(b==true){
						Ff1.println(aux2);
						Ff1.flush();
					}
					else if(b==false){
						Ff2.println(aux2);
						Ff2.flush();
					}
				}
				else {
					aux=r;
					if (b==true){
						Ff2.println(aux2);
						Ff2.flush();
						b=false;
					}
					else{
						Ff1.println(aux2);
						Ff1.flush();
						b=true;
					}
				}
			}
                        
			Ff1.close();
			Ff2.close();
                        F.close();
                        
		}
 
		catch(IOException e){
			System.out.println(e.getMessage());
		}
                Archivos(F1,F2, direccion);
                      
	}
        
        public int Archivos(File F1, File F2, String direccion)
            {
                
                int ayuda=0;
                File F3=new File(direccion, "F3.txt");
                
                try{
                    FileReader F2r=new FileReader(F2);
                    BufferedReader Fr2=new BufferedReader(F2r);
                    String aux="";
                    aux=Fr2.readLine();
                }catch(IOException e)
                        {
                           ayuda=1;
                        }
                if(ayuda==1)
                {
                   try{
                       String aux=" ", aux2=" ";
                       char r;
                        
                        F3.createNewFile(); //creacion del fichero F3 para colocar los datos de F1 y sea el archivo final 
			FileWriter FwF3=new FileWriter(F3);
			BufferedWriter BwF3=new BufferedWriter(FwF3);
			PrintWriter Ff3=new PrintWriter(BwF3);  
                        
                        FileReader F1r=new FileReader(F1);
                        BufferedReader Fr1=new BufferedReader(F1r);
    
			while((aux2=Fr1.readLine())!=null)
                        {                            
                            Ff3.println(aux2);
                            Ff3.flush();   
                        }
                        Ff3.close();
                        
                    }
                    catch(IOException e){
			System.out.println(e.getMessage());
                    }  
                   return 0;
                }
                else{
               /*try{
                        String aux1, aux2;
                        char r2, aux3;
                        
                        F3.createNewFile(); //creacion del fichero F1 aux en la misma direccion del archivo original 
			FileWriter FwF3=new FileWriter(F3);
			BufferedWriter BwF3=new BufferedWriter(FwF3);
                        PrintWriter Ff3 = new PrintWriter(BwF3);
                        FileReader F1r=new FileReader(F2);
                        BufferedReader Fr1=new BufferedReader(F1r);
                        FileReader F2r=new FileReader(F2);
                        BufferedReader Fr2=new BufferedReader(F2r);
                        
                        aux1=Fr1.readLine();
                        Ff3.println(aux1);//se escribe la primer linea en el archivo auxiliar 1
                        Ff3.flush();//se limpia el buffer
                        
                        while((aux1=Fr1.readLine())!=null && (aux2=Fr2.readLine())!=null)
                        {
                            
                            r2=ObLetra(aux1);
                            aux3=ObLetra(aux2);
                            if(r2>=aux3)
                            {
                                Ff3.println(aux3);
                                Ff3.flush();
                            }
                            else
                            {
                                Ff3.println(r2);
                                Ff3.flush();
                            }
                        }
                        
                        Ff3.close();    
                    }
                    catch(IOException e){
			System.out.println(e.getMessage());
                    }
                }
                partiendo(F3,direccion);*/
                return 0; 
            } 
}

    

