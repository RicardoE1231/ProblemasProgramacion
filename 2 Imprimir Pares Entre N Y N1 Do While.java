import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int numUno = 0, numDos = 0, x;

   System.out.println("Dame el primer valor:");
   numUno = in.nextInt();

   System.out.println("Dame el segundo valor:");
   numDos = in.nextInt();
        if(numUno>numDos){
                System.out.println("¡En el segundo valor ingrese un número mayor al primer valor!");
        }
   x=numUno;
   do{
        if(x%2==0){
                System.out.println(x);
                x++;  
        }else{ 
                x++;      
        }
      
   }while(x<=numDos);     

 }
} 
