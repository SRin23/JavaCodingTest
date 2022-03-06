package baekjoon.bronze.bronze1;
//ÆÓ¸°µå·Ò¼ö
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num==0) break;
			else {
				int renum = reverse(num);
				if(num==renum) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
		sc.close();
	}

	public static int reverse(int num) {
		int result = 0;
		while(num>0) {
			result*=10;
			result += (num%10);
			num/=10;
		}
		return result;
	}
}
