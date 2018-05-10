
package Ejercicio_7_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Ejercicio_7_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        abriryleerFichero();
    }
    public static void abriryleerFichero() throws FileNotFoundException, IOException{
        FileReader fr=null;
        File archivo = new File ("D:\\Archivos Miguel Angel\\DAW\\Programación\\Pruebas\\datos.txt");D:
        fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader (fr,10);
        leerFichero(br);
    }
    
    public static void cerrarFichero(FileReader fr) throws IOException{
        if (null !=fr) {
            fr.close();
        }
    }
    
    public static void leerFichero (BufferedReader br) throws IOException {
        String linea;
        FileWriter fichero = new FileWriter("D:\\Archivos Miguel Angel\\DAW\\Programación\\Pruebas\\DatosFinales.txt");
        PrintWriter pw = new PrintWriter(fichero);  
        pw.println("------------------------");
        pw.println("-  Listado de alumnos  -");
        while ((linea = br.readLine()) != null){
            String vector[] = linea.split(" ");
            generarArchivo(br,vector,pw);
        }
        pw.println("------------------------");
         cerrarFicheroEscritura(pw);
    }
    
    public static void generarArchivo (BufferedReader br,String vector[],PrintWriter pw) throws IOException{
        String linea;
        if (Integer.parseInt(vector[2]) > 17){
            pw.println("------------------------");
            pw.println("Nombre: "+vector[0]);
            pw.println("Apellido: "+vector[1]);
            pw.println("Edad: "+vector[2]);
        }
       
    }
    
    public static void cerrarFicheroEscritura(PrintWriter pw){
                pw.close();
    }    
    
}
