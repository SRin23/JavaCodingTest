package baekjoon.others;
//조화평균
import java.util.Scanner;

public class HermonyAverage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLong();
        }

        //값들의 최소공배수 구하기
        long result = arr[0];
        for(int i=0;i<n;i++) {
            result =lcm(result,arr[i]);
        }

        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=result/arr[i];
        }

        System.out.println(result + "/" + sum);
    }
    public static long gcd(long a, long b){
        while(b!=0){
            long r = a%b;
            a= b;
            b= r;
        }
        return a;
    }

    public static long lcm(long a, long b){
        return a * b / gcd(a,b);
    }
}
