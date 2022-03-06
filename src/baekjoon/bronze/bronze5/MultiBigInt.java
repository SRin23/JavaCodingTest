package baekjoon.bronze.bronze5;
//Å« ¼ö °ö¼À
import java.math.BigInteger;
import java.util.Scanner;

public class MultiBigInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		sc.close();
		
		System.out.println(a.multiply(b));
	}

}
