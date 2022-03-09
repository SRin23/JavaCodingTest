package baekjoon.bronze.bronze3;
//핸드폰 요금
import java.util.Scanner;

public class PhonePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = 0;
        int youngPay = 0;
        int minPay = 0;

        for(int i = 0; i<n; i++){
            time=sc.nextInt();
            youngPay += young(time);
            minPay += min(time);
        }

        if(youngPay > minPay){
            System.out.println("M " + minPay);
        }else if(youngPay < minPay){
            System.out.println("Y " + youngPay);
        }else{
            System.out.println("Y M " + youngPay);
        }

    }

    public static int young(int time){
        return (time/30 + 1)*10;
    }

    public static int min(int time){
        return (time/60 + 1)*15;
    }

}
