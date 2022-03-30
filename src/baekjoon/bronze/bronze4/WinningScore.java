package baekjoon.bronze.bronze4;
//Winning Score
import java.util.Scanner;

public class WinningScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[2][3];

        int[] team = new int[2];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                scores[i][j] = sc.nextInt();
            }
        }

        for(int j = 0;j<2; j++){
            for(int i = 0; i<3; i++){
                int score = 0;
                switch(i){
                    case 0 : score = 3; break;
                    case 1 : score = 2; break;
                    case 2 : score = 1; break;
                }
                team[j] += scores[j][i]*score;
            }
        }

        if(team[0] > team[1]) System.out.println('A');
        else if(team[0] < team[1]) System.out.println('B');
        else System.out.println('T');
    }
}
