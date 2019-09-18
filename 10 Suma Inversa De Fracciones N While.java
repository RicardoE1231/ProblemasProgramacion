import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int x, den = 0, den2, num;
 
   System.out.println("Valor Del Denominador:");
   den = in.nextInt();
   num = 1;
   den2 = 1;
   if(den>0){
   x=2;
       while(x<=den){
        num = ((den2*1)+(num*x));
        den2 = (den2*x);
        
        x++;
       }
        System.out.println("Suma es: "+num+"/"+den2);            
   }else{
   System.out.println("¡¡ Ingrese Un Número Mayor A Cero !!");
  }
  }
}
