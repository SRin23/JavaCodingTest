package Baekjoon_Level5_Array;

//³ª¸ÓÁö
import java.util.Scanner;

public class RestValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		sc.close();
		
		for(int i = 0; i<10; i++) {
			for(int j = i; j<10; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i<9; i++) {
			if(arr[i] != arr[i+1]) result++;
		}
		System.out.println(result+1);
	}

}
