package baekjoon.bronze.bronze5;
//비와이버스
import java.util.Scanner;

public class BewhYBus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int station = sc.nextInt();
		int person = sc.nextInt();
		
		for(int i = 0; i<station; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(start + end);
		}
		System.out.println(person);
		sc.close();
		System.out.println("비와이");
	}

}
