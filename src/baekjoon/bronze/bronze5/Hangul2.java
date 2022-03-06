package baekjoon.bronze.bronze5;
//한글2
import java.util.Scanner;

public class Hangul2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0);
		sc.close();
		System.out.println(word - 44032 + 1);
		//'가'의 아스키 코드  44032를 이용
	}
}
