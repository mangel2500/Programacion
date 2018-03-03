
package Practica_6;

import java.util.Scanner;


public class Practica_6 {
    
    public static void main(String[]args){
        Scanner principal = new Scanner (System.in);
            int opcion = 0;
            do{
                System.out.println("============================");
                System.out.println("=           MENU           =");
                System.out.println("============================");
                System.out.println("=   1. Dar de Alta         =");
                System.out.println("=   2. Mostrar Atributos   =");
                System.out.println("=   3. Salir               =");
                System.out.println("============================");
                System.out.print("Selecciona una opción: "); 
                opcion = principal.nextInt();
                System.out.println("");
                
                switch (opcion){
                    case 1://DAR DE ALTA
                    int opcionDar = 0;
                    do{
                        System.out.println("=======================");
                        System.out.println("=     DAR DE ALTA     =");
                        System.out.println("=======================");
                        System.out.println("=   1. Empleado       =");
                        System.out.println("=   2. Comercial      =");
                        System.out.println("=   3. Repartidor     =");                        
                        System.out.println("=   4. Salir          =");
                        System.out.println("=======================");
                        System.out.print("Selecciona una opción: "); 
                        opcionDar = principal.nextInt();
                        System.out.println("");
                
                        switch (opcionDar){
                            case 1://DAR DE ALTA EMPLEADO
                                Empleado empleadoNuevo  = new Empleado();
                                System.out.println("Introduce los datos del comercial nuevo: ");
                                empleadoNuevo.añadir();
                                System.out.println("");
                            break;

                            case 2://DAR DE ALTA COMERCIAL
                                Comercial comercialNuevo  = new Comercial();
                                System.out.println("Introduce los datos del comercial nuevo: ");
                                comercialNuevo.añadir();
                                System.out.println("");
                            break;     
                            
                            case 3://DAR DE ALTA REPARTIDOR
                                Repartidor repartidorNuevo  = new Repartidor();
                                System.out.println("Introduce los datos del repartidor nuevo: ");
                                repartidorNuevo.añadir();
                                System.out.println("");
                            break;
                            
                            default:
                        }
                        }while (opcionDar < 4); 
                    break;
                        
                    case 2://MOSTRAR ATRIBUTOS
                        Scanner mostrarAtri = new Scanner (System.in);
                        System.out.println("Introduce el NIF de la persona: ");
                        String nifCorrecto = mostrarAtri.nextLine();
                        for(Empleado a : Empleado.getEmpleadosGlobales()){
                            if(nifCorrecto.equals(a.getNif())){
                                System.out.println("");
                                a.mostrar();
                                System.out.println("");
                            }
                        }
                        
                    break;     
                    
                    default:
                        System.out.println("Hasta la vista");
                }
            }while (opcion < 3); 
    }

}
