package baekjoon.bronze.bronze4;
//LaptopSticker
import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int laptopW = sc.nextInt();
        int laptopH = sc.nextInt();
        int stickerW = sc.nextInt()+2;
        int stickerH = sc.nextInt()+2;

        if(stickerW <= laptopW && stickerH <= laptopH) System.out.println(1);
        else System.out.println(0);
    }
}
