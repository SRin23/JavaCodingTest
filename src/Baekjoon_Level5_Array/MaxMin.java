package Baekjoon_Level5_Array;
//최소, 최대
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<n; i++) {
			if(max < arr[i]) max = arr[i];
			else if(min > arr[i]) min = arr[i];
		}
		System.out.println(min+ " " +max);
	}

}
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = sc.nextInt();
		int min = max;
		for(int i = 1; i<n; i++) {
			int tmp = sc.nextInt();
			if(tmp > max) max = tmp;
			else if(tmp < min) min = tmp;
		}
		System.out.println(min + " " + max);
	}

}
*/