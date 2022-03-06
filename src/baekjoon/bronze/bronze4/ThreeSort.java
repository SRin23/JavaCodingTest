package baekjoon.bronze.bronze4;
//세수 정렬
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
	}

}
