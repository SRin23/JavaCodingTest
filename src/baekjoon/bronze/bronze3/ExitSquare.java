package baekjoon.bronze.bronze3;
//직사각형에서 탈출
import java.util.Scanner;

public class ExitSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int width = Distance(x, w);	//현재 위치와 가로축에서의 최소거리
		int height = Distance(y, h);//현재 위치와 세로축에서의 최소거리
		
		//가로와 세로 중 더 짧은 최소 거리 구하기
		if(height < width) System.out.println(height);
		else System.out.println(width);
	}
	
	//직사각형 경계와 현재 위치 사이의 최소 거리 구하기
	//m은 현재 위치, len은 직사각형의 길이(가로/세로)
	public static int Distance(int m, int len) {
		int result = 0;
		if(m > len/2) {
			result = len-m;
		}else {
			result = m;
		}
		return result;
	}
}
