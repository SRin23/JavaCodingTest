package baekjoon.silver.silver5;
//소수찾기
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i<n; i++){
            boolean flag = true;
            if(arr[i]>1){
                for(int j = 2; j<arr[i]; j++){
                    if(arr[i]%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
