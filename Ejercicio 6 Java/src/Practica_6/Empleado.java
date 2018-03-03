
package Practica_6;

import java.util.ArrayList;
import java.util.Scanner;


public class Empleado {
    
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String nif;
    protected int edad;
    protected double salario;
    static ArrayList<Empleado> EmpleadosGlobales = new ArrayList<>();
    
    //CONSTRUCTOR POR DEFECTO
    public Empleado() {
    }
    
    //CONTRUCTOR COPIA
    public Empleado (final Empleado copia){
        nombre = copia.nombre;
        apellido1 = copia.apellido1;
        apellido2 = copia.apellido2;
        nif = copia.nif;
        edad = copia.edad;
        salario = copia.salario;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void setEmpleadosGlobales(ArrayList<Empleado> EmpleadosGlobales) {
        Empleado.EmpleadosGlobales = EmpleadosGlobales;
    }
    
    
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNif() {
        return nif;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    
    public static ArrayList<Empleado> getEmpleadosGlobales() {
        return EmpleadosGlobales;
    }
    
    //OTROS
    public void addEmpleadosGlobales (Empleado Empleado){
        EmpleadosGlobales.add(Empleado);
    }

    //METODOS
    
    //PEDIR ALTA EMPLEADO
    public void añadir(){
        Scanner entradaEmpleado = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");     
        boolean may = false;
        while (may == false){       
            String nombre= entradaEmpleado.nextLine();
            this.nombre=nombre;      
            String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
            for(int i=0; i< mayus.length(); i ++) {
                if (mayus.charAt(i)== this.nombre.charAt(0)){
                    may = true;    
                }                   
            }
            if (may != true) {
                System.out.print("Introduce el nombre correctamente: ");
            }
        } 
        System.out.print("Introduce el primer apellido: ");
        may = false;
        while (may == false){       
            String apellido1= entradaEmpleado.nextLine();
            this.apellido1=apellido1;    
            String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
            for(int i=0; i< mayus.length(); i ++) {
                if (mayus.charAt(i)== this.apellido1.charAt(0)){
                    may = true;    
                }                   
            }
            if (may != true) {
                System.out.print("Introduce el primer apellido correctamente: ");
            }
        }        
        System.out.print("Introduce el segundo apellido: ");
        may = false;
        while (may == false){       
            String apellido2= entradaEmpleado.nextLine();
            this.apellido2=apellido2;
            String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
            for(int i=0; i< mayus.length(); i ++) {
                if (mayus.charAt(i)== this.apellido2.charAt(0)){
                    may = true;    
                }                   
            }
            if (may != true) {
                System.out.print("Introduce el segundo apellido correctamente: ");
            }
        }        
        System.out.print("Introduce el nif: ");
        String nif= entradaEmpleado.nextLine();
        this.nif=nif;
        System.out.print("Introduce la edad: ");
        int edad= entradaEmpleado.nextInt();
        while (edad < 16){
            System.out.print("Tiene que ser mas de 16 años: ");
            edad =  entradaEmpleado.nextInt();
        }
        this.edad=edad;
        System.out.print("Introduce el salario: ");
        double salario= entradaEmpleado.nextInt();
        this.salario=salario;
        Empleado.EmpleadosGlobales.add(this);
    }  
    
    //MOSTRAR DATOS EMPLEADO
    public void mostrar(){
        System.out.println("========= EMPLEADO =========");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer Apellido: "+this.getApellido1());
        System.out.println("Segundo Apellido: "+this.getApellido2());
        System.out.println("Nif: "+this.getNif());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Salario: "+this.getSalario());
    }

}
