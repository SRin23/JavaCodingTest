package baekjoon.bronze.bronze3;
//치킨 두마리
import java.util.Scanner;

public class TwoChickens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bankBook = sc.nextInt()+sc.nextInt();
        int chicken = sc.nextInt()*2;
        if(chicken<=bankBook) System.out.println(bankBook-chicken);
        else System.out.println(bankBook);
    }
}
