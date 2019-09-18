import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int numUno = 0, numDos = 0, div= 0, y = 0, x;

   System.out.print("Multiplos De: ");
   div = in.nextInt();
   
   System.out.print("Dame el primer valor: ");
   numUno = in.nextInt();

   System.out.print("Dame el segundo valor: ");
   numDos = in.nextInt();
        if(numUno>numDos){
                System.out.println("¡En el segundo valor ingrese un número mayor al primer valor!");
        }
   x=numUno;
   while(x<numDos){
      if(x%div==0){ 
      y=y+x;      
        System.out.println(y);
        x++;
      } else{ 
       x++;    
      }
   
   }
    System.out.println("La suma de todos los multiplos de "+div+" es: "+y);    
  
 }
}  
