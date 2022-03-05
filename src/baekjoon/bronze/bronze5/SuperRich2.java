package baekjoon.bronze.bronze5;

//엄청난 부자2
import java.math.BigInteger;
import java.util.Scanner;

public class SuperRich2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		sc.close();
		System.out.println(n.divide(m));
		System.out.println(n.mod(m));
	}

}
