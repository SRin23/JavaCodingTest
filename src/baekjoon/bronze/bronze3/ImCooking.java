package baekjoon.bronze.bronze3;
//나는 요리사다
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ImCooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        ArrayList<Integer> maxArr = new ArrayList<>();

        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                score[i]+=sc.nextInt();
            }
            maxArr.add(score[i]);
        }

        int max = Collections.max(maxArr);

        System.out.println(maxArr.indexOf(max)+1);
        System.out.println(max);
    }
}
