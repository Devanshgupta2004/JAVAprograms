import java.util.Scanner;

public class even {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int x= scan.nextInt();
        if(x%2==0){
            System.out.println("Even he "+ x);

        }
        else{
            System.out.println("odd he "+ x);
        }
    }
    
}
