package baekjoon.level.level2;
//알람시계
import java.util.Scanner;

public class AlertClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		if(minute<45) {
			hour--;
			minute = 60-(45-minute);
			if(hour < 0) {
				hour = 23;
			}
		}else {
			minute-=45;
		}
		System.out.println(hour + " " + minute);		
	}

}
