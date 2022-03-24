package baekjoon.bronze.bronze2;
//È¦¼öÀÏ±î Â¦¼öÀÏ±î

import java.math.BigInteger;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            BigInteger num = sc.nextBigInteger();
            if(num.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
