
package Practica_3;

import java.util.Scanner;


public class Cuenta {
    private String Nombre;
    private String Numero;
    private Double Interes;
    private Double Saldo;
    
    //CONSTRUCTOR POR DEFECTO
    public Cuenta(){
    }
    
    //CONSTRUCTOR CON TODOS LOS PARÁMETROS
    public Cuenta(String NombreCliente, String NumeroCuenta, Double TipoInteres, Double Saldo) {
        this.Nombre = NombreCliente;
        this.Numero = NumeroCuenta;
        this.Interes = TipoInteres;
        this.Saldo = Saldo;
    }
    
    //CONSTRUCTOR COPIA
    public Cuenta (final Cuenta copia){
        Nombre = copia.Nombre;
        Numero = copia.Numero;
        Interes = copia.Interes;
        Saldo = copia.Saldo;
    }
    
    //SETTERS
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setInteres(Double Interes) {
        this.Interes = Interes;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
    
    //GETTERS
    public String getNombre() {
        return Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    public Double getInteres() {
        return Interes;
    }

    public Double getSaldo() {
        return Saldo;
    }
    
    //METODOS
        
    //METODO INTRODUCIR DATOS
    public void datos_clientes(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre=entrada.nextLine();
        this.Nombre=nombre;
        System.out.println("Introduce tu número de cuenta: ");
        String cuenta=entrada.nextLine();
        this.Numero=cuenta;
        System.out.println("Introduce tu interés anual: ");
        double interes=entrada.nextInt();
        this.Interes=interes;
        System.out.println("Introduce tu saldo inicial: ");
        double saldoinicial=entrada.nextInt();
        this.Saldo=saldoinicial;               
    }    
        
    //METODO DE INGRESO
    public boolean ingreso (double hacer_ingreso){
        boolean ingreso_valido = true;
        if (hacer_ingreso < 0 && hacer_ingreso<Saldo){
                ingreso_valido = false;
        } else {
            Saldo += hacer_ingreso;
        }
        return ingreso_valido;
        }
    
    //METODO DE REINTEGRO
    public boolean reintegro(double retirar_dinero) {
        boolean reintegro_valido = true;
        if (retirar_dinero < 0) {
            reintegro_valido = false;
        } else if (Saldo >= retirar_dinero) {
            Saldo -= retirar_dinero;
        } else {
            reintegro_valido = false;
        }
        return reintegro_valido;
    }
    
    //METODO TRANSFERENCIA
    public boolean transferencia(Cuenta cuenta_destino, double importe) {
        boolean correcto = true;
        if (importe < 0) {
            correcto = false;
        } else if (Saldo >= importe) {
            reintegro(importe);
            cuenta_destino.ingreso(importe);
        } else {
            correcto = false;
        }
        return correcto;
    }    
    
}