package Baekjoon_Level1;
//곱셈
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		//i는 자릿수를 나타내며, 반복한번할때마다 10의 배수씩 증가한다.
		//b는 자릿수별 계산을 나타내며, b가 0초과일때만 아래 반복문이 실행된다.
		for(int i = 1; b>0; i*=10) {
			int temp = a*(b%10);
			System.out.println(temp);
			b/=10;
			result += temp*i;
		}
		System.out.println(result);
	}
}
