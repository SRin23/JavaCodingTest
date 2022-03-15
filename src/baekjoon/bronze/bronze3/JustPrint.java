package baekjoon.bronze.bronze3;
//그대로 출력하기
import java.util.Scanner;

public class JustPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
