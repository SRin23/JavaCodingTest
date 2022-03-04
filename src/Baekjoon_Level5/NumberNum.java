package Baekjoon_Level5;
//숫자의 개수
import java.util.Scanner;

public class NumberNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt()*sc.nextInt()*sc.nextInt();
		sc.close();
		
		int num[] = new int[10];
		while(result>0) {
			num[result%10]++;
			result/=10;
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println(num[i]);
		}
	}

}
