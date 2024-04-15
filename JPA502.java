package javh5;
import java.util.Scanner;
public class JPA502 {
    public static void main (String[] args){
        Scanner c = new Scanner(System.in);
        while(true){
            System.out.print("Input n ( 0<=n<=16 ): ");
            int n=c.nextInt();
            if(n==999){
                break;
            }
            int b=1;
            int sum=1;
            for (int i=1; i<=n;i++){
                sum*=i;
            }
            System.out.printf("%d的階乘(遞迴)=%d\n",n,sum);
            System.out.printf("%d的階乘(尾遞迴)=%d\n",n,facTail(n,b));
        }
    }
    public static int facTail(int a,int b) {
        if (a==1) {
            return b;
        }else{
            return facTail(a-1,a*b);
        }
    }
}


