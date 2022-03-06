package baekjoon.bronze.bronze5;

import java.util.Scanner;

public class PartyIsOver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int person = sc.nextInt();
		int area = sc.nextInt();
		
		
		for(int i = 0; i<5; i++) {
			int newArea = sc.nextInt();
			System.out.println(newArea - person*area);
		}
		sc.close();
	}

}
