
package Practica_3;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[]args) {
        
        //ENTRADA DE LOS DATOS DE LOS DOS CLIENTES
        Cuenta Cliente1 = new Cuenta();
        Cuenta Cliente2 = new Cuenta();
        System.out.println("Bienvenido, introduce los datos del primer cliente: ");
        Cliente1.datos_clientes();
        System.out.println("");
        System.out.println("Introduce los datos del segundo cliente:");
        Cliente2.datos_clientes();
        System.out.println("");
        //IMPRESION DE LOS DATOS INRODUCIDOS
        System.out.println("=====CLIENTE 1=======");
        System.out.println(" Nombre: "+Cliente1.getNombre());
        System.out.println(" Nº Cuenta: "+Cliente1.getNumero());
        System.out.println(" Tipo Interes: "+Cliente1.getInteres());
        System.out.println(" Saldo Actual: "+Cliente1.getSaldo()+" €.");
        System.out.println("");
        System.out.println("=====CLIENTE 2=======");
        System.out.println(" Nombre: "+Cliente2.getNombre());
        System.out.println(" Nº Cuenta: "+Cliente2.getNumero());
        System.out.println(" Tipo Interes: "+Cliente2.getInteres());
        System.out.println(" Saldo Actual: "+Cliente2.getSaldo()+" €.");
        System.out.println("");
        
        //MENU PRINCIPAL
        Scanner read = new Scanner(System.in);
        read = new Scanner (System.in);
        
        //MENU SELECCION DEL CLIENTES
        int opcion_menu1 = 0;
        do{
            System.out.println("");
            System.out.println("=====================");
            System.out.println("=    1.Cliente 1    =");
            System.out.println("=    2.Cliente 2    =");
            System.out.println("=    3.Salir        =");
            System.out.println("=====================");
            System.out.println("Selecciona una opción: ");
            opcion_menu1 = read.nextInt();
        //MENU SELECCIÓN OPERACIÓN
            switch (opcion_menu1){
                case 1://CLIENTE 1
                    int opcion_menu2_c1 = 0;
                    do {
                        System.out.println("");
                        System.out.println("Que operación desea realizar "+Cliente1.getNombre()+": ");
                        System.out.println("===================================");
                        System.out.println("=      1.Realizar un ingreso      =");
                        System.out.println("=      2.Retirar dinero           =");
                        System.out.println("=      3.Hacer una transferencia  =");
                        System.out.println("=      4.Volver atras             =");
                        System.out.println("===================================");
                        System.out.println("Selecciona una opción: ");
                        opcion_menu2_c1 = read.nextInt();
                        switch (opcion_menu2_c1){
                            case 1://INGRESAR DINERO  CLIENTE 1
                                Scanner ingresar = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente1.getNombre()+" ¿Qué cantidad quieres ingresar?");
                                double cantidad_ingresar = ingresar.nextDouble();
                                Cliente1.ingreso(cantidad_ingresar);
                                System.out.println("Tu saldo actual es "+Cliente1.getSaldo()+"€.");
                                break;
                                
                            case 2://RETIRAR DINERO CLIENTE 1
                                Scanner retirar = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente1.getNombre() + " ¿Qué cantidad quieres retirar? ");
                                double retirardinero = retirar.nextDouble();
                                Cliente1.reintegro(retirardinero);
                                System.out.println("Tu saldo actual es "+Cliente1.getSaldo()+"€.");
                                break;
                                
                            case 3://TRANSFERENCIA CLIENTE 1
                                Scanner transferir = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente2.getNombre() + " ¿Qué cantidad quieres transferir de tu cuenta a la cuenta de " + Cliente1.getNombre() + "? ");
                                double transferirdinero = transferir.nextDouble();
                                Cliente2.transferencia(Cliente1,transferirdinero);
                                System.out.println(Cliente2.getNombre() + " Ha transferido " + transferirdinero + " € a la cuenta de " + Cliente1.getNombre()+"€.");
                                System.out.println("Saldo actual de " + Cliente2.getNombre() + " es: " + Cliente2.getSaldo());
                                System.out.println("Saldo actual de " + Cliente1.getNombre() + " es: " + Cliente1.getSaldo());
                                break;
                                
                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }                 
                    } while (opcion_menu2_c1 < 3);
                    break;
                    
                case 2://CLIENTE 2
                    int opcion_menu2_c2 = 0;
                    do {
                        System.out.println("");
                        System.out.println("Que operación desea realizar "+Cliente2.getNombre()+": ");
                        System.out.println("===================================");
                        System.out.println("=      1.Realizar un ingreso      =");
                        System.out.println("=      2.Retirar dinero           =");
                        System.out.println("=      3.Hacer una transferencia  =");
                        System.out.println("=      4.Volver atras             =");
                        System.out.println("===================================");
                        System.out.println("Selecciona una opción: ");                        
                        opcion_menu2_c2 = read.nextInt();
                        switch (opcion_menu2_c2){
                            case 1://INGRESAR DINERO  CLIENTE 2
                                Scanner ingresar = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente2.getNombre()+" ¿Qué cantidad quieres ingresar?");
                                double cantidad_ingresar = ingresar.nextDouble();
                                Cliente1.ingreso(cantidad_ingresar);
                                System.out.println("Tu saldo actual es "+Cliente2.getSaldo()+"€.");
                                break;
                                
                            case 2://RETIRAR DINERO CLIENTE 2
                                Scanner retirar = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente2.getNombre() + " ¿Qué cantidad quieres retirar? ");
                                double retirardinero = retirar.nextDouble();
                                Cliente1.reintegro(retirardinero);
                                System.out.println("Tu saldo actual es "+Cliente2.getSaldo()+"€.");
                                break;
                                
                            case 3://TRANSFERENCIA CLIENTE 2
                                Scanner transferir = new Scanner(System.in);
                                System.out.println("");
                                System.out.println(Cliente1.getNombre() + " ¿Qué cantidad quieres transferir de tu cuenta a la cuenta de " + Cliente2.getNombre() + "? ");
                                double transferirdinero = transferir.nextDouble();
                                Cliente1.transferencia(Cliente2,transferirdinero);
                                System.out.println(Cliente1.getNombre() + " Ha transferido " + transferirdinero + " € a la cuenta de " + Cliente2.getNombre());
                                System.out.println("Saldo actual de " + Cliente1.getNombre() + " es: " + Cliente1.getSaldo());
                                System.out.println("Saldo actual de " + Cliente2.getNombre() + " es: " + Cliente2.getSaldo());
                                break;
                                
                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }
                        
                    } while (opcion_menu2_c2 < 3);
                    break;
            }           
        }while (opcion_menu1 < 3);
    }
}
