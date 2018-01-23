
package Practica1.java;

import java.util.Scanner;

public class Ejer6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] tabla1=new int[10];
        int[] tabla2=new int[10];
        int[] tabla3=new int[20];
        int contador1=0;
        int contador2=0;
        System.out.println("Dime la primera tabla: ");
        for (int i =0;i<10; i++) {
            System.out.println("Intoduce otro numero:");
            tabla1[i] = sc.nextInt();
        }
        System.out.println("Dime la segunda tabla: ");
         for (int i =0;i<10; i++) {
            System.out.println("Intoduce otro numero:");
            tabla2[i] = sc.nextInt();
        } 
        for(int i=0;i<20;i+=2){
            tabla3[i]=tabla1[contador1];
            contador1++;
        } 
        for(int j=0;j<20;j+=2){
            tabla3[j+1]=tabla2[contador2];
            contador2++;
        }
        for(int z=0;z<20;z++){
            System.out.print("La tabla3 es: "+tabla3[z]);
        }
  }
}
