package baekjoon.silver.silver5;
//0ÀÇ °³¼ö
import java.util.Scanner;

public class ZeroNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int zero = 0;
            for(int j = n; j<=m; j++){
                int tmp = j;
                if(tmp==0) zero++;
                while(tmp>1){
                    if(tmp%10==0){
                        zero++;
                    }
                    tmp/=10;
                }
            }
            System.out.println(zero);
        }
    }
}
