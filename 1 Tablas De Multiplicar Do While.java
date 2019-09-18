import jeliot.io.*.;
public class TablaDoWhile{
    public static void main() {
        int x=1;
        do{
            int y=1;
            do{
                System.out.println(x+"x"+y+"="+x*y);
                y++;
            }while(y<=10);
            x++;
        }while (x<=10);
   }
}