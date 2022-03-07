package baekjoon.bronze.bronze4;
//Contest Timing
import java.util.Scanner;

public class ContestTiming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M<11){
            H--;
            M = M+60-11;
        }else{
            M = M-11;
        }

        if(H<11){
            D--;
            H = H+24-11;
        }else{
            H = H -11;
        }

        D = D-11;
        int result = (D*24*60) + (H*60) + M;
        if(result >= 0){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }
    }
}
