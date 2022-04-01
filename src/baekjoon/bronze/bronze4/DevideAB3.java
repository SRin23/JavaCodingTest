package baekjoon.bronze.bronze4;
//A/B-3
import java.math.BigInteger;
import java.util.Scanner;

public class DevideAB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        if(a.signum()==-1&&b.signum()==-1){
            System.out.println(a.divide(b).add(BigInteger.ONE));
            System.out.println(a.remainder(b).subtract(b));
        }else if(a.signum()==-1&&b.signum()==1){
            System.out.println(a.divide(b).subtract(BigInteger.ONE));
            System.out.println(a.remainder(b).add(b));
        }else{
            System.out.println(a.divide(b));
            System.out.println(a.remainder(b));
        }

    }
}
