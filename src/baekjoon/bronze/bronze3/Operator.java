package baekjoon.bronze.bronze3;
//부호
import java.math.BigInteger;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger total = new BigInteger("0");
        for(int i = 0; i<3; i++){
            total = BigInteger.valueOf(0);
            int n = sc.nextInt();
            for(int j = 0; j<n; j++){
                total = total.add(sc.nextBigInteger());
            }
            //System.out.println("총합 : " + total);
            if(total.compareTo(BigInteger.valueOf(0))==1) System.out.println("+");
            else if(total.compareTo(BigInteger.valueOf(0))==-1) System.out.println("-");
            else System.out.println("0");
        }
    }
}
