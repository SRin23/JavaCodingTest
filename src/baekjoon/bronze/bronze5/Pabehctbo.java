package baekjoon.bronze.bronze5;

//PABEHCTBO
import java.math.BigInteger;
import java.util.Scanner;

public class Pabehctbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        System.out.println((b.subtract(c)).divide(a));
    }
}
