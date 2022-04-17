package baekjoon.bronze.bronze4;
//2 ÛãÙÍªËÓŞª­ª¤ïÚ? (The Second Largest Integer)
import java.util.Arrays;
import java.util.Scanner;

public class TheSecondLargestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
