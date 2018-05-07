
package Ejercicio_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Ejercicio_9 {
     public static void main(String[]args) throws SQLException{                               
        Scanner principal = new Scanner (System.in);
            int opcion = 0;
            do{
                System.out.println("============================");
                System.out.println("=           MENU           =");
                System.out.println("============================");
                System.out.println("=   1.  Consulta           =");
                System.out.println("=   2.  Update             =");
                System.out.println("=   3.  Insert             =");
                System.out.println("=   4.  Salir              =");
                System.out.println("============================");
                System.out.print("Selecciona una opción: "); 
                opcion = principal.nextInt();
                System.out.println("");
                
                switch (opcion){
                    case 1: //Consulta 
                        consultar();
                    break;
                        
                    case 2: //Update
                        update();
                    break;     
                    
                    case 3: //Insert
                        insert();
                    break;
                    
                    default:
                        System.out.println("Hasta la vista");
                }
            }while (opcion < 4);                                       
    }
     
     
    public static void consultar() throws SQLException{
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3307/beer"+"?verifyServerCertificate=false"+"&useSSL=true","root","Juancarlos5");      
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from bar");  // Hacemos la consulta
        while (rs.next()){// Lo imprimimos 
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        System.out.println("\n");
        con.close();
    }
    
    public static void update() throws SQLException{
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3307/beer"+"?verifyServerCertificate=false"+"&useSSL=true","root","Juancarlos5");   
        String actualitzaNombre = "update beer set name = ? where name = ?";
        PreparedStatement name = con.prepareStatement(actualitzaNombre);                       
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nuevo nombre: ");//Pido el nuevo valor
        String nombre1=entrada.nextLine(); 
        System.out.print("Introduce el nombre del que desea susituir: ");//Pido el valor que voy a sustituir
        String nombre2=entrada.nextLine();
        //Modificamos el valor
        name.setString(1,nombre1); //1 = el primer interrogante del "String actualitzaNombre".
        name.setString(2,nombre2);//2 = el segundo interrogante del "String actualitzaNombre".
        //Ejecuto el UPDATE
        name.executeUpdate();
        con.close();
    }
    
    public static void insert() throws SQLException{
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3307/beer"+"?verifyServerCertificate=false"+"&useSSL=true","root","Juancarlos5");     
        Statement stmt=(Statement)con.createStatement();
        Scanner entrada = new Scanner(System.in);
        System.out.println("======= TABLA =======");//Imprimimos la consulta
        ResultSet rs = stmt.executeQuery("Select * from bar"); 
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        System.out.println("");
        System.out.print("Introduce el nombre del bar que deseas añadir: ");//Introducimos los valores que vamos a insertar.
        String nombre=entrada.nextLine();
        System.out.print("Introduce la direccion: ");
        String direccion=entrada.nextLine();
        String insert="INSERT INTO bar (name,address) VALUES('"+nombre+"','"+direccion+"');";//Insertamos los valores nuevos en la base de datos
        stmt.executeUpdate(insert);
        System.out.println("");
        System.out.println("======= TABLA MODIFICADA =======");//Volvemos a imprimir la consulta para ver que se ha añadido correctamente
        ResultSet sr = stmt.executeQuery("Select * from bar"); 
        while (sr.next()){
            System.out.println(sr.getString(1)+" "+sr.getString(2));
        }
        System.out.println("");
        con.close();      
    }
    
}
