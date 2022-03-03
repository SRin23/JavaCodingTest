package Baekjoon_Level5_Array;
//���
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n];
		for(int i = 0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		int max = score[0];
		for(int i = 0; i<n; i++) {
			if(max < score[i]) max = score[i];
		}

		double result = 0;
		for(int i = 0; i<n; i++) {
			result += (double)score[i]/max*100;	//����ȯ ����!!
		}
		
		System.out.println(result/n);
	}

}
