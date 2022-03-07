package baekjoon.bronze.bronze4;
//평균 점수
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i<5; i++){
            int temp = sc.nextInt();
            if(temp < 40) temp = 40;
            total+=temp;
        }
        System.out.println(total/5);
    }
}
