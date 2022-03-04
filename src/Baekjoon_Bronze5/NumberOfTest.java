package Baekjoon_Bronze5;
//°ËÁõ ¼ö
import java.util.Scanner;

public class NumberOfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(int i = 0; i<5; i++) {
			result += Math.pow(sc.nextInt(), 2);
		}
		sc.close();
		System.out.println(result%10);
		
	}

}
