package baekjoon.bronze.bronze4;
//전자레인지
import java.util.Scanner;

public class Microwave2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int resultSec = 0;

        boolean flag;
        if(a > 0) flag = true;
        else flag = false;

        while(a!=b){
            if(a < 0) {
                resultSec += (0-a)*c;
                a = 0;
            }
            else if(a>=0&&flag) {
                resultSec += (b-a)*e;
                a = b;
            }
            else{
                resultSec += d;
                flag = true;
            }
        }
        System.out.println(resultSec);
    }
}
