package baekjoon.bronze.bronze3;
//오각형, 오각형, 오각형...
import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        for(int i = 1; i<=n; i++){
            result+=5*i;
        }
        for(int i = 0;i<n-1; i++){
            result-=3+(2*i);
        }
        System.out.println(result%45678);
    }
}
