import java.util.ArrayList;
import java.util.Scanner;

public class JPA501 {
    public static void main (String[] args){
        Scanner d = new Scanner(System.in);
        while(true){
            int sum =1 ;
            System.out.println("Input n (0>=n<=16): ");
            int n = d.nextInt();
            if (n<= 16 && n>0){
                for (int i = 1; i<=n;i++){
                    sum*=i;
                }
                System.out.println(n+"的階層= "+sum);
            }else if(n==0){
                System.out.println(n+"的階層= 1");
            }else if(n==999){
                break;
            }
        }
}
}