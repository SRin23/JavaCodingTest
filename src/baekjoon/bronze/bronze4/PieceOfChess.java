package baekjoon.bronze.bronze4;
//체스판 조각
import java.util.Scanner;

public class PieceOfChess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int row = 1;
		int col = 1;
		
		for(int i = 0; i<n; i++) {
			if(i%2==0) row++;
			else col++;
		}
		System.out.println(row*col);
		
	}

}
