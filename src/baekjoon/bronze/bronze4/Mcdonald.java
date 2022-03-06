package baekjoon.bronze.bronze4;
//상근날드
import java.util.Scanner;

public class Mcdonald {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int high = sc.nextInt();
		int mid = sc.nextInt();
		int low = sc.nextInt();
		int coke = sc.nextInt();
		int sprite = sc.nextInt();
		sc.close();
		
		int result = -50;
		result += Math.min(Math.min(high, mid), low);
		result += Math.min(coke, sprite);
	
		System.out.println(result);
	}

}
