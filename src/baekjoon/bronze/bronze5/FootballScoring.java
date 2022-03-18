package baekjoon.bronze.bronze5;
//Football Scoring
import java.util.Scanner;

public class FootballScoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<2; i++){
            System.out.print(sc.nextInt()*6 + sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt() + sc.nextInt()*2 + " ");
        }
    }
}
