import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        int d=1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number");
        int fact=s.nextInt();
        while(fact>0){
            d*=fact;
            fact--;    }
        System.out.print(d);    


    }
}
