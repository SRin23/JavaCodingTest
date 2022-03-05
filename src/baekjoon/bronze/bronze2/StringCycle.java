package baekjoon.bronze.bronze2;
//문자열 반복
import java.util.Scanner;

public class StringCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			sc.close();
			for(int j = 0; j<s.length(); j++) {
				for(int k = 0; k<r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
