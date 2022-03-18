package baekjoon.bronze.bronze1;
//나머지와 몫이 같은 수
import java.util.Scanner;

public class RemainderAndValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(long i = 1; i<n; i++){
            sum+=(n+1)*i;
        }
        System.out.println(sum);
    }
}
