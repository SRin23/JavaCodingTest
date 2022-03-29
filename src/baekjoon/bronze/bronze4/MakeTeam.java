package baekjoon.bronze.bronze4;
//ÆÀ ³ª´©±â
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakeTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> arr = new ArrayList<>();
        for(int i = 0; i<4; i++){
            arr.add(sc.nextLong());
        }
        Collections.sort(arr);
        System.out.println(Math.abs((arr.get(0)+arr.get(3))- (arr.get(1)+arr.get(2))));
    }
}
