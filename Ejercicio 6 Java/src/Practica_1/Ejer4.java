
package Practica_1;

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t[];
        int contador = 1;
        t = new int[10];
        for (int i =0;i<10; i++) { 
            System.out.println("Intoduce el "+contador+" numero:");
            t[i] = sc.nextInt();
            contador=contador+1;
        } 
        System.out.println("Los numeros son:");
        System.out.println(t[0]+"-"+t[9]+"-"+t[1]+"-"+t[8]+"-"+t[2]);
    }
}

