package baekjoon.bronze.bronze3;
//분산처리 -> eof 넘어감 -> 해결
import java.math.BigInteger;
import java.util.Scanner;

public class Dispersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            BigInteger work = BigInteger.valueOf((long)Math.pow(a, b));

            if(work.remainder(BigInteger.valueOf(10))==BigInteger.valueOf(10)){
                System.out.println(10);
            }else{
                System.out.println(work);
                System.out.println(work.remainder(BigInteger.valueOf(10)));
            }

        }
    }
}
