package Baekjoon_Level1;
//����
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		//i�� �ڸ����� ��Ÿ����, �ݺ��ѹ��Ҷ����� 10�� ����� �����Ѵ�.
		//b�� �ڸ����� ����� ��Ÿ����, b�� 0�ʰ��϶��� �Ʒ� �ݺ����� ����ȴ�.
		for(int i = 1; b>0; i*=10) {
			int temp = a*(b%10);
			System.out.println(temp);
			b/=10;
			result += temp*i;
		}
		System.out.println(result);
	}
}
