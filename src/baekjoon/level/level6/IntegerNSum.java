package baekjoon.level.level6;
//정수 n개의 합
import java.util.Scanner;

public class IntegerNSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static long sum(int[] a) {
		long result = 0;
		for(int i = 0; i<a.length; i++) {
			result+=a[i];
		}
		return result;
	}
}

