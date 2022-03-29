package baekjoon.bronze.bronze3;

import java.util.*;

public class ForthDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> dotX = new ArrayList<>();
        List<Integer> dotY = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            dotX.add(sc.nextInt());
            dotY.add(sc.nextInt());
        }
        Collections.sort(dotX);
        Collections.sort(dotY);

        for (int i = 0; i < dotX.size() - 1; i++) {
            if (dotX.get(i) != dotX.get(i + 1)) {
                System.out.println(dotX.get(i + 1));
            }
            if (dotY.get(i) != dotY.get(i + 1)) {
                System.out.println(dotY.get(i + 1));
            }
        }
    }
}
