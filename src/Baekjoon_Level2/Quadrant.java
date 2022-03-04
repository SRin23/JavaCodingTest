package Baekjoon_Level2;
//사분면고르기
import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int  y = sc.nextInt();
		sc.close();
		
		int choice = 0;
		
		if(x>0) {
			if(y>0) {
				choice = 1;
			}else {
				choice = 4;
			}
		}else {
			if(y>0) {
				choice = 2;
			}else {
				choice = 3;
			}
		}
		System.out.print(choice);
	}

}
