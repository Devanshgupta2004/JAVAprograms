import java.util.Scanner;
public class fabonnaci {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int du=s.nextInt();
        int a=0,b=1,d=1;
        System.out.print(a+" "+b);
        while(du>0){
            d=(a+b);
            a=b;
            b=d;
            
            System.out.print(" "+d);
            du--;


        }

    }
    
}
