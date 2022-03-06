package baekjoon.bronze.bronze5;
//A+B-9
import java.math.BigInteger;
import java.util.Scanner;

public class SumABMinus9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		sc.close();
		
		System.out.println(a.add(b));
	}

}
