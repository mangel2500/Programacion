
package Practica_6;

import java.util.Scanner;


final class Repartidor extends Empleado {
    
    private String zona;
    
    //CONSTRUCTOR POR DEFECTO
    public Repartidor(){
    }
    
    //CONSTRUCTOR COPIA
    public Repartidor(Empleado copia) {
        super(copia);
    }
    
    //SETTERS
    public void setZona(String zona) {
        this.zona = zona;
    }
    
    //GETTERS
    public String getZona() {
        return zona;
    }
       
    //METODOS
    
    //PEDIR ALTA REPARTIDOR
    @Override
    public void añadir(){
        super.añadir();
        Scanner entradaRepartidor = new Scanner(System.in);
        System.out.print("Introduce la zona: ");
        String zona=entradaRepartidor.nextLine();
        this.zona=zona;
        System.out.println("");
    }  
    
    //MOSTRAR DATOS REPARTIDOR
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Zona: "+this.getZona());
    }

}
