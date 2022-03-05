package baekjoon.level.level2;
//À±³â
import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		int result = 0;
		if(year%4==0) {
			if(year%100!=0||year%400==0) {
				result = 1;
			}
		}
		else result = 0;
	
		System.out.println(result);
	}

}
