package baekjoon.bronze.bronze2;
//만취한 상범
import java.util.Arrays;
import java.util.Scanner;

public class AlcolSangBum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k<t; k++){
            int n = sc.nextInt();
            boolean[] flag = new boolean[n];

            //flag의 모든 배열 요소를 false로 초기화
            Arrays.fill(flag, false);

            for(int i = 1; i<=n; i++){
                for(int j = 0; j<n; j++){
                    if((j+1)%i==0){
                        flag[j] = !flag[j];
                    }
                }
            }

            int result = 0;
            for(int i = 0; i<n; i++){
                if(flag[i]==true){
                    result++;
                }
            }

            System.out.println(result);
        }

    }
}
