package baekjoon.level.level5;
//최댓값
import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i = 0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int idx = 0;
		int max = arr[0];
		for(int i = 0; i<9; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
	}

}
