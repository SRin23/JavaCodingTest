package baekjoon.bronze.bronze5;
//이상한 기호
import java.math.BigInteger;
import java.util.Scanner;

public class StrangeOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println((a.add(b)).multiply(a.subtract(b)));
    }
}
