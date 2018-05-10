package Ejercicio_7_2;


import java.util.Scanner;

public class main {

    public static void main(String[] args) throws excepcion{
        try {
            convertirenbase();
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }

    }

    public static void convertirenbase() throws excepcion {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int x = sn.nextInt();
            for (int i = 2; i <= 16; i++) {
                System.out.println("" + x + " en base " + i + " es " + Integer.toString(x, i));
            }
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }

}

