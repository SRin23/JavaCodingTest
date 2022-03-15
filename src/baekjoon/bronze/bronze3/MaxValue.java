package baekjoon.bronze.bronze3;
//2566최댓값
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<81; i++){
            arr.add(sc.nextInt());
        }

        int max = Collections.max(arr);
        int idx = arr.indexOf(max);
        System.out.println(max);
        System.out.println(((idx/9)+1) + " " + ((idx%9)+1));
    }
}
