package baekjoon.level.level3;
//����� -2
import java.util.Scanner;

public class DrawStar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i<=n; i++) {
			for(int j = n-i; j>0; j--) {
				System.out.print(" ");	//���� �׸���
			}
			for(int k = 0; k<i; k++) {
				System.out.print("*");	//�� �׸���
			}
			System.out.println();
		}
	}

}
