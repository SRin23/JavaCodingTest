package baekjoon.level.level2;
//주사위 세개
/*
1==2==3

1,2  /  3
1,3  /  2
2,3  /  1

1  /  2  /  3
 */

import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		sc.close();
		
		int result = 0;
		if(one==two) {
			if(two==three) result = 10000 + one*1000;
			else result = 1000+one*100;
		}
		else{	
			if(two==three || one==three) {
				result = 1000+three*100;
			}
			else {
				result = Max(one, two, three)*100;
			}
		}
		System.out.println(result);
	}
	public static int Max(int a, int b, int c) {
		if(a<b) {
			if(b<c) return c;
			else return b;
		}else {
			if(a<c) return c;
			else return a;
		}
	}
}
