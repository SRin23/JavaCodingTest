package baekjoon.bronze.bronze1;

//µÚÁýÈù µ¡¼À
import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());
        int y = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());

        int sum = Integer.parseInt(new StringBuffer(Integer.toString(x+y)).reverse().toString());
        System.out.println(sum);
    }
}
