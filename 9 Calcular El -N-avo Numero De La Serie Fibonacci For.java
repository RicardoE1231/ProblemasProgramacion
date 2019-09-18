import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){
  
    Scanner in = new Scanner(System.in);
    int cont, n, n1;

    System.out.println("Ingrese Un Número: ");
    cont = in.nextInt();
       if(cont<1){
        System.out.println("¡Ingrese Un Número Mayor A Cero!");
       }else{
        System.out.println("Los " +cont+ " primeros términos de la serie de Fibonacci son:");

        n=1;
        n1=1;

        System.out.print(n + " ");
        for(int x=2; x<=cont; x++){
             System.out.print(n1 + " ");
             n1 = n + n1;
             n = n1 - n;
        }
        System.out.println("\nEl número " +cont+ " en la serie Fibonacci es: "+n);
        }
 }
} 
