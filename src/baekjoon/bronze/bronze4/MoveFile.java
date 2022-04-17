package baekjoon.bronze.bronze4;
//파일 옮기기
import java.util.Scanner;
public class MoveFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        second += sc.nextInt();
        first+=sc.nextInt();

        System.out.println(Math.min(first, second));
    }
}
