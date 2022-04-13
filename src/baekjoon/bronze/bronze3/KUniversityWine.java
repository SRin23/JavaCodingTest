package baekjoon.bronze.bronze3;
//고려대학교에는 공식 와인이 있다
import java.util.Scanner;

public class KUniversityWine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();

        int wine = 0;
        for(int i = 1; i<=c; i++) {
            wine+=(k*i)+(p*Math.pow(i, 2));
        }
        System.out.println(wine);
    }
}
