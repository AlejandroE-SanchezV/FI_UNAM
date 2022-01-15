import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileRadix {
    public void readScanner(String path){
    File f = new File(path);
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> lastNames = new ArrayList<>();
    ArrayList<String> accountNumber = new ArrayList<>();
    Scanner scan = null;
    try {
        scan = new Scanner(f);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            names.add(lineArray[0]);
            lastNames.add(lineArray[1]);
            accountNumber.add(lineArray[2]);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    } finally {
        scan.close();
        System.out.println("Names:");
        for(int i=0;i<names.size();i++){
            if(i<names.size()-1)
                System.out.print(names.get(i)+",");
            else
                System.out.print(names.get(i));
        }
        System.out.println();
        System.out.println("Last Names:");
        for(int i=0;i<lastNames.size();i++){
            if(i<lastNames.size()-1)
                System.out.print(lastNames.get(i)+",");
            else
                System.out.print(lastNames.get(i));
        }
        System.out.println();
        System.out.println("Account numbers:");
        for(int i=0;i<accountNumber.size();i++){
            if(i<accountNumber.size()-1)
                System.out.print(accountNumber.get(i)+",");
            else
                System.out.print(accountNumber.get(i));
            }
        }
    }
}