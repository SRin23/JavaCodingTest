package baekjoon.bronze.bronze2;
//거스름돈
import java.util.Scanner;

public class Charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charge = 1000-sc.nextInt();
        int result = 0;

        while(charge>0){
            int value = 0;
            if(charge>=500) value = 500;
            else if(charge>=100) value = 100;
            else if(charge>=50) value = 50;
            else if(charge>=10) value = 10;
            else if(charge>=5) value = 5;
            else value = 1;
            result+=charge/value;
            charge = charge-(value*(charge/value));
        }
        System.out.println(result);
    }
}
