package Baekjoon_Level3_forStatement;
//x���� ���� �� 
import java.util.Scanner;

public class SmallerThanX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		for(int i = 0; i<n; i++) {
			int temp = sc.nextInt();
			if(x > temp) System.out.print(temp + " ");
		}
		sc.close();
	}

}
