package baekjoon.bronze.bronze2;
//분해합
//101x + 11y + 2z = 분해합의 생성자
import java.util.Scanner;

public class DecompositionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int x = 0;
		int y = 0; 
		int z = 0;
		
		if(n >= 101) {
			x = n/101;
			n = n-(101*x);
		}
		if(n >= 11) {
			y = n/11;
			n = n-(11*y);
		}
		if(n > 0) {
			z = n/2;
		}
		
		System.out.println(x + " " + y + " " + z);
		System.out.println(x*100+y*10+z);
	}

}
