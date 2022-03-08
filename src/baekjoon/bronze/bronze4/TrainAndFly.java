package baekjoon.bronze.bronze4;
//폰 노이만과 파리
import java.util.Scanner;

public class TrainAndFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int D = sc.nextInt();

        int time = D/(S*2);
        System.out.println(T*time);
    }
}
