package baekjoon.bronze.bronze4;
//과자
import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = K*N-M;
        if(result>=0){
            System.out.println(result);
        }else{
            System.out.println(0);
        }

    }
}
