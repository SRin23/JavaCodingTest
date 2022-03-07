package baekjoon.level.level4;
//반복합
import java.util.Scanner;

public class SumCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int i = 0;
		int temp = n;
		
		while(n!=result) {
			temp = (temp/10%10) + (temp%10);
			result = (n%10)*10 + (result%10);
		}
		
		
	}

}
