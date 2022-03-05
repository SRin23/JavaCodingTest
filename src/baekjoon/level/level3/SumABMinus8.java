package baekjoon.level.level3;
//A+B-8
import java.util.Scanner;

public class SumABMinus8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
		sc.close();
		
	}

}
