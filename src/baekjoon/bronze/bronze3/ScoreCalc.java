package baekjoon.bronze.bronze3;
//점수계산
import java.util.Scanner;

public class ScoreCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = 0;
        int part = 0;
        for(int i = 0; i<n; i++){
            int tmp = sc.nextInt();
            if(tmp==1) {
                part++;
                score+=part;
            }
            else {
                part = 0;
            }
        }
        System.out.println(score);
    }
}
