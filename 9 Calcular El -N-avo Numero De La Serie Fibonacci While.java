import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){
  
    Scanner in = new Scanner(System.in);
    int cont, fibo1, fibo2, x;

    System.out.println("Ingrese Un N�mero: ");
    cont = in.nextInt();
      if(cont<1){
        System.out.println("�Ingrese Un N�mero Mayor A Cero!");
      }else{
      System.out.println("Los " +cont+ " primeros t�rminos de la serie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        x = 2;
        while(x<=cont){
        System.out.print(fibo2 + " ");
        fibo2 = fibo1 + fibo2;
        fibo1 = fibo2 - fibo1;
        x++;              
        }
        System.out.println("\nEl n�mero " +cont+ " en la serie Fibonacci es: "+fibo1);
     }
 }
} 

