package baekjoon.bronze.bronze4;
//사파리 월드
import java.math.BigInteger;
import java.util.Scanner;

public class SafariWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger domain1 = sc.nextBigInteger();
		BigInteger domain2 = sc.nextBigInteger();
		sc.close();
		
		BigInteger result = domain1.subtract(domain2);
		System.out.println(result.abs());
	}

}
