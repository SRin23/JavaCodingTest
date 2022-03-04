package Baekjoon_Level2;
//두 수 비교하기
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String operator;
		
		if(a>b) {
			operator = ">";
		}else if(a<b) {
			operator = "<";
		}else {
			operator = "==";
		}
		
		System.out.println(operator);
	}

}
