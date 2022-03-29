package baekjoon.bronze.bronze4;
//FA
import java.math.BigInteger;
import java.util.Scanner;

public class Fa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        //모든값이 FA값이다
        //NFA는 있을 수 없다(끝에는 같은수가 결국 게속해서 반복될수 밖에 없다)
        System.out.println("FA");
    }
}