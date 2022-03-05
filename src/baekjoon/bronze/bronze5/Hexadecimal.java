package baekjoon.bronze.bronze5;

import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexadecimal = sc.next();
		sc.close();
		
		int result = 0;
		for(int i = hexadecimal.length(); i>=1; i--) {
			int tmp = 0;
			switch(hexadecimal.charAt(i-1)) {
			case 'A' : tmp = 10; break;
			case 'B' : tmp = 11; break;
			case 'C' : tmp = 12; break;
			case 'D' : tmp = 13; break;
			case 'E' : tmp = 14; break;
			case 'F' : tmp = 15; break;
			default : tmp = hexadecimal.charAt(i-1)-'0'; break;
			}
			result+=tmp*(16*i);
		}
		System.out.println(result);
		
	}

}
