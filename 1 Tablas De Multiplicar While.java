
import jeliot.io.*;
public class TablaWhile{
    public static void main() {
        int x=1;
        while (x<=10){
            int y=1;
            while(y<=10){
                System.out.println(x+"x"+y+"="+x*y);
                y++;
               }
               x++;
           }
    }
}