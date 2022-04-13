package baekjoon.bronze.bronze4;
//Л╧тя (Moving)
import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if((x*10)+(y*10)<=(z*10)+5){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
