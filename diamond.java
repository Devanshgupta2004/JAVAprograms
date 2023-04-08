import java.util.Scanner;
public class diamond {
    public static void main(String args[]){
        System.out.print("Enetr number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            for (int j=0;j<num-i;j++){
                System.out.print(" "); }
            for (int j=0;j<i;j++) {
                System.out.print("*");}
            for(int j=0;j<i-1;j++){
                System.out.print("*");
            } 
            System.out.println();   
            }
        for (int i=num;i>0;i--){
            for (int j=0;j<num-i;j++){
                    System.out.print(" "); }
            for (int j=0;j<i;j++) {
                    System.out.print("*");}
            for(int j=0;j<i-1;j++){
                    System.out.print("*");
                } 
            System.out.println();   
                }    


    }
    
}
