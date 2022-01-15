import java.io.*;
//Ejercicio de practica: Guardar el texto de entrada en un archivo mediante un objeto de tipo FileWriter
class EditorSimple { 
    public static void main(String args[]) throws IOException { 
        FileWriter feditor = new FileWriter("EditorSimple.txt");
        /**
        *Se crea el archivo feditor que es un objeto de la clase FileWriter, que nos permitirá
        *guardar cadenas de caracteres o flujos de bytes en un archivo, y en su método constructor recibe
        *como parámetro el nombre del archivo que será EditorSimple.txt
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        /**
        *Se crea un objeto de la clase BufferedReader llamado br, que nos permitirá 
        *leer flujos de bytes o cadenas gracias a que en su método constructor
        *recibe como parámetro un objeto de la clase InputStreamReader que recibe flujos de bytes
        *o cadenas como entrada
        */
        String str[] = new String[100];
        /**
        *Se crea un arreglo de 100 objetos de la clase String o cadenas, llamado str
        */

        System.out.println("Escriba varias lineas de texto."); 
        System.out.println("Escriba 'stop' para salir."); 

        for(int i=0; i<100; i++) { 
            str[i] = br.readLine(); 
            /**
            *Por medio del método readLine del objeto br, podemos leer las cadenas que el usuario
            *escriba y se almacenan en el índice i del arreglo de cadenas.
            */
            if(str[i].equals("stop")) 
            /**
            *Si el usuario escribe la palabra "stop" se detiene la lectura de cadenas
            */
                break; 
        }
        br.close();
        /**
        *Se cierra el flujo de bytes con el método close del objeto br
        */

        System.out.println("\nEl archivo generado es:");
        for(int i=0; i<100; i++) { 
            if(str[i].equals("stop")){
                feditor.close();
                /**
                *Se cierra el flujo de bytes del objeto feditor
                */
                break;
            }
            feditor.write(str[i]+"\n");
            /**
            *Se hace un recorrido del arreglo de cadenas str, gracias al ciclo for
            *y cada que se extrae una cadena de este arreglo, se imprime o se escribe en el 
            *archivo de texto generado por el objeto File Writer, gracias al método write
            *del objeto feditor
            */
            System.out.println(str[i]); 
        }
    }
}