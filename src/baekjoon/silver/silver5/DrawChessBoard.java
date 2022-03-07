package baekjoon.level.silver5;
//체스판 그리기
import java.util.Scanner;

public class DrawChessBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		String chess[] = new String[width];
		for(int i = 0; i<width; i++) {
			for(int j = 0; j<height; j++) {
				chess[i] = sc.next();
			}
		}
		
		boolean flag = true;
		if(chess[0].charAt(0)=='B') {
			flag = false;
		}
	}

}
