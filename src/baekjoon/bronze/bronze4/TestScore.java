package baekjoon.bronze.bronze4;
//시험 점수
import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] total = new int[2];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<4; j++){
                total[i] += sc.nextInt();
            }
        }

        if(total[0] >= total[1]) System.out.println(total[0]);
        else System.out.println(total[1]);

    }
}
