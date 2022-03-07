package baekjoon.bronze.bronze4;
//Which Alien
import java.util.Scanner;

public class WhichAlien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int antenna = sc.nextInt();
        int eyes = sc.nextInt();

        //TroyMartian(최소 3개 안테나, 최대 4개 눈)
        if(antenna >= 3 && eyes <= 4) System.out.println("TroyMartian");
        //VladSaturnian(최대 6개 안테나, 최소 2개눈)
        if(antenna <= 6 && eyes >= 2) System.out.println("VladSaturnian");
        //GraemeMercurian(최대 2개 안테나 최대 3개눈)
        if(antenna <= 2 && eyes <= 3) System.out.println("GraemeMercurian");
    }
}
