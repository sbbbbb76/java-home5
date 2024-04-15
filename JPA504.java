package javh5;
import java.util.Scanner;
public class JPA504 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Input the number: ");
        int m = c.nextInt();
        System.out.printf("Ans: %d",sum2(m));
    }
    public static int sum2(int m) {
        int sum = 0;
        if(m==1){
            return 2;
        }else{
            sum +=sum2(m-1)+2*m;
            return sum;
        }

    }

}
