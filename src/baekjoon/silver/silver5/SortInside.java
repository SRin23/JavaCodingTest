package baekjoon.silver.silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//소트 인사이드
public class SortInside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = Long.toString(sc.nextLong()).split("");
        Arrays.sort(values, Collections.reverseOrder());
        System.out.println(Long.parseLong(String.join("", values)));
    }
}
