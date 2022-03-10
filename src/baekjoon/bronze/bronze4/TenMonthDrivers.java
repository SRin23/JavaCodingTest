package baekjoon.bronze.bronze4;
//10부제
import java.util.Scanner;

public class TenMonthDrivers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int date = sc.nextInt();
        int result = 0;

        for(int i = 0; i<5; i++){
            int temp = sc.nextInt();
            if(temp%10==date){
                result++;
            }
        }

        System.out.println(result);
    }
}
