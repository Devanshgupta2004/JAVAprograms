import java.util.Scanner;
public class table {
    public static void main(String[] args){
        int d,a=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter table ");
        int x= s.nextInt();
        while(a<=10){
            d=x*a;
            System.out.println(x+"*"+ a + "=" + d);
            a++;


        }


    }
    
}
