
package Practica_1;

import java.util.*;

public class Ejer3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0;
        int[] numeros = new int[5];
        double sumaPos = 0, sumaNeg = 0;
        int contador=0;
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 5; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                neg++;
            }
        }
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
        for (int j = 0;j < numeros.length; j++) {
            if (numeros[j]==0){
                contador=contador+1;
            }
        }
        System.out.println("Contiene "+contador+" ceros");
    }
}