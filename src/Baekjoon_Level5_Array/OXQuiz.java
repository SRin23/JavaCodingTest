package Baekjoon_Level5_Array;
//OX ДыБо
import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ox[] = new String[n];
		
		for(int i = 0; i<n; i++) {
			ox[i] = sc.next();
		}
		sc.close();
		
		int score[] = new int[n];
		for(int i = 0; i<n; i++) {
			int temp = 0;
			for(int j = 0; j<ox[i].length(); j++) {
				if(ox[i].charAt(j)!='O') {
					temp = 0;
				}else {
					temp++;
				}
				score[i]+=temp;
			}
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(score[i]);
		}
	}

}
