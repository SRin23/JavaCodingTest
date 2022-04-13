package baekjoon.bronze.bronze3;
//½Ã±×¸¶
import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a>=b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long result = (b+a)*(b-a+1)/2;
        System.out.println(result);
    }
}
