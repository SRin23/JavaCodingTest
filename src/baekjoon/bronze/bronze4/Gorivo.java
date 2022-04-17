package baekjoon.bronze.bronze4;
//Gorivo
import java.util.Scanner;

public class Gorivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        //1∞∂∑± : 3.785411784
        //1∏∂¿œ : 1.609344
        double KM = 100.0/(x*(1.609344/3.785411784));
        System.out.println(KM);
    }
}
