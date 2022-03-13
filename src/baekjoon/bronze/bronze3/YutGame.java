package baekjoon.bronze.bronze3;
//윷놀이
import java.util.Scanner;

public class YutGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] yut = new int[3][4];
        for(int i = 0; i<yut.length; i++){
            int check = 0;
            for(int j = 0; j<yut[i].length; j++){
                yut[i][j] = sc.nextInt();
                if(yut[i][j]==0){
                    check++;
                }
            }
            char result;
            switch (check){
                case 1 : result = 'A'; break;
                case 2 : result = 'B'; break;
                case 3 : result = 'C'; break;
                case 4 : result = 'D'; break;
                case 0 : result = 'E'; break;
                default : result = ' '; break;
            }
            System.out.println(result);
        }

    }
}
