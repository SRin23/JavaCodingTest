package baekjoon.bronze.bronze3;
//ºº≈πº“ ªÁ¿Â µø«ı
import java.util.Scanner;

public class LaundryDonhuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            int charge = sc.nextInt();
            while(charge > 0){
                if(charge >= 25){
                    quarter = charge/25;
                    charge = charge-quarter*25;
                }else if(charge >= 10){
                    dime = charge/10;
                    charge = charge-dime*10;
                }else if(charge >= 5){
                    nickel = charge/5;
                    charge = charge-nickel*5;
                }else{
                    penny = charge;
                    charge = charge-penny;
                }
            }
            System.out.print(quarter + " ");
            System.out.print(dime + " ");
            System.out.print(nickel + " ");
            System.out.println(penny);
        }
    }
}
