package baekjoon.level.level3;
//합
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = 0;
		for(int i = 1; i<=n; i++) {
			result+=i;
		}
		System.out.println(result);
	}

}
