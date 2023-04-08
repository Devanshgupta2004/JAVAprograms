import java.util.Scanner;
public class plandrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        check(p);

    }
    static void check(String input){
        boolean f= true;
        int len=input.length();
        for(int i=0; i<= len/2; i++) {
            if(input.charAt(i) != input.charAt(len-i-1)){
                f=false;
                break;
            }
        }
        System.out.print(input +" is plandrom "+f);
    }   
}
