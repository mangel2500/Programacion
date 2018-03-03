
package Practica_6;

import java.util.Scanner;


final class Comercial extends Empleado{
    
    private int comision;
    
    //CONSTRUCTOR POR DEFECTO
    public Comercial() {
    }
    
    ///CONSTRUCTOR COPIA
    public Comercial(Empleado copia) {
        super(copia);
    }
       
    //SETTERS
    public void setComision(int comision) {
        this.comision = comision;
    }
        
    //GETTERS
    public int getComision() {
        return comision;
    }
    
    //METODOS
    
    //PEDIR ALTA COMERCIAL
    @Override
    public void añadir(){
        super.añadir();
        Scanner entradaComercial = new Scanner(System.in);
        System.out.print("Introduce la comision: ");
        int comision=entradaComercial.nextInt();
        this.comision=comision;
        System.out.println("");
    }       
    
    //MOSTRAR DATOS COMERCIAL
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Comision: "+this.getComision()+"%");
    }
    
}
