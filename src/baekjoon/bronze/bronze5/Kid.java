package baekjoon.bronze.bronze5;
//²¿¸¶ Á¤¹Î
import java.math.BigInteger;
import java.util.Scanner;

public class Kid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		sc.close();
		
		System.out.println(a.add(b).add(c));
	}

}
