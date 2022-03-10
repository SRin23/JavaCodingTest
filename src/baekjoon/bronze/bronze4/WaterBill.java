package baekjoon.bronze.bronze4;
//수도요금
import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xPay = sc.nextInt();
        int yDefault = sc.nextInt();
        int yMax = sc.nextInt();
        int yPay = sc.nextInt();
        int water = sc.nextInt();

        int[] monthWater = new int[2];
        monthWater[0] = water*xPay;
        if(water > yMax){
            monthWater[1] = yDefault + ((water-yMax)*yPay);
        }else{
            monthWater[1] = yDefault;
        }

        if(monthWater[0] >= monthWater[1]){
            System.out.println(monthWater[1]);
        }else{
            System.out.println(monthWater[0]);
        }

    }
}
