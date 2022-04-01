package baekjoon.bronze.bronze4;
//ให? (Exam)
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        int sum = 0;
        for(int i = 0; i<3; i++){
            score[i] = sc.nextInt();
            sum+=score[i];
        }
        System.out.println(sum-Math.min(score[0], Math.min(score[1], score[2])));
    }
}
