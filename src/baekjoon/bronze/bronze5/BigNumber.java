package baekjoon.bronze.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger birth = new BigInteger("20000303");
		sc.close();
		System.out.println(n.remainder(birth));
	}

}
