package baekjoon.bronze.bronze5;

//Å« ¼ö A+B
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		sc.close();
		
		System.out.println(a.add(b));
	}

}
