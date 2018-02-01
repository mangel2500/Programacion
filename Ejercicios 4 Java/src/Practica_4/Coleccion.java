
package Practica_4;

import java.util.ArrayList;
import java.util.Scanner;


public class Coleccion {
    static int ejemTotales = 0;
    static int ejemPrestados = 0;
    static ArrayList<Libro> libros = new ArrayList<>();
    
    //CONSTRUCTOR POR DEFECTO
    public Coleccion (){
    }
    
    //CONSTRUCTOR COPIA
    public Coleccion(final Coleccion copia) {
        ejemTotales = copia.ejemTotales;
        ejemPrestados = copia.ejemPrestados;
    }
    
    //SETTERS
    public void setEjemTotales(int ejemTotales) {
        this.ejemTotales = ejemTotales;
    }

    public void setEjemPrestados(int ejemPrestados) {
        this.ejemPrestados = ejemPrestados;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    //GETTERS
    public int getEjemTotales() {
        return ejemTotales;
    }

    public int getEjemPrestados() {
        return ejemPrestados;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    //OTROS
    
    public void addBook (Libro libro){
        libros.add(libro);
    }
    
    //METODOS
            
    //METODO PRESTAMO
    public void prestamo(){
        Scanner prestar = new Scanner(System.in);
        System.out.println("Como se llama el libro que quieres coger prestado: ");
        String buscar = prestar.nextLine();
        Boolean bookExists = false;
        for(Libro libro : libros){
            if (buscar.equals(libro.getTitulo())){
               bookExists = true;
               System.out.println("¿Cuantos libros quieres coger prestados? ");
               int coger = prestar.nextInt();
               if(coger < libro.getEjem_libro()){
                   Coleccion.ejemTotales -= coger;
                   Coleccion.ejemPrestados += coger;
                   libro.setEjem_libro(libro.getEjem_libro()-coger);
                   libro.setEjem_prestado(libro.getEjem_prestado()+coger);
                   System.out.println("");
                   System.out.println("Quedan "+libro.getEjem_libro()+" ejemplares y hay "+libro.getEjem_prestado()+" prestados");
                   //METER AQUI LAS MODIFICACIONES DE LOS EJEMPLARES GLOBALES
                   
               }else{
                   System.out.println("No hay suficientes copias disponibles");
               }            
            }else{
                bookExists = false;
            }                              
        }
    }    
        
    //METODO DEVOLVER
    public void devolver(){
        Scanner vuelta = new Scanner(System.in);
        System.out.println("Como se llama el libro que quieres devolver: ");
        String buscar = vuelta.nextLine();
        Boolean bookExists = false;
        for(Libro libro : libros){
            if (buscar.equals(libro.getTitulo())){
               bookExists = true;
               System.out.println("¿Cuantos libros quieres devolver? ");
               int coger = vuelta.nextInt();
               if(coger < libro.getEjem_prestado()){
                   Coleccion.ejemTotales += coger;
                   Coleccion.ejemPrestados -= coger;
                   libro.setEjem_libro(libro.getEjem_libro()+coger);
                   libro.setEjem_prestado(libro.getEjem_prestado()-coger);
                   System.out.println("");
                   System.out.println("Quedan "+libro.getEjem_libro()+" ejemplares y hay "+libro.getEjem_prestado()+" prestados");
                   System.out.println(Coleccion.ejemTotales);
                   System.out.println(Coleccion.ejemPrestados);
               }else{
                   System.out.println("No hay tantos para devolver");
               }            
            }else{
                bookExists = false;
            }                              
        }
    }
       
    //METODO MOSTRAR
    public void enseñar(){
        Scanner localizar = new Scanner(System.in);
        System.out.println("Como se llama el libro: ");
        String buscar = localizar.nextLine();
        Boolean bookExists = false;
        for(Libro libro : libros){
            if (buscar.equals(libro.getTitulo())){
               bookExists = true;
               System.out.println("");
               System.out.println("=============LIBRO============");
               System.out.println(" Titulo: "+libro.getTitulo());
               System.out.println(" Nombre: "+libro.getAutor());
               System.out.println(" Nª Ejemplares: "+libro.getEjem_libro());
               System.out.println(" Nª Ejemplares Disponibles: "+libro.getEjem_prestado());
               System.out.println("==============================");
            }else{
                bookExists = false;
            }                              
        }                       
    }
    
    //LOCALIZAR LIBRO
    public void localizarLibro(){
        Scanner localizar = new Scanner(System.in);
        System.out.println("Cual es el ISBN del libro que quieres buscar: ");
        int buscar = localizar.nextInt();
        Boolean bookExists = false;
        for(Libro libro : libros){
            if (buscar == libro.getIsbn()){
               bookExists = true;
               System.out.println("");
               System.out.println("El libro con ISBN "+libro.getIsbn()+" se llama "+libro.getTitulo()+" y tiene"+libro.getEjem_libro()+" ejemplares disponibles.");
            }else{
                bookExists = false;
            }                              
        }                       
    }
    
    public void visualizar(){
        System.out.println("Los libros de la coleccion son:");
        System.out.println("");
        for(Libro libro : libros){
            System.out.println(libro.getTitulo());
        }
        System.out.println("");
        System.out.println("Hay "+Coleccion.ejemTotales+" libros en la coleccion y "+Coleccion.ejemPrestados+" prestados.");
    }
}                  

    


   
