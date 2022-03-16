package baekjoon.bronze.bronze1;
//그대로 출력하기2
import java.util.Scanner;

public class JustPrint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
