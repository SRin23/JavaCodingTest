package baekjoon.bronze.bronze5;
//카드 게임
import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		for(int i = 0; i<5; i++){
			result+=sc.nextInt();
		}
		sc.close();
		System.out.println(result);
	}
}
