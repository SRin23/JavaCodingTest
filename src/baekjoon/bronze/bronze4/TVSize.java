package baekjoon.bronze.bronze4;
//TV 크기
import java.util.Scanner;

public class TVSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		
		double a = Math.sqrt(Math.pow(d, 2)/(Math.pow(h, 2) + Math.pow(w, 2)));
		System.out.println((int)(h*a) + " " + (int)(w*a));
	}

}
