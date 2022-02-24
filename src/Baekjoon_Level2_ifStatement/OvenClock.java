package Baekjoon_Level2_ifStatement;

import java.util.Scanner;

public class OvenClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int time = sc.nextInt();
		sc.close();
		
        int rs = minute + time;
        
        while(rs>=60){
            if(rs>=60) {
			    hour++;
			    if(hour>=24) hour = 0;
			    rs = rs-60;
		    }
        }
		
		System.out.println(hour + " " + rs);
	}
}
