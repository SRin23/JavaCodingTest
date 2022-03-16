package baekjoon.bronze.bronze5;
//달달함이 흘러 넘쳐
import java.util.Scanner;

public class Sweety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cake = new int[2][3];
        for(int i = 0; i<2; i++) {
            for(int j = 0;j<3; j++){
                cake[i][j] = sc.nextInt();
            }
        }

        System.out.print(cake[1][0] - cake[0][2]);
        System.out.print(" " + cake[1][1]/cake[0][1] + " ");
        System.out.print(cake[1][2]-cake[0][0]);
    }
}
