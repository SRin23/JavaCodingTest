package baekjoon.bronze.bronze5;
//R2
import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r1 = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		
		System.out.println((s*2) - r1);
	}

}
