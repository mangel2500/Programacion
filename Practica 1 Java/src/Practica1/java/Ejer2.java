
package Practica1.java;

import java.util.Scanner;

public class Ejer2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t[];
        t = new int[5];
        for (int i =0;i<5; i++) {
            System.out.println("Intoduce otro numero:");
            t[i] = sc.nextInt();
        }       
        System.out.println("Los numeros son: ");
        for (int i = t.length-1;i>=0;i--) {
            System.out.print(t[i]+"-");
        }
    }
    

}
