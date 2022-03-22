package baekjoon.bronze.bronze1;

//배열 합치기
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCombine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+m];
        for(int i = 0; i<n+m; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i<n+m; i++){
            System.out.print(arr[i] + " ");;
        }
    }
}
