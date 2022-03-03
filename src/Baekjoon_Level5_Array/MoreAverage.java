package Baekjoon_Level5_Array;
//평균은 넘겠지
import java.util.Scanner;

public class MoreAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i = 0; i<c; i++) {
			int n = sc.nextInt();
			int score[] = new int[n];
			double sum = 0;
			
			for(int j = 0; j<n; j++) {
				score[j] = sc.nextInt();
				sum+=score[j];
			}
			
			sc.close();
			double avg = sum/n;
			int result = 0;
			
			for(int j = 0; j<n; j++) {
				if(score[j] > avg) {
					result++;
				}
			}
			System.out.printf("%.3f", (double)result/n*100);
			System.out.println("%");
		}
	}

}
