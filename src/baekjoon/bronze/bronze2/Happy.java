package baekjoon.bronze.bronze2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long student = sc.nextLong();
        ArrayList<Integer> scores = new ArrayList<>();

        for(int i = 0; i<student; i++){
            scores.add(sc.nextInt());
        }

        Collections.sort(scores);

        System.out.println(scores.get((int) (student-1)) - scores.get(0));
    }
}
