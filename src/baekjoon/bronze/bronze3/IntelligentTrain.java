package baekjoon.bronze.bronze3;
//지능형 기차
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntelligentTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        ArrayList<Integer> people = new ArrayList<>();
        for(int i = 0; i<4; i++){
            int getoff = sc.nextInt();
            int ride = sc.nextInt();

            result+=(ride - getoff);
            people.add(result);
        }

        System.out.println(Collections.max(people));;
    }
}
