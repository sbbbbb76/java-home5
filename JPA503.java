package javh5;
import java.util.Scanner;
public class JPA503 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        while(true){
            System.out.print("Input m: ");
            int m = c.nextInt();
            if(m==999){
                break;
            }
            System.out.print("Input n: ");
            int n = c.nextInt();
            int max = 1;
    
        for (int i = 2; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                max = i;
            }
        }
        System.out.printf("最大公因數=%d\n",max);
        }

    }
}
