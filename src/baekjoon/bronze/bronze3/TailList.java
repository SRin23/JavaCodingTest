package baekjoon.bronze.bronze3;
//꼬리를 무는 숫자 나열
import java.util.Scanner;
import static java.lang.Math.abs;

public class TailList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] value = new int[2];
        int[] remain = new int[2];
        for(int i = 0; i<2; i++){
            int x = sc.nextInt();
            if(x%4==0) {
                value[i] = (x/4)-1;
                remain[i] = 4;
            }else{
                value[i] = x/4;
                remain[i] = x%4;
            }
        }
        System.out.println(abs(value[0] - value[1]) + abs(remain[0] - remain[1]));
    }
}
